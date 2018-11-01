package yidong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.UserAddressMapper;
import yidong.model.UserAddress;
import yidong.service.UserAddressService;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserAddress> selectById(String userId) {
        return userAddressMapper.selectById(userId);
    }
}
