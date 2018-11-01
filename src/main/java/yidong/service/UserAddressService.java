package yidong.service;

import yidong.model.UserAddress;

import java.util.List;

public interface UserAddressService {
    List<UserAddress> selectById(String userId);
}
