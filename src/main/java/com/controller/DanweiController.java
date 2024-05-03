
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 单位
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/danwei")
public class DanweiController {
    private static final Logger logger = LoggerFactory.getLogger(DanweiController.class);

    private static final String TABLE_NAME = "danwei";

    @Autowired
    private DanweiService danweiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ExampaperService exampaperService;//问卷调查
    @Autowired
    private ExampapertopicService exampapertopicService;//问卷调查选题
    @Autowired
    private ExamquestionService examquestionService;//试题表
    @Autowired
    private ExamrecordService examrecordService;//调查记录表
    @Autowired
    private ExamredetailsService examredetailsService;//答题详情表
    @Autowired
    private ExamrewrongquestionService examrewrongquestionService;//错题表
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private LiuyanService liuyanService;//意见征集
    @Autowired
    private ShangyemendianService shangyemendianService;//商业门店
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = danweiService.queryPage(params);

        //字典表数据转换
        List<DanweiView> list =(List<DanweiView>)page.getList();
        for(DanweiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DanweiEntity danwei = danweiService.selectById(id);
        if(danwei !=null){
            //entity转view
            DanweiView view = new DanweiView();
            BeanUtils.copyProperties( danwei , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody DanweiEntity danwei, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,danwei:{}",this.getClass().getName(),danwei.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<DanweiEntity> queryWrapper = new EntityWrapper<DanweiEntity>()
            .eq("danwei_name", danwei.getDanweiName())
            .eq("danwei_address", danwei.getDanweiAddress())
            .eq("danwei_types", danwei.getDanweiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DanweiEntity danweiEntity = danweiService.selectOne(queryWrapper);
        if(danweiEntity==null){
            danwei.setCreateTime(new Date());
            danweiService.insert(danwei);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DanweiEntity danwei, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,danwei:{}",this.getClass().getName(),danwei.toString());
        DanweiEntity oldDanweiEntity = danweiService.selectById(danwei.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(danwei.getDanweiPhoto()) || "null".equals(danwei.getDanweiPhoto())){
                danwei.setDanweiPhoto(null);
        }

            danweiService.updateById(danwei);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<DanweiEntity> oldDanweiList =danweiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        danweiService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<DanweiEntity> danweiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            DanweiEntity danweiEntity = new DanweiEntity();
//                            danweiEntity.setDanweiName(data.get(0));                    //单位名称 要改的
//                            danweiEntity.setDanweiUuidNumber(data.get(0));                    //单位编号 要改的
//                            danweiEntity.setDanweiPhoto("");//详情和图片
//                            danweiEntity.setDanweiAddress(data.get(0));                    //单位位置 要改的
//                            danweiEntity.setDanweiTypes(Integer.valueOf(data.get(0)));   //单位类型 要改的
//                            danweiEntity.setDanweiContent("");//详情和图片
//                            danweiEntity.setCreateTime(date);//时间
                            danweiList.add(danweiEntity);


                            //把要查询是否重复的字段放入map中
                                //单位编号
                                if(seachFields.containsKey("danweiUuidNumber")){
                                    List<String> danweiUuidNumber = seachFields.get("danweiUuidNumber");
                                    danweiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> danweiUuidNumber = new ArrayList<>();
                                    danweiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("danweiUuidNumber",danweiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //单位编号
                        List<DanweiEntity> danweiEntities_danweiUuidNumber = danweiService.selectList(new EntityWrapper<DanweiEntity>().in("danwei_uuid_number", seachFields.get("danweiUuidNumber")));
                        if(danweiEntities_danweiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(DanweiEntity s:danweiEntities_danweiUuidNumber){
                                repeatFields.add(s.getDanweiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [单位编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        danweiService.insertBatch(danweiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = danweiService.queryPage(params);

        //字典表数据转换
        List<DanweiView> list =(List<DanweiView>)page.getList();
        for(DanweiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DanweiEntity danwei = danweiService.selectById(id);
            if(danwei !=null){


                //entity转view
                DanweiView view = new DanweiView();
                BeanUtils.copyProperties( danwei , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody DanweiEntity danwei, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,danwei:{}",this.getClass().getName(),danwei.toString());
        Wrapper<DanweiEntity> queryWrapper = new EntityWrapper<DanweiEntity>()
            .eq("danwei_name", danwei.getDanweiName())
            .eq("danwei_uuid_number", danwei.getDanweiUuidNumber())
            .eq("danwei_address", danwei.getDanweiAddress())
            .eq("danwei_types", danwei.getDanweiTypes())
//            .notIn("danwei_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DanweiEntity danweiEntity = danweiService.selectOne(queryWrapper);
        if(danweiEntity==null){
            danwei.setCreateTime(new Date());
        danweiService.insert(danwei);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

