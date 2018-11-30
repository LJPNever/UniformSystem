package yidong.mapper;

import yidong.model.Express;
import yidong.model.Modle;
import yidong.model.OrderformGoods;

import java.util.ArrayList;
import java.util.List;

public interface OrderformGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderformGoods record);

    int insertSelective(OrderformGoods record);

    OrderformGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderformGoods record);

    int updateByPrimaryKey(OrderformGoods record);
    int updateState(Express express);
    ArrayList checkState(String orderformId);
    int changeState(List<Modle> list);
}