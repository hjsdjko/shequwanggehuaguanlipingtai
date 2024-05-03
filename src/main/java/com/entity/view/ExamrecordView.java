package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ExamrecordEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 调查记录表
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("examrecord")
public class ExamrecordView extends ExamrecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 问卷调查
		/**
		* 问卷调查名称
		*/

		@ColumnInfo(comment="问卷调查名称",type="varchar(200)")
		private String exampaperName;
		/**
		* 调查时长(分钟)
		*/

		@ColumnInfo(comment="调查时长(分钟)",type="int(11)")
		private Integer exampaperDate;
		/**
		* 问卷调查总分数
		*/

		@ColumnInfo(comment="问卷调查总分数",type="int(20)")
		private Integer exampaperMyscore;
		/**
		* 科目
		*/
		@ColumnInfo(comment="科目",type="int(11)")
		private Integer kemuTypes;
			/**
			* 科目的值
			*/
			@ColumnInfo(comment="科目的字典表值",type="varchar(200)")
			private String kemuValue;
		/**
		* 问卷调查状态
		*/
		@ColumnInfo(comment="问卷调查状态",type="int(11)")
		private Integer exampaperTypes;
			/**
			* 问卷调查状态的值
			*/
			@ColumnInfo(comment="问卷调查状态的字典表值",type="varchar(200)")
			private String exampaperValue;
		/**
		* 组卷方式
		*/
		@ColumnInfo(comment="组卷方式",type="int(11)")
		private Integer zujuanTypes;
			/**
			* 组卷方式的值
			*/
			@ColumnInfo(comment="组卷方式的字典表值",type="varchar(200)")
			private String zujuanValue;
		/**
		* 逻辑删除（1代表未删除 2代表已删除）
		*/

		@ColumnInfo(comment="逻辑删除（1代表未删除 2代表已删除）",type="int(255)")
		private Integer exampaperDelete;
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



	public ExamrecordView() {

	}

	public ExamrecordView(ExamrecordEntity examrecordEntity) {
		try {
			BeanUtils.copyProperties(this, examrecordEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 问卷调查

		/**
		* 获取： 问卷调查名称
		*/
		public String getExampaperName() {
			return exampaperName;
		}
		/**
		* 设置： 问卷调查名称
		*/
		public void setExampaperName(String exampaperName) {
			this.exampaperName = exampaperName;
		}

		/**
		* 获取： 调查时长(分钟)
		*/
		public Integer getExampaperDate() {
			return exampaperDate;
		}
		/**
		* 设置： 调查时长(分钟)
		*/
		public void setExampaperDate(Integer exampaperDate) {
			this.exampaperDate = exampaperDate;
		}

		/**
		* 获取： 问卷调查总分数
		*/
		public Integer getExampaperMyscore() {
			return exampaperMyscore;
		}
		/**
		* 设置： 问卷调查总分数
		*/
		public void setExampaperMyscore(Integer exampaperMyscore) {
			this.exampaperMyscore = exampaperMyscore;
		}
		/**
		* 获取： 科目
		*/
		public Integer getKemuTypes() {
			return kemuTypes;
		}
		/**
		* 设置： 科目
		*/
		public void setKemuTypes(Integer kemuTypes) {
			this.kemuTypes = kemuTypes;
		}


			/**
			* 获取： 科目的值
			*/
			public String getKemuValue() {
				return kemuValue;
			}
			/**
			* 设置： 科目的值
			*/
			public void setKemuValue(String kemuValue) {
				this.kemuValue = kemuValue;
			}
		/**
		* 获取： 问卷调查状态
		*/
		public Integer getExampaperTypes() {
			return exampaperTypes;
		}
		/**
		* 设置： 问卷调查状态
		*/
		public void setExampaperTypes(Integer exampaperTypes) {
			this.exampaperTypes = exampaperTypes;
		}


			/**
			* 获取： 问卷调查状态的值
			*/
			public String getExampaperValue() {
				return exampaperValue;
			}
			/**
			* 设置： 问卷调查状态的值
			*/
			public void setExampaperValue(String exampaperValue) {
				this.exampaperValue = exampaperValue;
			}
		/**
		* 获取： 组卷方式
		*/
		public Integer getZujuanTypes() {
			return zujuanTypes;
		}
		/**
		* 设置： 组卷方式
		*/
		public void setZujuanTypes(Integer zujuanTypes) {
			this.zujuanTypes = zujuanTypes;
		}


			/**
			* 获取： 组卷方式的值
			*/
			public String getZujuanValue() {
				return zujuanValue;
			}
			/**
			* 设置： 组卷方式的值
			*/
			public void setZujuanValue(String zujuanValue) {
				this.zujuanValue = zujuanValue;
			}

		/**
		* 获取： 逻辑删除（1代表未删除 2代表已删除）
		*/
		public Integer getExampaperDelete() {
			return exampaperDelete;
		}
		/**
		* 设置： 逻辑删除（1代表未删除 2代表已删除）
		*/
		public void setExampaperDelete(Integer exampaperDelete) {
			this.exampaperDelete = exampaperDelete;
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
		return "ExamrecordView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", age=" + age +
			", yonghuEmail=" + yonghuEmail +
			", exampaperName=" + exampaperName +
			", exampaperDate=" + exampaperDate +
			", exampaperMyscore=" + exampaperMyscore +
			", exampaperDelete=" + exampaperDelete +
			"} " + super.toString();
	}
}
