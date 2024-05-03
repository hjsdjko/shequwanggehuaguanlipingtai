package com.entity.model;

import com.entity.DanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 单位
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DanweiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 单位名称
     */
    private String danweiName;


    /**
     * 单位编号
     */
    private String danweiUuidNumber;


    /**
     * 单位照片
     */
    private String danweiPhoto;


    /**
     * 单位位置
     */
    private String danweiAddress;


    /**
     * 单位类型
     */
    private Integer danweiTypes;


    /**
     * 单位介绍
     */
    private String danweiContent;


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
