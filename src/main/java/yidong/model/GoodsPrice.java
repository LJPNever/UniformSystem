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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Integer tradePrice) {
        this.tradePrice = tradePrice;
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

    private Integer price;

    private Integer tradePrice;

    private Integer num;

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
}