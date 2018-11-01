package yidong.mapper;

import yidong.model.OrderformGoods;

public interface OrderformGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderformGoods record);

    int insertSelective(OrderformGoods record);

    OrderformGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderformGoods record);

    int updateByPrimaryKey(OrderformGoods record);
}