package yidong.service;

import yidong.model.BigModel;
import yidong.model.SmallModel;

import java.util.List;

public interface BigModelService {
    int add(BigModel bigModel);
    List<BigModel> get();
    int delete(int id);
}
