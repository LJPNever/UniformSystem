package yidong.model;

import java.util.List;

public class StateModel {
    private List<Modle> list;
    private int state;

    public List<Modle> getList() {
        return list;
    }

    public void setList(List<Modle> list) {
        this.list = list;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
