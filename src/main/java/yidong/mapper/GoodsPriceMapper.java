package yidong.mapper;

import yidong.model.Batch;
import yidong.model.GoodsPrice;
import yidong.model.PriceModel;

import java.util.List;

public interface GoodsPriceMapper {
    int addPrice(GoodsPrice goodsPrice);
    int updataPrice(Batch batch);
    int updateGoodsPrice(List<GoodsPrice> list);
}