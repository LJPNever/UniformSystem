package yidong.mapper;

import yidong.model.Goods;
import yidong.model.GoodsModel;
import yidong.model.Modle;

import java.util.List;
import java.util.Map;

public interface GoodsMapper {
  List<Goods> selectGoods(Map map);
  Goods selectById(int id);
  int addGoods(Goods goods);
  int updateState(List<Modle> list);
  int delete(List<Modle> list);
  int updatesmallTypeId(GoodsModel goodsModel);
  List selectBySmall(int smallTypeId);
  int updateById(Goods goods);
  int selectCount(Map map);
}