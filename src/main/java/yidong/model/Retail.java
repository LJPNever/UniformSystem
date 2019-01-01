package yidong.model;

import java.util.Date;

public class Retail {
    private Integer goodsid;

    private String orderformid;

    private Integer num;

    private Date time;

    private float sum;
    private String schoolName;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getOrderformid() {
        return orderformid;
    }

    public void setOrderformid(String orderformid) {
        this.orderformid = orderformid == null ? null : orderformid.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
}