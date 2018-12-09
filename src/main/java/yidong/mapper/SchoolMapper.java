package yidong.mapper;

import yidong.model.Retail;
import yidong.model.School;

import java.util.List;
import java.util.Map;

public interface SchoolMapper {
    List<School> selectAll(int smallTypeId);
    int addSchoolName(School school);
    School check(School school);
    int delete(String schoolName);
}