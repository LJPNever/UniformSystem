package yidong.model;

import java.util.List;

public class Express {




    private ExpressDelivery delivery;
    private String orderformId;
    private List<ExpressModel> list;

    public List<ExpressModel> getList() {
        return list;
    }

    public void setList(List<ExpressModel> list) {
        this.list = list;
    }

    public String getOrderformId() {
        return orderformId;
    }

    public void setOrderformId(String orderformId) {
        this.orderformId = orderformId;
    }

    public ExpressDelivery getDelivery() {
        return delivery;
    }

    public void setDelivery(ExpressDelivery delivery) {
        this.delivery = delivery;
    }
}
