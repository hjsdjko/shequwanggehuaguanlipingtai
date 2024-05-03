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
 * 商业门店
 *
 * @author 
 * @email
 */
@TableName("shangyemendian")
public class ShangyemendianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangyemendianEntity() {

	}

	public ShangyemendianEntity(T t) {
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
     * 商业门店名称
     */
    @ColumnInfo(comment="商业门店名称",type="varchar(200)")
    @TableField(value = "shangyemendian_name")

    private String shangyemendianName;


    /**
     * 商业门店编号
     */
    @ColumnInfo(comment="商业门店编号",type="varchar(200)")
    @TableField(value = "shangyemendian_uuid_number")

    private String shangyemendianUuidNumber;


    /**
     * 商业门店照片
     */
    @ColumnInfo(comment="商业门店照片",type="varchar(200)")
    @TableField(value = "shangyemendian_photo")

    private String shangyemendianPhoto;


    /**
     * 具体位置
     */
    @ColumnInfo(comment="具体位置",type="varchar(200)")
    @TableField(value = "shangyemendian_address")

    private String shangyemendianAddress;


    /**
     * 商业门店类型
     */
    @ColumnInfo(comment="商业门店类型",type="int(11)")
    @TableField(value = "shangyemendian_types")

    private Integer shangyemendianTypes;


    /**
     * 商业门店介绍
     */
    @ColumnInfo(comment="商业门店介绍",type="text")
    @TableField(value = "shangyemendian_content")

    private String shangyemendianContent;


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
	 * 获取：商业门店名称
	 */
    public String getShangyemendianName() {
        return shangyemendianName;
    }
    /**
	 * 设置：商业门店名称
	 */

    public void setShangyemendianName(String shangyemendianName) {
        this.shangyemendianName = shangyemendianName;
    }
    /**
	 * 获取：商业门店编号
	 */
    public String getShangyemendianUuidNumber() {
        return shangyemendianUuidNumber;
    }
    /**
	 * 设置：商业门店编号
	 */

    public void setShangyemendianUuidNumber(String shangyemendianUuidNumber) {
        this.shangyemendianUuidNumber = shangyemendianUuidNumber;
    }
    /**
	 * 获取：商业门店照片
	 */
    public String getShangyemendianPhoto() {
        return shangyemendianPhoto;
    }
    /**
	 * 设置：商业门店照片
	 */

    public void setShangyemendianPhoto(String shangyemendianPhoto) {
        this.shangyemendianPhoto = shangyemendianPhoto;
    }
    /**
	 * 获取：具体位置
	 */
    public String getShangyemendianAddress() {
        return shangyemendianAddress;
    }
    /**
	 * 设置：具体位置
	 */

    public void setShangyemendianAddress(String shangyemendianAddress) {
        this.shangyemendianAddress = shangyemendianAddress;
    }
    /**
	 * 获取：商业门店类型
	 */
    public Integer getShangyemendianTypes() {
        return shangyemendianTypes;
    }
    /**
	 * 设置：商业门店类型
	 */

    public void setShangyemendianTypes(Integer shangyemendianTypes) {
        this.shangyemendianTypes = shangyemendianTypes;
    }
    /**
	 * 获取：商业门店介绍
	 */
    public String getShangyemendianContent() {
        return shangyemendianContent;
    }
    /**
	 * 设置：商业门店介绍
	 */

    public void setShangyemendianContent(String shangyemendianContent) {
        this.shangyemendianContent = shangyemendianContent;
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
        return "Shangyemendian{" +
            ", id=" + id +
            ", shangyemendianName=" + shangyemendianName +
            ", shangyemendianUuidNumber=" + shangyemendianUuidNumber +
            ", shangyemendianPhoto=" + shangyemendianPhoto +
            ", shangyemendianAddress=" + shangyemendianAddress +
            ", shangyemendianTypes=" + shangyemendianTypes +
            ", shangyemendianContent=" + shangyemendianContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
