package yidong.mapper;

import yidong.model.GoodsPicture;

import java.util.List;

public interface GoodsPictureMapper {
   int add(List<GoodsPicture> list);
   int deleteById(int id);
}