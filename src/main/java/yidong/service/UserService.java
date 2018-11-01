package yidong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yidong.mapper.UserMapper;
import yidong.model.User;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {

    List<User> selectAll(Map map);
    int  selectCount(Map map);
}
