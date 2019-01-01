package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.DiscountMapper;
import yidong.model.Discount;
import yidong.service.DiscountService;
@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    private DiscountMapper discountMapper;
    @Override
    public Discount getDiscount() {
        Discount discount=discountMapper.getDiscount();

        discount.setDiscountCondition(discount.getDiscountCondition()/100);
        discount.setReduce(discount.getReduce()/100);
        return discount;
    }

    @Override
    public int updateDiscount(Discount discount) {

        discount.setDiscountCondition(discount.getDiscountCondition()*100);
        discount.setReduce(discount.getReduce()*100);

        return discountMapper.updateDiscount(discount);
    }
}
