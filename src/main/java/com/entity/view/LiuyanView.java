package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.LiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 意见征集
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("liuyan")
public class LiuyanView extends LiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 年龄
		*/

		@ColumnInfo(comment="年龄",type="int(11)")
		private Integer age;
		/**
		* 人口状态
		*/
		@ColumnInfo(comment="人口状态",type="int(11)")
		private Integer renkouzhuangtaiTypes;
			/**
			* 人口状态的值
			*/
			@ColumnInfo(comment="人口状态的字典表值",type="varchar(200)")
			private String renkouzhuangtaiValue;
		/**
		* 小区
		*/
		@ColumnInfo(comment="小区",type="int(11)")
		private Integer xiaoquTypes;
			/**
			* 小区的值
			*/
			@ColumnInfo(comment="小区的字典表值",type="varchar(200)")
			private String xiaoquValue;
		/**
		* 身体状况
		*/
		@ColumnInfo(comment="身体状况",type="int(11)")
		private Integer shentiTypes;
			/**
			* 身体状况的值
			*/
			@ColumnInfo(comment="身体状况的字典表值",type="varchar(200)")
			private String shentiValue;
		/**
		* 单位
		*/
		@ColumnInfo(comment="单位",type="int(11)")
		private Integer danweileixingTypes;
			/**
			* 单位的值
			*/
			@ColumnInfo(comment="单位的字典表值",type="varchar(200)")
			private String danweileixingValue;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public LiuyanView() {

	}

	public LiuyanView(LiuyanEntity liuyanEntity) {
		try {
			BeanUtils.copyProperties(this, liuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 年龄
		*/
		public Integer getAge() {
			return age;
		}
		/**
		* 设置： 年龄
		*/
		public void setAge(Integer age) {
			this.age = age;
		}
		/**
		* 获取： 人口状态
		*/
		public Integer getRenkouzhuangtaiTypes() {
			return renkouzhuangtaiTypes;
		}
		/**
		* 设置： 人口状态
		*/
		public void setRenkouzhuangtaiTypes(Integer renkouzhuangtaiTypes) {
			this.renkouzhuangtaiTypes = renkouzhuangtaiTypes;
		}


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
		/**
		* 获取： 小区
		*/
		public Integer getXiaoquTypes() {
			return xiaoquTypes;
		}
		/**
		* 设置： 小区
		*/
		public void setXiaoquTypes(Integer xiaoquTypes) {
			this.xiaoquTypes = xiaoquTypes;
		}


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
		/**
		* 获取： 身体状况
		*/
		public Integer getShentiTypes() {
			return shentiTypes;
		}
		/**
		* 设置： 身体状况
		*/
		public void setShentiTypes(Integer shentiTypes) {
			this.shentiTypes = shentiTypes;
		}


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
		/**
		* 获取： 单位
		*/
		public Integer getDanweileixingTypes() {
			return danweileixingTypes;
		}
		/**
		* 设置： 单位
		*/
		public void setDanweileixingTypes(Integer danweileixingTypes) {
			this.danweileixingTypes = danweileixingTypes;
		}


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

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "LiuyanView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", age=" + age +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
