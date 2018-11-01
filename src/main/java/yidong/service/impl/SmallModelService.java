package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.SmallModelMapper;
import yidong.model.SmallModel;

import java.util.List;
@Service
public class SmallModelService implements yidong.service.SmallModelService {
    @Autowired
    private SmallModelMapper smallModelMapper;
    @Override
    public int add(SmallModel smallModel) {
        return smallModelMapper.add(smallModel);
    }

    @Override
    public List<SmallModel> get(int id) {
        return smallModelMapper.get(id);
    }

    @Override
    public int delete(int id) {
        return smallModelMapper.delete(id);
    }
}
