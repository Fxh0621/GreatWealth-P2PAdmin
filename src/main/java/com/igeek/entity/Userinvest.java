package com.igeek.entity;

import java.util.Date;

public class Userinvest {
    private Integer userid;

    private String headerpic;

    private String username;

    private String phonenum;

    private String personid;

    private Date investintime;

    private String investproject;

    private String investtype;

    private Double investmoney;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getHeaderpic() {
        return headerpic;
    }

    public void setHeaderpic(String headerpic) {
        this.headerpic = headerpic == null ? null : headerpic.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public Date getInvestintime() {
        return investintime;
    }

    public void setInvestintime(Date investintime) {
        this.investintime = investintime;
    }

    public String getInvestproject() {
        return investproject;
    }

    public void setInvestproject(String nvestproject) {
        this.investproject = nvestproject == null ? null : nvestproject.trim();
    }

    public String getInvesttype() {
        return investtype;
    }

    public void setInvesttype(String investtype) {
        this.investtype = investtype == null ? null : investtype.trim();
    }

    public Double getInvestmoney() {
        return investmoney;
    }

    public void setInvestmoney(Double investmoney) {
        this.investmoney = investmoney;
    }
}