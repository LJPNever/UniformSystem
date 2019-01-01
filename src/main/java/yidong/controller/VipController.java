package yidong.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yidong.Util.IsEmpty;
import yidong.model.Vip;
import yidong.service.VipService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/Vip")
public class VipController {
    @Autowired
    private VipService vipService;

    /*
    设置VIP，成功返回1；如果该用户已经是vip，则会返回错误代码 500
     */

    @RequestMapping("/setVip")
    public ResponseEntity<Map> setVip(@RequestBody Vip vip){

        Map map=new HashMap();
        int a=vipService.setVip(vip);
        if(a==1) {
            map.put("status", 1);
            map.put("data", "添加成功");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }else if(a==2){
            map.put("status",0);
            map.put("data", "该用户已为VIP，请勿重复设置");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }else if(a==3){
            map.put("status",0);
            map.put("data", "该学校已有VIP，请勿重复设置");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }else {
            map.put("status",0);
            map.put("data", "系统出错，数据插入失败");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }

    }


    /*
    查询所有的会员信息
     */

    @RequestMapping("/selectVip")
    public ResponseEntity<Map> selectVip(@RequestParam (value = "phone",required = false)String phone,
                                         @RequestParam int page,@RequestParam int limit){

        Map map=new HashMap();
        Map map1=new HashMap();
        map1.put("start",(page-1)*limit);
        map1.put("end",limit);
        map1.put("phone", IsEmpty.isEmpty(phone));
        map.put("status",1);
        map.put("data",vipService.selectVip(map1));
        map.put("total",vipService.selectCount(map1));
        return new ResponseEntity<Map>(map,HttpStatus.OK);
    }

    /**
     *减少对应的积分，用于积分兑换
     * @param integral
     * @param openId
     * @return
     */

    @RequestMapping("/updteIntegral")
    public ResponseEntity<Map> updteIntegral(@RequestParam float integral,@RequestParam String openId){
        Map map1=new HashMap();
        Map map=new HashMap();
        map.put("openId",openId);
        map.put("integral",integral);
        int a=vipService.updteIntegral(map);
        if(a==1){
            map1.put("status",1);
            map1.put("data",null);
            return new ResponseEntity<Map>(map1,HttpStatus.OK);

        }
        else {
            map1.put("status",0);
            map1.put("data",null);
            return new ResponseEntity<Map>(map1,HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/delete/{openId}",method = RequestMethod.DELETE)
    public ResponseEntity<Map> delete(@PathVariable() String openId){
        Map map=new HashMap();

        if(vipService.deleteById(openId)!=0){
              map.put("status",1);
              map.put("data","删除成功");
              return new ResponseEntity<Map>(map,HttpStatus.OK);
        }
        else {
            map.put("status",0);
            map.put("data","删除失败");
            return new ResponseEntity<Map>(map,HttpStatus.OK);
        }
    }
}
