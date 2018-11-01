package yidong.mapper;

import yidong.model.OrderformModel;

public interface OrderformModelMapper {
    int insert(OrderformModel record);

    int insertSelective(OrderformModel record);
}