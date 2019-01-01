package yidong.service;

import yidong.model.Wholesale;

import java.util.List;
import java.util.Map;

public interface WholesaleService {
    Float getDay(String time);
    Float getWeek(String time);
    Float getMonth(String time);
    List<Wholesale> selectWholesale(Map map);
    int selectCount(Map map);
}
