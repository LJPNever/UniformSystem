package yidong.service;

import yidong.model.School;

import java.util.List;

public interface SchoolService {
    List<School> selectAll(int smallTypeId);
    int addSchoolName(School school);
    int delete(String schoolName);
}
