package yidong.mapper;

import yidong.model.Admin;

import java.util.List;
import java.util.Map;

public interface AdminMapper {
    Admin login(Map map);
    List<Admin>getAdmin(Map map);
    int getCount(Map map);
    int updateState(Map map);
    int addAdmin(Admin admin);
    Admin selectByAccount(String account);
}
