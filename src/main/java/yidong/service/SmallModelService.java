package yidong.service;

import yidong.model.SmallModel;

import java.util.List;

public interface SmallModelService {
    int add(SmallModel smallModel);
    List<SmallModel> get(int id);
    int delete(int id);
}
