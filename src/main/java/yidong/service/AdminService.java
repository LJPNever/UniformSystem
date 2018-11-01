package yidong.service;

import yidong.model.Admin;

import java.util.List;
import java.util.Map;

public interface AdminService {
    int login(Map map);
    List<Admin> getAdmin(Map map);
    int updateState(Map map);
    int addAdmin(Admin admin);
    int getCount(Map map);
}
