package yidong.Util;

import yidong.model.Gift;
import yidong.model.GoodsPrice;
import yidong.model.OrderformGoods;

import java.util.List;

public class Transform {

    public static void  transform(List<GoodsPrice> list){
        float a,b;
        for (int i=0;i<list.size();i++){
            a=list.get(i).getPrice();
            b=list.get(i).getTradePrice();
            list.get(i).setPrice(a/100);
            list.get(i).setTradePrice(b/100);
        }
    }
    public static void  retransform(List<GoodsPrice> list){
        float a,b;
        for (int i=0;i<list.size();i++){
            a=list.get(i).getPrice();
            b=list.get(i).getTradePrice();
            list.get(i).setPrice(a*100);
            list.get(i).setTradePrice(b*100);
        }
    }

    public static void transformGitf(Gift gift){
        gift.setFullCondition(gift.getFullCondition()*100);
    }
    public static void retransformGitf(Gift gift){
        gift.setFullCondition(gift.getFullCondition()/100);
    }

    public static void transformOrderform(List<OrderformGoods> list){
        for (int i=0;i<list.size();i++){
            list.get(i).setGoodsPrice(list.get(i).getGoodsPrice()/100);
        }
    }
}
