package yidong.mapper;

import yidong.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectAll(Map map);
    int  selectCount(Map map);
}