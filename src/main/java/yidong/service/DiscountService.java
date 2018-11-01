package yidong.service;

import yidong.model.Discount;

public interface DiscountService {
    Discount getDiscount();
    int updateDiscount(Discount discount);
}
