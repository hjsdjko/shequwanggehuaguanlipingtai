package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DanweiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 单位
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("danwei")
public class DanweiView extends DanweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 单位类型的值
	*/
	@ColumnInfo(comment="单位类型的字典表值",type="varchar(200)")
	private String danweiValue;




	public DanweiView() {

	}

	public DanweiView(DanweiEntity danweiEntity) {
		try {
			BeanUtils.copyProperties(this, danweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 单位类型的值
	*/
	public String getDanweiValue() {
		return danweiValue;
	}
	/**
	* 设置： 单位类型的值
	*/
	public void setDanweiValue(String danweiValue) {
		this.danweiValue = danweiValue;
	}




	@Override
	public String toString() {
		return "DanweiView{" +
			", danweiValue=" + danweiValue +
			"} " + super.toString();
	}
}
