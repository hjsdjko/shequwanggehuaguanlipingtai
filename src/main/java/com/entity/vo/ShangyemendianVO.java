package com.entity.vo;

import com.entity.ShangyemendianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商业门店
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangyemendian")
public class ShangyemendianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商业门店名称
     */

    @TableField(value = "shangyemendian_name")
    private String shangyemendianName;


    /**
     * 商业门店编号
     */

    @TableField(value = "shangyemendian_uuid_number")
    private String shangyemendianUuidNumber;


    /**
     * 商业门店照片
     */

    @TableField(value = "shangyemendian_photo")
    private String shangyemendianPhoto;


    /**
     * 具体位置
     */

    @TableField(value = "shangyemendian_address")
    private String shangyemendianAddress;


    /**
     * 商业门店类型
     */

    @TableField(value = "shangyemendian_types")
    private Integer shangyemendianTypes;


    /**
     * 商业门店介绍
     */

    @TableField(value = "shangyemendian_content")
    private String shangyemendianContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商业门店名称
	 */
    public String getShangyemendianName() {
        return shangyemendianName;
    }


    /**
	 * 获取：商业门店名称
	 */

    public void setShangyemendianName(String shangyemendianName) {
        this.shangyemendianName = shangyemendianName;
    }
    /**
	 * 设置：商业门店编号
	 */
    public String getShangyemendianUuidNumber() {
        return shangyemendianUuidNumber;
    }


    /**
	 * 获取：商业门店编号
	 */

    public void setShangyemendianUuidNumber(String shangyemendianUuidNumber) {
        this.shangyemendianUuidNumber = shangyemendianUuidNumber;
    }
    /**
	 * 设置：商业门店照片
	 */
    public String getShangyemendianPhoto() {
        return shangyemendianPhoto;
    }


    /**
	 * 获取：商业门店照片
	 */

    public void setShangyemendianPhoto(String shangyemendianPhoto) {
        this.shangyemendianPhoto = shangyemendianPhoto;
    }
    /**
	 * 设置：具体位置
	 */
    public String getShangyemendianAddress() {
        return shangyemendianAddress;
    }


    /**
	 * 获取：具体位置
	 */

    public void setShangyemendianAddress(String shangyemendianAddress) {
        this.shangyemendianAddress = shangyemendianAddress;
    }
    /**
	 * 设置：商业门店类型
	 */
    public Integer getShangyemendianTypes() {
        return shangyemendianTypes;
    }


    /**
	 * 获取：商业门店类型
	 */

    public void setShangyemendianTypes(Integer shangyemendianTypes) {
        this.shangyemendianTypes = shangyemendianTypes;
    }
    /**
	 * 设置：商业门店介绍
	 */
    public String getShangyemendianContent() {
        return shangyemendianContent;
    }


    /**
	 * 获取：商业门店介绍
	 */

    public void setShangyemendianContent(String shangyemendianContent) {
        this.shangyemendianContent = shangyemendianContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
