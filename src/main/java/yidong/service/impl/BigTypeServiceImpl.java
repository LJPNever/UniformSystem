package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.BigtypeMapper;
import yidong.model.Bigtype;
import yidong.service.BigTypeService;

import java.util.List;
@Service
public class BigTypeServiceImpl implements BigTypeService {
    @Autowired
    private BigtypeMapper bigtypeMapper;
    @Override
    public List<Bigtype> selectBig() {
        return bigtypeMapper.selectBig();
    }

    @Override
    public int addBig(String name) {
        if(bigtypeMapper.selectByName(name)!=null){
            return 0;
        }

        return bigtypeMapper.addBig(name);
    }

    @Override
    public int deleteById(int id) {
        return bigtypeMapper.deleteById(id);
    }
}
