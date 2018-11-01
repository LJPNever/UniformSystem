package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.Util.Check;
import yidong.mapper.WholesaleMapper;
import yidong.model.Wholesale;
import yidong.service.WholesaleService;

import java.util.List;
import java.util.Map;

@Service
public class WholesaleServiceImpl implements WholesaleService{
    @Autowired
    private WholesaleMapper wholesaleMapper;

    @Override
    public int getDay(String time) {
        return Check.check(wholesaleMapper.getDay(time));
    }

    @Override
    public int getWeek(String time) {
        return Check.check(wholesaleMapper.getWeek(time));
    }

    @Override
    public int getMonth(String time) {
        return Check.check(wholesaleMapper.getMonth(time));
    }

    @Override
    public List<Wholesale> selectWholesale(Map map) {
        return wholesaleMapper.selectWholesale(map);
    }

    @Override
    public int selectCount(Map map) {
        return wholesaleMapper.selectCount(map);
    }
}
