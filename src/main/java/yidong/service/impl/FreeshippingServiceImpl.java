package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.FreeshippingMapper;
import yidong.model.Freeshipping;
import yidong.service.FreeshippingService;

@Service
public class FreeshippingServiceImpl implements FreeshippingService {

    @Autowired
    private FreeshippingMapper freeshippingMapper;
    @Override
    public int setFree(Freeshipping freeshipping) {
        return freeshippingMapper.setFree(freeshipping);
    }

    @Override
    public Freeshipping getFree() {
        return freeshippingMapper.getFree();
    }
}
