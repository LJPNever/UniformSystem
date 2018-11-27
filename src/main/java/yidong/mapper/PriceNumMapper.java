package yidong.mapper;

import yidong.model.GoodsPrice;

import java.util.List;

public interface PriceNumMapper {
    int addnum(List<GoodsPrice>list);
    int updateGoodsPrice(List<GoodsPrice>list);
    int deleteById(int id);
}
