package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.OrderformExpressMapper;
import yidong.mapper.OrderformGoodsMapper;
import yidong.mapper.OrderformMapper;
import yidong.model.Express;
import yidong.service.OrderformExpressService;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderformExpressServiceImpl implements OrderformExpressService {
    @Autowired
    private OrderformExpressMapper orderformExpressMapper;
    @Autowired
    private OrderformGoodsMapper orderformGoodsMapper;
    @Autowired
    private OrderformMapper orderformMapper;
    @Override
    public int addExpress(Express express) {
        orderformExpressMapper.addExpress(express);
        orderformGoodsMapper.updateState(express);
        ArrayList<Integer> arr=orderformGoodsMapper.checkState(express.getOrderformId());
        boolean flag=true;
        for(int i=0;i<arr.size();i++){
            if (arr.get(i)==0) {
                flag = false;
                break;
            }
        }
        if (flag){
          orderformMapper.change(express.getOrderformId());
        }
        return 1;
    }
}
