package yidong.model;

import java.util.List;

public class GoodsModel {
    private List<Modle> list;
    private int smallTypeId;

    public List<Modle> getList() {
        return list;
    }

    public void setList(List<Modle> list) {
        this.list = list;
    }


    public int getSmallTypeId() {
        return smallTypeId;
    }

    public void setSmallTypeId(int smallTypeId) {
        this.smallTypeId = smallTypeId;
    }
}
