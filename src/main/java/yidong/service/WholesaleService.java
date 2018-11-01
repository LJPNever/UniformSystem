package yidong.service;

import yidong.model.Wholesale;

import java.util.List;
import java.util.Map;

public interface WholesaleService {
    int getDay(String time);
    int getWeek(String time);
    int getMonth(String time);
    List<Wholesale> selectWholesale(Map map);
    int selectCount(Map map);
}
