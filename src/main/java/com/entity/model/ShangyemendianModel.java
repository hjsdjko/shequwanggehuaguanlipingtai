package com.entity.model;

import com.entity.ShangyemendianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商业门店
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShangyemendianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商业门店名称
     */
    private String shangyemendianName;


    /**
     * 商业门店编号
     */
    private String shangyemendianUuidNumber;


    /**
     * 商业门店照片
     */
    private String shangyemendianPhoto;


    /**
     * 具体位置
     */
    private String shangyemendianAddress;


    /**
     * 商业门店类型
     */
    private Integer shangyemendianTypes;


    /**
     * 商业门店介绍
     */
    private String shangyemendianContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
