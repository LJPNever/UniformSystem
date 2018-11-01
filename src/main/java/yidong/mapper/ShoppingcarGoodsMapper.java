package yidong.mapper;

import yidong.model.ShoppingcarGoods;

public interface ShoppingcarGoodsMapper {
    int insert(ShoppingcarGoods record);

    int insertSelective(ShoppingcarGoods record);
}