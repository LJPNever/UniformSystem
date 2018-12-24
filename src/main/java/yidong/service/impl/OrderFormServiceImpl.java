package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.Util.Transform;
import yidong.mapper.OrderformGoodsMapper;
import yidong.mapper.OrderformMapper;
import yidong.model.Modle;
import yidong.model.Orderform;
import yidong.service.OrderFormService;

import java.util.List;
import java.util.Map;

@Service
public class OrderFormServiceImpl implements OrderFormService {
   @Autowired
    private OrderformMapper orderformMapper;
   @Autowired
   private OrderformGoodsMapper orderformGoodsMapper;

    @Override
    public List<Orderform> select(Map map) {
        List<Orderform> list=orderformMapper.select(map);
        for (int i=0;i<list.size();i++){
            Transform.transformOrderform(list.get(i).getList());
            list.get(i).setSumfinal(list.get(i).getSumfinal()/100);
            list.get(i).setSumFirst(list.get(i).getSumFirst()/100);
        }

        return list;
    }

    @Override
    public int selectCount(int state) {
        return orderformMapper.selectCount(state);
    }

    @Override
    public int setState(Map map) {
        return orderformMapper.setState(map);
    }

    @Override
    public int updateState(List<Modle> list) {
       /* String a;
        for(int i=0;i<list.size();i++){
            a=list.get(i).getId();
            orderformMapper.updateState(a);
        }*/
        return orderformMapper.updateState(list)+orderformGoodsMapper.changeState(list);
    }

    @Override
    public Orderform selectById(String id) {

        Orderform orderform=orderformMapper.selectById(id);
        Transform.transformOrderform(orderform.getList());
        orderform.setSumFirst(orderform.getSumFirst()/100);
        orderform.setSumfinal(orderform.getSumfinal()/100);
        return orderform;
    }

    @Override
    public int getCount(Map map) {
        return orderformMapper.getCount(map);
    }
}
