package yidong.mapper;

import yidong.model.Discount;

public interface DiscountMapper {
    Discount getDiscount();
    int updateDiscount(Discount discount);
}