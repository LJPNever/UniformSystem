package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.GiftMapper;
import yidong.model.Gift;
import yidong.service.GiftService;

import java.util.List;

@Service
public class GiftServiceImpl implements GiftService {
    @Autowired
    private GiftMapper giftMapper;
    @Override
    public List<Gift> getGift() {
        return giftMapper.getGift();
    }

    @Override
    public int updateGift(List<Gift> list) {
        return giftMapper.updateGift(list);
    }

    @Override
    public int addGift(Gift gift) {
        return giftMapper.addGift(gift);
    }

    @Override
    public int deleteGift(int id) {
        return giftMapper.deleteGift(id);
    }


}
