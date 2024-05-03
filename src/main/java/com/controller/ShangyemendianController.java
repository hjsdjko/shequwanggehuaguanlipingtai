
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
 * 商业门店
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shangyemendian")
public class ShangyemendianController {
    private static final Logger logger = LoggerFactory.getLogger(ShangyemendianController.class);

    private static final String TABLE_NAME = "shangyemendian";

    @Autowired
    private ShangyemendianService shangyemendianService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DanweiService danweiService;//单位
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
        PageUtils page = shangyemendianService.queryPage(params);

        //字典表数据转换
        List<ShangyemendianView> list =(List<ShangyemendianView>)page.getList();
        for(ShangyemendianView c:list){
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
        ShangyemendianEntity shangyemendian = shangyemendianService.selectById(id);
        if(shangyemendian !=null){
            //entity转view
            ShangyemendianView view = new ShangyemendianView();
            BeanUtils.copyProperties( shangyemendian , view );//把实体数据重构到view中
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
    public R save(@RequestBody ShangyemendianEntity shangyemendian, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shangyemendian:{}",this.getClass().getName(),shangyemendian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ShangyemendianEntity> queryWrapper = new EntityWrapper<ShangyemendianEntity>()
            .eq("shangyemendian_name", shangyemendian.getShangyemendianName())
            .eq("shangyemendian_address", shangyemendian.getShangyemendianAddress())
            .eq("shangyemendian_types", shangyemendian.getShangyemendianTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangyemendianEntity shangyemendianEntity = shangyemendianService.selectOne(queryWrapper);
        if(shangyemendianEntity==null){
            shangyemendian.setCreateTime(new Date());
            shangyemendianService.insert(shangyemendian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShangyemendianEntity shangyemendian, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,shangyemendian:{}",this.getClass().getName(),shangyemendian.toString());
        ShangyemendianEntity oldShangyemendianEntity = shangyemendianService.selectById(shangyemendian.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(shangyemendian.getShangyemendianPhoto()) || "null".equals(shangyemendian.getShangyemendianPhoto())){
                shangyemendian.setShangyemendianPhoto(null);
        }

            shangyemendianService.updateById(shangyemendian);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ShangyemendianEntity> oldShangyemendianList =shangyemendianService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        shangyemendianService.deleteBatchIds(Arrays.asList(ids));

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
            List<ShangyemendianEntity> shangyemendianList = new ArrayList<>();//上传的东西
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
                            ShangyemendianEntity shangyemendianEntity = new ShangyemendianEntity();
//                            shangyemendianEntity.setShangyemendianName(data.get(0));                    //商业门店名称 要改的
//                            shangyemendianEntity.setShangyemendianUuidNumber(data.get(0));                    //商业门店编号 要改的
//                            shangyemendianEntity.setShangyemendianPhoto("");//详情和图片
//                            shangyemendianEntity.setShangyemendianAddress(data.get(0));                    //具体位置 要改的
//                            shangyemendianEntity.setShangyemendianTypes(Integer.valueOf(data.get(0)));   //商业门店类型 要改的
//                            shangyemendianEntity.setShangyemendianContent("");//详情和图片
//                            shangyemendianEntity.setCreateTime(date);//时间
                            shangyemendianList.add(shangyemendianEntity);


                            //把要查询是否重复的字段放入map中
                                //商业门店编号
                                if(seachFields.containsKey("shangyemendianUuidNumber")){
                                    List<String> shangyemendianUuidNumber = seachFields.get("shangyemendianUuidNumber");
                                    shangyemendianUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shangyemendianUuidNumber = new ArrayList<>();
                                    shangyemendianUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shangyemendianUuidNumber",shangyemendianUuidNumber);
                                }
                        }

                        //查询是否重复
                         //商业门店编号
                        List<ShangyemendianEntity> shangyemendianEntities_shangyemendianUuidNumber = shangyemendianService.selectList(new EntityWrapper<ShangyemendianEntity>().in("shangyemendian_uuid_number", seachFields.get("shangyemendianUuidNumber")));
                        if(shangyemendianEntities_shangyemendianUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShangyemendianEntity s:shangyemendianEntities_shangyemendianUuidNumber){
                                repeatFields.add(s.getShangyemendianUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [商业门店编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shangyemendianService.insertBatch(shangyemendianList);
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
        PageUtils page = shangyemendianService.queryPage(params);

        //字典表数据转换
        List<ShangyemendianView> list =(List<ShangyemendianView>)page.getList();
        for(ShangyemendianView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShangyemendianEntity shangyemendian = shangyemendianService.selectById(id);
            if(shangyemendian !=null){


                //entity转view
                ShangyemendianView view = new ShangyemendianView();
                BeanUtils.copyProperties( shangyemendian , view );//把实体数据重构到view中

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
    public R add(@RequestBody ShangyemendianEntity shangyemendian, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shangyemendian:{}",this.getClass().getName(),shangyemendian.toString());
        Wrapper<ShangyemendianEntity> queryWrapper = new EntityWrapper<ShangyemendianEntity>()
            .eq("shangyemendian_name", shangyemendian.getShangyemendianName())
            .eq("shangyemendian_uuid_number", shangyemendian.getShangyemendianUuidNumber())
            .eq("shangyemendian_address", shangyemendian.getShangyemendianAddress())
            .eq("shangyemendian_types", shangyemendian.getShangyemendianTypes())
//            .notIn("shangyemendian_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangyemendianEntity shangyemendianEntity = shangyemendianService.selectOne(queryWrapper);
        if(shangyemendianEntity==null){
            shangyemendian.setCreateTime(new Date());
        shangyemendianService.insert(shangyemendian);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

