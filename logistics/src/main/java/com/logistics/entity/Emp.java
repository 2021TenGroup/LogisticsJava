package com.logistics.entity;

<<<<<<< HEAD
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
import java.util.Date;
import java.io.Serializable;

/**
<<<<<<< HEAD
 * (Emp)实体类
 *
 * @author makejava
 * @since 2021-07-13 04:36:27
 */
public class Emp implements Serializable {
    private static final long serialVersionUID = -10402250910374592L;
    /**
     * 职员编号
     */
    private Integer empId;
    /**
     * 职位编号
     */
    private Integer positionId;
    /**
     * 所属网点
     */
    private Integer outletsId;
    /**
     * 职员编号
     */
    private String empNumber;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 手机号码
     */
    private Integer phone;
    /**
     * 身份证号码
     */
    private String identityCards;
    /**
     * 地址
     */
    private String address;
    /**
     * 身份证正面照片
     */
    private String zPhotographs;
    /**
     * 身份证反面照片
     */
    private String fPhotographs;
    /**
     * 职员姓名
     */
    private String empName;
    /**
     * 新增人
     */
    private String addname;
    /**
     * 增加时间
     */
    private Date addtime;
    /**
     * 修改人
     */
    private String updatename;
    /**
     * 最后修改时间
     */
    private Date updatetime;
    /**
     * 删除人
     */
    private String deletename;
    /**
     * 删除时间
     */
    private Date deletetime;
    /**
     * 时效性
     */
    private Integer timeliness;


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(Integer outletsId) {
        this.outletsId = outletsId;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getIdentityCards() {
        return identityCards;
    }

    public void setIdentityCards(String identityCards) {
        this.identityCards = identityCards;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZPhotographs() {
        return zPhotographs;
    }

    public void setZPhotographs(String zPhotographs) {
        this.zPhotographs = zPhotographs;
    }

    public String getFPhotographs() {
        return fPhotographs;
    }

    public void setFPhotographs(String fPhotographs) {
        this.fPhotographs = fPhotographs;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDeletename() {
        return deletename;
    }

    public void setDeletename(String deletename) {
        this.deletename = deletename;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public Integer getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Integer timeliness) {
        this.timeliness = timeliness;
    }

=======
 * (EmpVo)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:35:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "outlets,perPosition")
public class Emp implements Serializable {
    private Integer empId;

    private Integer positionId;

    private Integer outletsId;

    private String empNumber;

    private String userName;

    private String passWord;

    private Integer phone;

    private String identityCards;

    private String address;

    private String zPhotographs;

    private String fPhotographs;

    private String empName;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Outlets outlets;
    private PerPosition perPosition;
    private static final long serialVersionUID = 1L;
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
}
