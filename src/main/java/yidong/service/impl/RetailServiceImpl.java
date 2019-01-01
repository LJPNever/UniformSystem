package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.Util.Check;
import yidong.mapper.RetailMapper;
import yidong.model.Retail;
import yidong.service.RetailService;

import java.util.List;
import java.util.Map;

@Service
public class RetailServiceImpl implements RetailService{
    @Autowired
    private RetailMapper retailMapper;
    @Override
    public Float getDay(String time) {

        return Check.check(retailMapper.getDay(time));
    }

    @Override
    public Float getWeek(String time) {
        return Check.check(retailMapper.getWeek(time));
    }

    @Override
    public Float getMonth(String time) {
        return Check.check(retailMapper.getMonth(time));
    }

    @Override
    public List<Retail> selectRetail(Map map) {
        List<Retail> list=retailMapper.selectRetail(map);
        for(int i=0;i<list.size();i++){
            list.get(i).setSum(list.get(i).getSum()/100);
        }
        return list;
    }

    @Override
    public int selectCount(Map map) {
        return retailMapper.selectCount(map);
    }
}
