package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.SchoolMapper;
import yidong.model.School;
import yidong.service.SchoolService;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;
    @Override
    public List<School> selectAll() {
        return schoolMapper.selectAll();
    }

    @Override
    public int addSchoolName(School school) {
        return schoolMapper.addSchoolName(school);
    }
}
