package yidong.mapper;

import yidong.model.Retail;
import yidong.model.School;

import java.util.List;
import java.util.Map;

public interface SchoolMapper {
    List<School> selectAll();
    int addSchoolName(School school);
}