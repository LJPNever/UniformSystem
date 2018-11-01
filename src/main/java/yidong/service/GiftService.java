package yidong.service;

import yidong.model.Gift;

import java.util.List;

public interface GiftService {
    List<Gift> getGift();
    int updateGift(List<Gift> list);
    int addGift(Gift gift);
    int deleteGift(int id);
}
