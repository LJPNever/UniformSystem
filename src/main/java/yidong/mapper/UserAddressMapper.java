package yidong.mapper;

import yidong.model.UserAddress;

import java.util.List;

public interface UserAddressMapper {
   List<UserAddress>selectById(String userId);
}