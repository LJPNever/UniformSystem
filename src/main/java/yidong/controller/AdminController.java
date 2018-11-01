package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yidong.Util.IsEmpty;
import yidong.model.Admin;
import yidong.service.AdminService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
    登陆账户并返回对应的state，如果为0，则表示账号或者密码错误
     **/
    @ResponseBody
    @RequestMapping("/login")
    public ResponseEntity<Map> login(@RequestParam String account,@RequestParam String password){
        Map map1=new HashMap();
        Map<Object,Object>map=new HashMap<>();
        map.put("account",account);
        map.put("password",password);
        int a=adminService.login(map);
        if(a!=0){
            map1.put("status",1);
            map1.put("data",a);
            return new ResponseEntity<Map>(map1,HttpStatus.OK);
        }
        else {
            map1.put("status",0);
            map1.put("data",a);
            return new ResponseEntity<Map>(map1,HttpStatus.OK);
        }
    }

    /*
    搜索会员，有条件则根据条件搜索，否则返回全部
     */
    @ResponseBody
    @RequestMapping("/getAdmin")
    public ResponseEntity<Map> getAdmin(@RequestParam (value = "account",required = false)String account,
                                        @RequestParam int page,@RequestParam int limit
                                        ){
        Map map=new HashMap();
        Map map1=new HashMap();
        map1.put("start",(page-1)*limit);
        map1.put("end",limit);
        map1.put("account",account);
        map.put("status",1);
        map.put("data",adminService.getAdmin(map1));
        map.put("total",adminService.getCount(map1));
        return new ResponseEntity(map,HttpStatus.OK);
    }

    /**
    修改对应管理员的state,成功返回1，失败为0
     **/
    @ResponseBody
    @RequestMapping("/updateState")
    public ResponseEntity<Map>  updateState(@RequestParam String account,@RequestParam int state){
        Map map1=new HashMap();
        Map map=new HashMap();
        map.put("account",account);
        map.put("state",state);
        map1.put("status",1);
        if(adminService.updateState(map)==1)
        {
            map1.put("status",1);
            map1.put("data",null);
            return new ResponseEntity(map1,HttpStatus.OK);
        }
        else {
            map1.put("status",0);
            map1.put("data",null);
            return new ResponseEntity(map1,HttpStatus.OK);
        }
    }

    /**
    *添加管理员，并设置对应的权限，如果返回500 错误，则表示当前添加的账户已经存在
     **/
    @ResponseBody
    @RequestMapping ("/addAdmin")
    public ResponseEntity<Map> addAdmin(@RequestBody Admin admin){
        Map map=new HashMap();
        if(adminService.addAdmin(admin)==1){
            map.put("status",1);
           map.put("data","wsnd");
            return new ResponseEntity(map, HttpStatus.OK);
        }

        else {
            map.put("status",0);
            map.put("data","wsnd");
            return new ResponseEntity<Map>(map,HttpStatus.OK);}
    }
}
