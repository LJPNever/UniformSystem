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
        return discountMapper.getDiscount();
    }

    @Override
    public int updateDiscount(Discount discount) {
        return discountMapper.updateDiscount(discount);
    }
}
