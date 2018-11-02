package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.AdminMapper;
import yidong.model.Admin;
import yidong.service.AdminService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public int login(Map map) {
        if(adminMapper.login(map)==null){
        return 0;}
        else {return adminMapper.login(map).getState();}
    }

    @Override
    public List<Admin> getAdmin(Map map) {

        return adminMapper.getAdmin(map);
    }

    @Override
    public int updateState(Map map) {
        return adminMapper.updateState(map);
    }

    @Override
    public int addAdmin(Admin admin) {
        if(adminMapper.selectByAccount(admin.getAccount())!=null){
            return 0;
        }

        return adminMapper.addAdmin(admin);
    }

    @Override
    public int getCount(Map map) {
        return adminMapper.getCount(map);
    }
}
