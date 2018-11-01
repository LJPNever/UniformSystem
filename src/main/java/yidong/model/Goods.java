package yidong.model;

import java.util.Date;
import java.util.List;

public class Goods {
    private Integer id;

    private String name;

    private Float integral;

    private Date createTime;

    private String detail;

    private Integer state;

    private Integer batch;

    private int  smallTypeId;
    private int recommend;
    private List<GoodsPicture>listpicture;
    private List<GoodsPrice> listPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getIntegral() {
        return integral;
    }

    public void setIntegral(Float integral) {
        this.integral = integral;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public List<GoodsPrice> getListPrice() {
        return listPrice;
    }

    public void setListPrice(List<GoodsPrice> listPrice) {
        this.listPrice = listPrice;
    }


    public int getSmallTypeId() {
        return smallTypeId;
    }

    public void setSmallTypeId(int smallTypeId) {
        this.smallTypeId = smallTypeId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", integral=" + integral +
                ", createTime=" + createTime +
                ", detail='" + detail + '\'' +
                ", state=" + state +
                ", batch=" + batch +
                ", smallTypeId=" + smallTypeId +
                ", listPrice=" + listPrice +
                '}';
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }


    public List<GoodsPicture> getListpicture() {
        return listpicture;
    }

    public void setListpicture(List<GoodsPicture> listpicture) {
        this.listpicture = listpicture;
    }
}