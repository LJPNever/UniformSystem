package yidong.service;

import yidong.model.Modle;
import yidong.model.Orderform;

import java.util.List;
import java.util.Map;

public interface OrderFormService {
    List<Orderform> select(Map map);
    int selectCount(int state);
    int setState(Map map);
    int updateState(List<Modle> list );
    Orderform selectById(String id);
    int getCount(Map map);
}
