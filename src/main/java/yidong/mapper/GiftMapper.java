package yidong.mapper;

import yidong.model.Gift;

import java.util.List;

public interface GiftMapper {
    List<Gift> getGift();
    int updateGift(List<Gift> list);
    int addGift(Gift gift);
    int deleteGift(int id);
}