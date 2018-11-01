package yidong.model;

public class SmallModel {
    private Integer id;

    private String name;

    private Integer bigModelId;

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



    @Override
    public String toString() {
        return "SmallModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bigModelId=" + bigModelId +
                '}';
    }

    public Integer getBigModelId() {
        return bigModelId;
    }

    public void setBigModelId(Integer bigModelId) {
        this.bigModelId = bigModelId;
    }
}