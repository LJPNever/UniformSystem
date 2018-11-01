package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    @Override
    public List<Orderform> select(Map map) {
        return orderformMapper.select(map);
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
        return orderformMapper.updateState(list);
    }

    @Override
    public Orderform selectById(String id) {
        return orderformMapper.selectById(id);
    }

    @Override
    public int getCount(Map map) {
        return orderformMapper.getCount(map);
    }
}
