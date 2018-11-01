package yidong.mapper;

import yidong.model.Wholesale;

import java.util.List;
import java.util.Map;

public interface WholesaleMapper {
    String getDay(String time);

    String getWeek(String time);
    String getMonth(String time);
    List<Wholesale> selectWholesale(Map map);
    int selectCount(Map map);

}