package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.Util.Transform;
import yidong.mapper.*;
import yidong.model.*;
import yidong.service.GoodsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private PriceModelMapper priceModelMapper;
    @Autowired
    private GoodsPriceMapper goodsPriceMapper;
    @Autowired
    private GoodsPictureMapper goodsPictureMapper;
    @Autowired
    private PriceNumMapper priceNumMapper;
    @Override
    public List<Goods> selectGoods(Map map) {
        List<Goods> list=goodsMapper.selectGoods(map);
        for(int i=0;i<list.size();i++){
            Transform.transform(list.get(i).getListPrice());
        }
        return list;
    }

    @Override
    public Goods selectById(int id) {

        Goods goods=goodsMapper.selectById(id);
        Transform.transform(goods.getListPrice());
        return goods;
    }

    @Override
    public int addGoods(Goods goods) {
        Transform.retransform(goods.getListPrice());
        if (goodsMapper.addGoods(goods) == 1) {
            int a = goods.getId();
            for(int x=0;x<goods.getListpicture().size();x++){
                goods.getListpicture().get(x).setGoodsId(a);
            }
            goodsPictureMapper.add(goods.getListpicture());
            for (int i = 0; i < goods.getListPrice().size(); i++) {
                goods.getListPrice().get(i).setGoodsId(a);
               if (goodsPriceMapper.addPrice(goods.getListPrice().get(i)) == 1) {

                    for (int j = 0; j < goods.getListPrice().get(i).getListModle().size(); j++) {
                        int b = goods.getListPrice().get(i).getId();
                        goods.getListPrice().get(i).getListModle().get(j).setPriceId(b);
                    }

                   priceModelMapper.addModle(goods.getListPrice().get(i).getListModle());
                }

            }
            priceNumMapper.addnum(goods.getListPrice());
            return 1;

        }
        return 0;
    }

    @Override
    public int updateState(StateModel stateModel) {

        return goodsMapper.updateState(stateModel);
    }

    @Override
    public int delete(List<Modle> list) {
        return goodsMapper.delete(list);
    }

    @Override
    public int updatesmallTypeId(GoodsModel goodsModel) {
        return goodsMapper.updatesmallTypeId(goodsModel);
    }

    @Override
    public int updateBatch(int smallTypeId, int smallModelId, int price) {
        Batch batch=new Batch();
        batch.setPrice(price*100);
        batch.setListId(priceModelMapper.selectBySmall(smallModelId));
        batch.setListGoodsId(goodsMapper.selectBySmall(smallTypeId));

        return goodsPriceMapper.updataPrice(batch);
    }

    @Override
    public int updateGoods(Goods goods) {
        int a=goods.getId();
        List<GoodsPicture> listpicture = null;
        Transform.retransform(goods.getListPrice());
        List<GoodsPrice> list=new ArrayList<>();

        goodsPictureMapper.updateById(goods.getListpicture().get(0));

        for (int i = 0; i < goods.getListPrice().size(); i++) {
            if (goods.getListPrice().get(i).getGoodsId()==null) {
                goods.getListPrice().get(i).setGoodsId(a);
                if (goodsPriceMapper.addPrice(goods.getListPrice().get(i)) == 1) {
                    for (int j = 0; j < goods.getListPrice().get(i).getListModle().size(); j++) {
                        int b = goods.getListPrice().get(i).getId();
                        goods.getListPrice().get(i).getListModle().get(j).setPriceId(b);
                    }
                    priceModelMapper.addModle(goods.getListPrice().get(i).getListModle());
                    list.add(goods.getListPrice().get(i));
                }

            }
        }
        if(list.size()!=0){
        priceNumMapper.addnum(list);
        }

        goodsMapper.updateById(goods);
        return  1;

    }

    @Override
    public int selectCount(Map map) {
        return goodsMapper.selectCount(map);
    }

    @Override
    public int deleteById(int id) {
        return goodsPriceMapper.deleteById(id)+priceModelMapper.deleteById(id)+priceNumMapper.deleteById(id);
    }

    @Override
    public int deletePicture(int id) {
        return goodsPictureMapper.deleteById(id);
    }


}
