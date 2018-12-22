package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.Util.Transform;
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
        List<Gift> list=giftMapper.getGift();
        for(int i=0;i<list.size();i++){
            Transform.retransformGitf(list.get(i));
        }
        return list;
    }

    @Override
    public int updateGift(List<Gift> list) {

        for(int i=0;i<list.size();i++){
            Transform.transformGitf(list.get(i));
        }

        return giftMapper.updateGift(list);
    }

    @Override
    public int addGift(Gift gift) {

        Transform.transformGitf(gift);
        return giftMapper.addGift(gift);
    }

    @Override
    public int deleteGift(int id) {
        return giftMapper.deleteGift(id);
    }


}
