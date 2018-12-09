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
    public List<School> selectAll(int smallTypeId) {
        return schoolMapper.selectAll(smallTypeId);
    }

    @Override
    public int addSchoolName(School school) {

        if(schoolMapper.check(school)!=null){
            return 0;
        }
        return schoolMapper.addSchoolName(school);
    }

    @Override
    public int delete(String schoolName) {
        return schoolMapper.delete(schoolName);
    }
}
