package yidong.model;

import java.util.List;

public class GoodsPrice {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }



    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<PriceModel> getListModle() {
        return listModle;
    }

    public void setListModle(List<PriceModel> listModle) {
        this.listModle = listModle;
    }

    private Integer goodsId;

    private float price;

    private float tradePrice;

    private Integer num;
    private String code;

    private List<PriceModel> listModle;





    @Override
    public String toString() {
        return "GoodsPrice{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", price=" + price +
                ", tradePrice=" + tradePrice +
                ", num=" + num +
                ", listModle=" + listModle +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTradePrice(float tradePrice) {
        this.tradePrice = tradePrice;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public float getTradePrice() {
        return tradePrice;
    }
}