package yidong.mapper;

import yidong.model.BigModel;
import yidong.model.SmallModel;

import java.util.List;

public interface BigModelMapper {
   int add(BigModel bigModel);
   List<BigModel> get();
   int delete(int id);
}