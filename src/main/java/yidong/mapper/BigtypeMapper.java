package yidong.mapper;

import yidong.model.Bigtype;

import java.util.List;

public interface BigtypeMapper {
    List<Bigtype> selectBig();
    int addBig(String name);
    int deleteById(int id);
}