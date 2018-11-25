package yidong.model;

import java.util.List;

public class BigModel {
    private Integer id;

    private String modelName;
    private List<SmallModel> smallModels;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public List<SmallModel> getSmallModels() {
        return smallModels;
    }

    public void setSmallModels(List<SmallModel> smallModels) {
        this.smallModels = smallModels;
    }
}