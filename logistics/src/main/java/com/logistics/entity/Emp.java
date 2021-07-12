package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Emp)实体类
 *
 * @author makejava
 * @since 2021-07-12 10:17:15
 */
public class Emp implements Serializable {
    private static final long serialVersionUID = 363397487597144263L;
    
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
    
    private Date addtime;
    
    private String updatename;
    
    private Date updatetime;
    
    private String deletename;
    
    private Date deletetime;
    
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

}