package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ExamredetailsEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 答题详情表
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("examredetails")
public class ExamredetailsView extends ExamredetailsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 试题表
		/**
		* 试题名称
		*/

		@ColumnInfo(comment="试题名称",type="varchar(200)")
		private String examquestionName;
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
		* 选项，json字符串
		*/

		@ColumnInfo(comment="选项，json字符串",type="longtext")
		private String examquestionOptions;
		/**
		* 正确答案
		*/

		@ColumnInfo(comment="正确答案",type="varchar(200)")
		private String examquestionAnswer;
		/**
		* 答案解析
		*/

		@ColumnInfo(comment="答案解析",type="longtext")
		private String examquestionAnalysis;
		/**
		* 试题类型
		*/
		@ColumnInfo(comment="试题类型",type="int(20)")
		private Integer examquestionTypes;
			/**
			* 试题类型的值
			*/
			@ColumnInfo(comment="试题类型的字典表值",type="varchar(200)")
			private String examquestionValue;
		/**
		* 试题排序，值越大排越前面
		*/

		@ColumnInfo(comment="试题排序，值越大排越前面",type="int(20)")
		private Integer examquestionSequence;
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



	public ExamredetailsView() {

	}

	public ExamredetailsView(ExamredetailsEntity examredetailsEntity) {
		try {
			BeanUtils.copyProperties(this, examredetailsEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 试题表

		/**
		* 获取： 试题名称
		*/
		public String getExamquestionName() {
			return examquestionName;
		}
		/**
		* 设置： 试题名称
		*/
		public void setExamquestionName(String examquestionName) {
			this.examquestionName = examquestionName;
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
		* 获取： 选项，json字符串
		*/
		public String getExamquestionOptions() {
			return examquestionOptions;
		}
		/**
		* 设置： 选项，json字符串
		*/
		public void setExamquestionOptions(String examquestionOptions) {
			this.examquestionOptions = examquestionOptions;
		}

		/**
		* 获取： 正确答案
		*/
		public String getExamquestionAnswer() {
			return examquestionAnswer;
		}
		/**
		* 设置： 正确答案
		*/
		public void setExamquestionAnswer(String examquestionAnswer) {
			this.examquestionAnswer = examquestionAnswer;
		}

		/**
		* 获取： 答案解析
		*/
		public String getExamquestionAnalysis() {
			return examquestionAnalysis;
		}
		/**
		* 设置： 答案解析
		*/
		public void setExamquestionAnalysis(String examquestionAnalysis) {
			this.examquestionAnalysis = examquestionAnalysis;
		}
		/**
		* 获取： 试题类型
		*/
		public Integer getExamquestionTypes() {
			return examquestionTypes;
		}
		/**
		* 设置： 试题类型
		*/
		public void setExamquestionTypes(Integer examquestionTypes) {
			this.examquestionTypes = examquestionTypes;
		}


			/**
			* 获取： 试题类型的值
			*/
			public String getExamquestionValue() {
				return examquestionValue;
			}
			/**
			* 设置： 试题类型的值
			*/
			public void setExamquestionValue(String examquestionValue) {
				this.examquestionValue = examquestionValue;
			}

		/**
		* 获取： 试题排序，值越大排越前面
		*/
		public Integer getExamquestionSequence() {
			return examquestionSequence;
		}
		/**
		* 设置： 试题排序，值越大排越前面
		*/
		public void setExamquestionSequence(Integer examquestionSequence) {
			this.examquestionSequence = examquestionSequence;
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
		return "ExamredetailsView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", age=" + age +
			", yonghuEmail=" + yonghuEmail +
			", examquestionName=" + examquestionName +
			", examquestionOptions=" + examquestionOptions +
			", examquestionAnswer=" + examquestionAnswer +
			", examquestionAnalysis=" + examquestionAnalysis +
			", examquestionSequence=" + examquestionSequence +
			"} " + super.toString();
	}
}
