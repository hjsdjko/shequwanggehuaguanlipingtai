package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 单位
 *
 * @author 
 * @email
 */
@TableName("danwei")
public class DanweiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DanweiEntity() {

	}

	public DanweiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 单位名称
     */
    @ColumnInfo(comment="单位名称",type="varchar(200)")
    @TableField(value = "danwei_name")

    private String danweiName;


    /**
     * 单位编号
     */
    @ColumnInfo(comment="单位编号",type="varchar(200)")
    @TableField(value = "danwei_uuid_number")

    private String danweiUuidNumber;


    /**
     * 单位照片
     */
    @ColumnInfo(comment="单位照片",type="varchar(200)")
    @TableField(value = "danwei_photo")

    private String danweiPhoto;


    /**
     * 单位位置
     */
    @ColumnInfo(comment="单位位置",type="varchar(200)")
    @TableField(value = "danwei_address")

    private String danweiAddress;


    /**
     * 单位类型
     */
    @ColumnInfo(comment="单位类型",type="int(11)")
    @TableField(value = "danwei_types")

    private Integer danweiTypes;


    /**
     * 单位介绍
     */
    @ColumnInfo(comment="单位介绍",type="text")
    @TableField(value = "danwei_content")

    private String danweiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：单位名称
	 */
    public String getDanweiName() {
        return danweiName;
    }
    /**
	 * 设置：单位名称
	 */

    public void setDanweiName(String danweiName) {
        this.danweiName = danweiName;
    }
    /**
	 * 获取：单位编号
	 */
    public String getDanweiUuidNumber() {
        return danweiUuidNumber;
    }
    /**
	 * 设置：单位编号
	 */

    public void setDanweiUuidNumber(String danweiUuidNumber) {
        this.danweiUuidNumber = danweiUuidNumber;
    }
    /**
	 * 获取：单位照片
	 */
    public String getDanweiPhoto() {
        return danweiPhoto;
    }
    /**
	 * 设置：单位照片
	 */

    public void setDanweiPhoto(String danweiPhoto) {
        this.danweiPhoto = danweiPhoto;
    }
    /**
	 * 获取：单位位置
	 */
    public String getDanweiAddress() {
        return danweiAddress;
    }
    /**
	 * 设置：单位位置
	 */

    public void setDanweiAddress(String danweiAddress) {
        this.danweiAddress = danweiAddress;
    }
    /**
	 * 获取：单位类型
	 */
    public Integer getDanweiTypes() {
        return danweiTypes;
    }
    /**
	 * 设置：单位类型
	 */

    public void setDanweiTypes(Integer danweiTypes) {
        this.danweiTypes = danweiTypes;
    }
    /**
	 * 获取：单位介绍
	 */
    public String getDanweiContent() {
        return danweiContent;
    }
    /**
	 * 设置：单位介绍
	 */

    public void setDanweiContent(String danweiContent) {
        this.danweiContent = danweiContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Danwei{" +
            ", id=" + id +
            ", danweiName=" + danweiName +
            ", danweiUuidNumber=" + danweiUuidNumber +
            ", danweiPhoto=" + danweiPhoto +
            ", danweiAddress=" + danweiAddress +
            ", danweiTypes=" + danweiTypes +
            ", danweiContent=" + danweiContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
