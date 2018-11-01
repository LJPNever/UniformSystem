package yidong.service;

import yidong.model.Bigtype;

import java.util.List;

public interface BigTypeService {
    List<Bigtype> selectBig();
    int addBig(String name);
    int deleteById(int id);
}
