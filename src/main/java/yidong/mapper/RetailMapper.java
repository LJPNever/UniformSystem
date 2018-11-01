package yidong.mapper;

import yidong.model.Retail;

import java.util.List;
import java.util.Map;

public interface RetailMapper {
    int insert(Retail record);

    int insertSelective(Retail record);

    String getDay(String time);

    String getWeek(String time);
    String getMonth(String time);

    List<Retail>selectRetail(Map map);
    int selectCount(Map map);
}