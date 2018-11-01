package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.BigModelMapper;
import yidong.model.BigModel;
import yidong.model.SmallModel;
import yidong.service.BigModelService;

import java.util.List;
@Service
public class BigModelServiceImpl implements BigModelService {
    @Autowired
    private BigModelMapper bigModelMapper;
    @Override
    public int add(BigModel bigModel) {
        return bigModelMapper.add(bigModel);
    }

    @Override
    public List<BigModel> get() {
        return bigModelMapper.get();
    }

    @Override
    public int delete(int id) {
        return bigModelMapper.delete(id);
    }
}
