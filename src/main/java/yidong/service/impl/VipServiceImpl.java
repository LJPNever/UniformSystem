package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.VipMapper;
import yidong.model.Vip;
import yidong.service.VipService;

import java.util.List;
import java.util.Map;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;
    @Override
    public int setVip(Vip vip) {

        if(vipMapper.check(vip.getOpenId())!=null){
            return 2;
        }
        if(vipMapper.checkSchool(vip.getSchoolName())!=null){
            return 3;
        }

        return vipMapper.setVip(vip);
    }

    @Override
    public List<Vip> selectVip(Map map) {
        return vipMapper.selectVip(map);
    }

    @Override
    public int updteIntegral(Map map) {
        return vipMapper.updteIntegral(map);
    }

    @Override
    public int selectCount(Map map) {
        return vipMapper.selectCount(map);
    }

    @Override
    public int deleteById(String openId) {
        return vipMapper.deleteById(openId);
    }


}
