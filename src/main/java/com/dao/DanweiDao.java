package com.dao;

import com.entity.DanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DanweiView;

/**
 * 单位 Dao 接口
 *
 * @author 
 */
public interface DanweiDao extends BaseMapper<DanweiEntity> {

   List<DanweiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
