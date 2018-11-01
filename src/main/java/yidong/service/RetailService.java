package yidong.service;

import yidong.model.Retail;

import java.util.List;
import java.util.Map;

public interface RetailService {
    int getDay(String time);
    int getWeek(String time);
    int getMonth(String time);
    List<Retail> selectRetail(Map map);
    int selectCount(Map map);
}
