package yidong.mapper;

import yidong.model.SmallModel;
import yidong.model.Smalltype;

import java.util.List;

public interface SmallModelMapper {
    int add(SmallModel smallModel);
    List<SmallModel> get(int id);
    int delete(int id);
}