package yidong.model;

public class Express {
    private int delivery;

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getOrderform_id() {
        return orderform_id;
    }

    public void setOrderform_id(String orderform_id) {
        this.orderform_id = orderform_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_modle() {
        return goods_modle;
    }

    public void setGoods_modle(String goods_modle) {
        this.goods_modle = goods_modle;
    }

    public int getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(int goods_num) {
        this.goods_num = goods_num;
    }

    public int getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(int goods_price) {
        this.goods_price = goods_price;
    }

    private String expressNumber;
    private String expressCompany;
    private String orderform_id;
    private String goods_name;
    private String goods_modle;
    private int goods_num;
    private int goods_price;
}
