package yidong.mapper;

import jdk.nashorn.internal.codegen.FieldObjectCreator;
import yidong.model.Vip;

import java.util.List;
import java.util.Map;

public interface VipMapper {
    int setVip(Vip vip);
    List<Vip> selectVip(Map map);
    int updteIntegral(Map map);
    int selectCount(Map map);
}