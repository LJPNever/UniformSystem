package yidong.model;

import java.util.Date;
import java.util.List;

public class Orderform {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Integer getTransportFee() {
        return transportFee;
    }

    public void setTransportFee(Integer transportFee) {
        this.transportFee = transportFee;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemarksWhenorder() {
        return remarksWhenorder;
    }

    public void setRemarksWhenorder(String remarksWhenorder) {
        this.remarksWhenorder = remarksWhenorder;
    }

    public String getRemarksWhenrefund() {
        return remarksWhenrefund;
    }

    public void setRemarksWhenrefund(String remarksWhenrefund) {
        this.remarksWhenrefund = remarksWhenrefund;
    }

    public String getRemarksServicereturn() {
        return remarksServicereturn;
    }

    public void setRemarksServicereturn(String remarksServicereturn) {
        this.remarksServicereturn = remarksServicereturn;
    }


    public Integer getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private float sumFirst;

    private float sumfinal;

    private Integer transportFee;

    private String userId;

    private String name;

    private String address;

    private String phone;

    private String remarksWhenorder;

    private String remarksWhenrefund;

    private String remarksServicereturn;

    private Integer giftId;

    private Integer giftNum;

    private Integer state;

    private Date createTime;

    private List<Express> listExpress;

    private List<OrderformGoods> list;
    private int isVip;
    private String schoolName;
    private String province;
    private String city;
    private String district;

    public List<OrderformGoods> getList() {
        return list;
    }

    public void setList(List<OrderformGoods> list) {
        this.list = list;
    }

    public List<Express> getListExpress() {
        return listExpress;
    }

    public void setListExpress(List<Express> listExpress) {
        this.listExpress = listExpress;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public int getIsVip() {
        return isVip;
    }

    public void setIsVip(int isVip) {
        this.isVip = isVip;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public float getSumFirst() {
        return sumFirst;
    }

    public void setSumFirst(float sumFirst) {
        this.sumFirst = sumFirst;
    }

    public float getSumfinal() {
        return sumfinal;
    }

    public void setSumfinal(float sumfinal) {
        this.sumfinal = sumfinal;
    }
}