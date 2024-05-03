package com.dao;

import com.entity.ShangyemendianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangyemendianView;

/**
 * 商业门店 Dao 接口
 *
 * @author 
 */
public interface ShangyemendianDao extends BaseMapper<ShangyemendianEntity> {

   List<ShangyemendianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
