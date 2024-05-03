package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 用户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YonghuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 用户姓名
     */
    private String yonghuName;


    /**
     * 用户手机号
     */
    private String yonghuPhone;


    /**
     * 用户身份证号
     */
    private String yonghuIdNumber;


    /**
     * 用户头像
     */
    private String yonghuPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 年龄
     */
    private Integer age;


    /**
     * 人口状态
     */
    private Integer renkouzhuangtaiTypes;


    /**
     * 小区
     */
    private Integer xiaoquTypes;


    /**
     * 身体状况
     */
    private Integer shentiTypes;


    /**
     * 单位
     */
    private Integer danweileixingTypes;


    /**
     * 用户邮箱
     */
    private String yonghuEmail;


    /**
     * 创建时间
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：用户姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：用户姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：用户手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 设置：用户手机号
	 */
    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：用户身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 设置：用户身份证号
	 */
    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 获取：用户头像
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：用户头像
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getAge() {
        return age;
    }


    /**
	 * 设置：年龄
	 */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 获取：人口状态
	 */
    public Integer getRenkouzhuangtaiTypes() {
        return renkouzhuangtaiTypes;
    }


    /**
	 * 设置：人口状态
	 */
    public void setRenkouzhuangtaiTypes(Integer renkouzhuangtaiTypes) {
        this.renkouzhuangtaiTypes = renkouzhuangtaiTypes;
    }
    /**
	 * 获取：小区
	 */
    public Integer getXiaoquTypes() {
        return xiaoquTypes;
    }


    /**
	 * 设置：小区
	 */
    public void setXiaoquTypes(Integer xiaoquTypes) {
        this.xiaoquTypes = xiaoquTypes;
    }
    /**
	 * 获取：身体状况
	 */
    public Integer getShentiTypes() {
        return shentiTypes;
    }


    /**
	 * 设置：身体状况
	 */
    public void setShentiTypes(Integer shentiTypes) {
        this.shentiTypes = shentiTypes;
    }
    /**
	 * 获取：单位
	 */
    public Integer getDanweileixingTypes() {
        return danweileixingTypes;
    }


    /**
	 * 设置：单位
	 */
    public void setDanweileixingTypes(Integer danweileixingTypes) {
        this.danweileixingTypes = danweileixingTypes;
    }
    /**
	 * 获取：用户邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }


    /**
	 * 设置：用户邮箱
	 */
    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
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

    }
