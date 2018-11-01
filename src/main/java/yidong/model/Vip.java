package yidong.model;

public class Vip {
    private String openId;

    private Float integral;

    private Integer goodsId;
    private String phone;

    public String getOpenId() {
        return openId;
    }


    public Float getIntegral() {
        return integral;
    }

    public void setIntegral(Float integral) {
        this.integral = integral;
    }


    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}