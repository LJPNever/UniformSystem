package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yidong.Util.IsEmpty;
import yidong.model.User;
import yidong.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/User")
public class UserController {

    @Autowired
    private UserService userService;

    /*
    查询数据库，返回所有的用户
     */
    @ResponseBody
    @RequestMapping("/selectAll")
    public ResponseEntity<Map> selectAll(@RequestParam(value = "phone",required = false)String phone,
                                          @RequestParam int page,@RequestParam int limit
    ){
        Map map1=new HashMap();
        map1.put("start",(page-1)*limit);
        map1.put("end",limit);
        map1.put("phone",phone);
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",userService.selectAll(map1));
        map.put("total",userService.selectCount(map1));
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }

}
