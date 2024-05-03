package com.entity.vo;

import com.entity.DanweiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 单位
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("danwei")
public class DanweiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 单位名称
     */

    @TableField(value = "danwei_name")
    private String danweiName;


    /**
     * 单位编号
     */

    @TableField(value = "danwei_uuid_number")
    private String danweiUuidNumber;


    /**
     * 单位照片
     */

    @TableField(value = "danwei_photo")
    private String danweiPhoto;


    /**
     * 单位位置
     */

    @TableField(value = "danwei_address")
    private String danweiAddress;


    /**
     * 单位类型
     */

    @TableField(value = "danwei_types")
    private Integer danweiTypes;


    /**
     * 单位介绍
     */

    @TableField(value = "danwei_content")
    private String danweiContent;


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
	 * 设置：单位名称
	 */
    public String getDanweiName() {
        return danweiName;
    }


    /**
	 * 获取：单位名称
	 */

    public void setDanweiName(String danweiName) {
        this.danweiName = danweiName;
    }
    /**
	 * 设置：单位编号
	 */
    public String getDanweiUuidNumber() {
        return danweiUuidNumber;
    }


    /**
	 * 获取：单位编号
	 */

    public void setDanweiUuidNumber(String danweiUuidNumber) {
        this.danweiUuidNumber = danweiUuidNumber;
    }
    /**
	 * 设置：单位照片
	 */
    public String getDanweiPhoto() {
        return danweiPhoto;
    }


    /**
	 * 获取：单位照片
	 */

    public void setDanweiPhoto(String danweiPhoto) {
        this.danweiPhoto = danweiPhoto;
    }
    /**
	 * 设置：单位位置
	 */
    public String getDanweiAddress() {
        return danweiAddress;
    }


    /**
	 * 获取：单位位置
	 */

    public void setDanweiAddress(String danweiAddress) {
        this.danweiAddress = danweiAddress;
    }
    /**
	 * 设置：单位类型
	 */
    public Integer getDanweiTypes() {
        return danweiTypes;
    }


    /**
	 * 获取：单位类型
	 */

    public void setDanweiTypes(Integer danweiTypes) {
        this.danweiTypes = danweiTypes;
    }
    /**
	 * 设置：单位介绍
	 */
    public String getDanweiContent() {
        return danweiContent;
    }


    /**
	 * 获取：单位介绍
	 */

    public void setDanweiContent(String danweiContent) {
        this.danweiContent = danweiContent;
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
