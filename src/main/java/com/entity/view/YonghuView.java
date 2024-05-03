package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 用户
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yonghu")
public class YonghuView extends YonghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 性别的值
	*/
	@ColumnInfo(comment="性别的字典表值",type="varchar(200)")
	private String sexValue;
	/**
	* 人口状态的值
	*/
	@ColumnInfo(comment="人口状态的字典表值",type="varchar(200)")
	private String renkouzhuangtaiValue;
	/**
	* 小区的值
	*/
	@ColumnInfo(comment="小区的字典表值",type="varchar(200)")
	private String xiaoquValue;
	/**
	* 身体状况的值
	*/
	@ColumnInfo(comment="身体状况的字典表值",type="varchar(200)")
	private String shentiValue;
	/**
	* 单位的值
	*/
	@ColumnInfo(comment="单位的字典表值",type="varchar(200)")
	private String danweileixingValue;




	public YonghuView() {

	}

	public YonghuView(YonghuEntity yonghuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 性别的值
	*/
	public String getSexValue() {
		return sexValue;
	}
	/**
	* 设置： 性别的值
	*/
	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}
	//当前表的
	/**
	* 获取： 人口状态的值
	*/
	public String getRenkouzhuangtaiValue() {
		return renkouzhuangtaiValue;
	}
	/**
	* 设置： 人口状态的值
	*/
	public void setRenkouzhuangtaiValue(String renkouzhuangtaiValue) {
		this.renkouzhuangtaiValue = renkouzhuangtaiValue;
	}
	//当前表的
	/**
	* 获取： 小区的值
	*/
	public String getXiaoquValue() {
		return xiaoquValue;
	}
	/**
	* 设置： 小区的值
	*/
	public void setXiaoquValue(String xiaoquValue) {
		this.xiaoquValue = xiaoquValue;
	}
	//当前表的
	/**
	* 获取： 身体状况的值
	*/
	public String getShentiValue() {
		return shentiValue;
	}
	/**
	* 设置： 身体状况的值
	*/
	public void setShentiValue(String shentiValue) {
		this.shentiValue = shentiValue;
	}
	//当前表的
	/**
	* 获取： 单位的值
	*/
	public String getDanweileixingValue() {
		return danweileixingValue;
	}
	/**
	* 设置： 单位的值
	*/
	public void setDanweileixingValue(String danweileixingValue) {
		this.danweileixingValue = danweileixingValue;
	}




	@Override
	public String toString() {
		return "YonghuView{" +
			", sexValue=" + sexValue +
			", renkouzhuangtaiValue=" + renkouzhuangtaiValue +
			", xiaoquValue=" + xiaoquValue +
			", shentiValue=" + shentiValue +
			", danweileixingValue=" + danweileixingValue +
			"} " + super.toString();
	}
}
