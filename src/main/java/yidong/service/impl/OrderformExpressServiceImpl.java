package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.OrderformExpressMapper;
import yidong.model.Express;
import yidong.service.OrderformExpressService;
@Service
public class OrderformExpressServiceImpl implements OrderformExpressService {
    @Autowired
    private OrderformExpressMapper orderformExpressMapper;
    @Override
    public int addExpress(Express express) {
        return orderformExpressMapper.addExpress(express);
    }
}
