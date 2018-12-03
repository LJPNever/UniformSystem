package yidong.service;

import yidong.model.*;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List<yidong.model.Goods> selectGoods(Map map);
    Goods selectById(int id);
    int addGoods(Goods goods);
    int updateState(StateModel stateModel);
    int delete(List<Modle> list);
    int updatesmallTypeId(GoodsModel goodsModel);
    int updateBatch(int smallTypeId,int smallModelId,int price);
    int updateGoods(Goods goods);
    int selectCount(Map map);
    int deleteById(int id);
    int deletePicture(int id);
}
