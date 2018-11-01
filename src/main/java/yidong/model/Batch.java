package yidong.model;

import java.util.List;

public class Batch {
    private int price;
    private List listId;
    private List listGoodsId;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List getListId() {
        return listId;
    }

    public void setListId(List listId) {
        this.listId = listId;
    }

    public List getListGoodsId() {
        return listGoodsId;
    }

    public void setListGoodsId(List listGoodsId) {
        this.listGoodsId = listGoodsId;
    }
}
