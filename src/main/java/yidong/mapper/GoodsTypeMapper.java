package yidong.mapper;

import yidong.model.GoodsType;

public interface GoodsTypeMapper {
    int insert(GoodsType record);

    int insertSelective(GoodsType record);
}