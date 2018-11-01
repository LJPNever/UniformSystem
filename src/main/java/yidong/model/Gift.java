package yidong.model;

public class Gift {
    private int id;
    private Integer fullCondition;

    private Integer gift;

    private Integer num;

    private String giftName;

    public Integer getGift() {
        return gift;
    }

    public void setGift(Integer gift) {
        this.gift = gift;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getFullCondition() {
        return fullCondition;
    }

    public void setFullCondition(Integer fullCondition) {
        this.fullCondition = fullCondition;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}