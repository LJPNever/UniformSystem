package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.UserMapper;
import yidong.model.User;
import yidong.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAll(Map map) {

        return userMapper.selectAll(map);
    }

    @Override
    public int selectCount(Map map) {
        return userMapper.selectCount(map);
    }
}
