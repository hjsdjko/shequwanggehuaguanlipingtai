package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShangyemendianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 商业门店
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shangyemendian")
public class ShangyemendianView extends ShangyemendianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 商业门店类型的值
	*/
	@ColumnInfo(comment="商业门店类型的字典表值",type="varchar(200)")
	private String shangyemendianValue;




	public ShangyemendianView() {

	}

	public ShangyemendianView(ShangyemendianEntity shangyemendianEntity) {
		try {
			BeanUtils.copyProperties(this, shangyemendianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 商业门店类型的值
	*/
	public String getShangyemendianValue() {
		return shangyemendianValue;
	}
	/**
	* 设置： 商业门店类型的值
	*/
	public void setShangyemendianValue(String shangyemendianValue) {
		this.shangyemendianValue = shangyemendianValue;
	}




	@Override
	public String toString() {
		return "ShangyemendianView{" +
			", shangyemendianValue=" + shangyemendianValue +
			"} " + super.toString();
	}
}
