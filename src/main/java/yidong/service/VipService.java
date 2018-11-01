package yidong.service;

import yidong.model.Vip;

import java.util.List;
import java.util.Map;

public interface VipService {
    int setVip(Vip vip);
    List<Vip> selectVip(Map map);
    int updteIntegral(Map map);
    int selectCount(Map map);
}
