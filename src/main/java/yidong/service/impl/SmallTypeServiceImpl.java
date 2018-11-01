package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.SmalltypeMapper;
import yidong.model.Smalltype;
import yidong.service.SmallTypeService;

import java.util.List;

@Service
public class SmallTypeServiceImpl implements SmallTypeService {
    @Autowired
    private SmalltypeMapper smalltypeMapper;
    @Override
    public List<Smalltype> selectById(int id) {
        return smalltypeMapper.selectById(id);
    }

    @Override
    public int addBig(Smalltype smalltype) {
        return smalltypeMapper.addBig(smalltype);
    }

    @Override
    public int deleteById(int id) {
        return smalltypeMapper.deleteById(id);
    }
}
