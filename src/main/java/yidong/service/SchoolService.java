package yidong.service;

import yidong.model.School;

import java.util.List;

public interface SchoolService {
    List<School> selectAll();
    int addSchoolName(School school);
}
