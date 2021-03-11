package com.igeek.entity;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/1 0001 18:16
 */
public class Userborrow {

    private Integer userid;

    private String headerpic;

    private String username;

    private String phonenum;

    private String personid;

    private Integer borrowtime;

    private String borrowproject;

    private String borrowtype;

    private Double borrowmoney;

    public Userborrow() {
    }

    public Userborrow(Integer userid, String headerpic, String username, String phonenum, String personid, Integer borrowtime, String borrowproject, String borrowtype, Double borrowmoney) {
        this.userid = userid;
        this.headerpic = headerpic;
        this.username = username;
        this.phonenum = phonenum;
        this.personid = personid;
        this.borrowtime = borrowtime;
        this.borrowproject = borrowproject;
        this.borrowtype = borrowtype;
        this.borrowmoney = borrowmoney;
    }

    /**
     * 获取
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取
     * @return headerpic
     */
    public String getHeaderpic() {
        return headerpic;
    }

    /**
     * 设置
     * @param headerpic
     */
    public void setHeaderpic(String headerpic) {
        this.headerpic = headerpic;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return phonenum
     */
    public String getPhonenum() {
        return phonenum;
    }

    /**
     * 设置
     * @param phonenum
     */
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    /**
     * 获取
     * @return personid
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * 设置
     * @param personid
     */
    public void setPersonid(String personid) {
        this.personid = personid;
    }

    /**
     * 获取
     * @return borrowtime
     */
    public Integer getBorrowtime() {
        return borrowtime;
    }

    /**
     * 设置
     * @param borrowtime
     */
    public void setBorrowtime(Integer borrowtime) {
        this.borrowtime = borrowtime;
    }

    /**
     * 获取
     * @return borrowproject
     */
    public String getBorrowproject() {
        return borrowproject;
    }

    /**
     * 设置
     * @param borrowproject
     */
    public void setBorrowproject(String borrowproject) {
        this.borrowproject = borrowproject;
    }

    /**
     * 获取
     * @return borrowtype
     */
    public String getBorrowtype() {
        return borrowtype;
    }

    /**
     * 设置
     * @param borrowtype
     */
    public void setBorrowtype(String borrowtype) {
        this.borrowtype = borrowtype;
    }

    /**
     * 获取
     * @return borrowmoney
     */
    public Double getBorrowmoney() {
        return borrowmoney;
    }

    /**
     * 设置
     * @param borrowmoney
     */
    public void setBorrowmoney(Double borrowmoney) {
        this.borrowmoney = borrowmoney;
    }

    public String toString() {
        return "Userborrow{userid = " + userid + ", headerpic = " + headerpic + ", username = " + username + ", phonenum = " + phonenum + ", personid = " + personid + ", borrowtime = " + borrowtime + ", borrowproject = " + borrowproject + ", borrowtype = " + borrowtype + ", borrowmoney = " + borrowmoney + "}";
    }
}
 
  