package yidong.model;

public class PriceModel {
    private Integer priceId;

    private Integer smallModelId;

    private String name;
    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }


    public Integer getSmallModelId() {
        return smallModelId;
    }

    public void setSmallModelId(Integer smallModelId) {
        this.smallModelId = smallModelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}