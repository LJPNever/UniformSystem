package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yidong.model.UserAddress;
import yidong.service.UserAddressService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/UserAddress")
public class UserAddressController {
   @Autowired
    private UserAddressService userAddressService;


    /**
     * 通过用户的Id查询对应的地址
     * @param userId
     * @return
     */
   @ResponseBody
    @RequestMapping("/getAddress")
    public ResponseEntity<Map> getAddress(@RequestParam String userId){
       Map map=new HashMap();
       map.put("status",1);
       map.put("data",userAddressService.selectById(userId));
       return new ResponseEntity<Map>(map, HttpStatus.OK);
   }
}
