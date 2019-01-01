package yidong.service;

import yidong.model.Retail;

import java.util.List;
import java.util.Map;

public interface RetailService {
    Float getDay(String time);
    Float getWeek(String time);
    Float getMonth(String time);
    List<Retail> selectRetail(Map map);
    int selectCount(Map map);
}
