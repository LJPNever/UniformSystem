package yidong.mapper;

import yidong.model.Smalltype;

import java.util.List;

public interface SmalltypeMapper {
    List<Smalltype> selectById(int id);
    int addBig(Smalltype smalltype);
    int deleteById(int id);
}