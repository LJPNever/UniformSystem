package yidong.service;

import yidong.model.Smalltype;

import java.util.List;

public interface SmallTypeService {
    List<Smalltype> selectById(int id);
    int addBig(Smalltype smalltype);
    int deleteById(int id);
}
