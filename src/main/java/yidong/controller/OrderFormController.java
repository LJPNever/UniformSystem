package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yidong.Util.IsEmpty;
import yidong.model.Modle;
import yidong.model.Orderform;
import yidong.service.OrderFormService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/OrderForm")
public class OrderFormController {
    @Autowired
    private OrderFormService orderFormService;

    /**
     * 根据条件来选择对应的订单，state（订单状态，要查询全部则传-1），
     * phone（电话），name（收货名字），time（日期），id(订单编号)
     * @param state
     * @return
     */

    @RequestMapping("/select")
    public ResponseEntity<Map> selectByState(@RequestParam (value = "state",required = false)int state,
                                        @RequestParam (value = "phone",required = false)String phone,
                                        @RequestParam (value = "name",required = false)String name,
                                        @RequestParam (value = "time",required = false)String time,
                                        @RequestParam (value = "id",required = false)String id,
                                        @RequestParam int page,@RequestParam int limit)
    {
        Map map1=new HashMap();
        Map map=new HashMap();
        map.put("state",state);
        map.put("phone",phone);
        map.put("name",name);
        map.put("time",time);
        map.put("id",id);
        map.put("start",(page-1)*limit);
        map.put("end",limit);
        map1.put("status",1);
        map1.put("data",orderFormService.select(map));
        map1.put("total",orderFormService.getCount(map));
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }

    /**
     *得到对应state订单的数量
     * @param state
     * @return
     */

    @RequestMapping("/selectCount")
    public ResponseEntity<Map> selectCount(@RequestParam int state){
        Map map=new HashMap();
        Map map1=new HashMap();
        map1.put("count",orderFormService.selectCount(state));
        map.put("status",1);
        map.put("data",map1);
        return new ResponseEntity<Map>(map,HttpStatus.OK);
    }

    /**
     * 退单，拒绝退单，均可添加备注
     * @param id
     * @param state
     * @param remarksServiceReturn
     * @return
     */

   @RequestMapping("/setState")
   public ResponseEntity<Map> setState(@RequestParam String id,@RequestParam int state,
                       @RequestParam(value = "remarksServiceReturn",required = false)String remarksServiceReturn){
       Map map1=new HashMap();
       Map map=new HashMap();
       map.put("id",id);
       map.put("state",state);
       map.put("remarksServiceReturn", IsEmpty.isEmpty(remarksServiceReturn));
       int a=orderFormService.setState(map);
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

    /**
     *
     * 批量发货
     * @param list
     * @return
     */

   @RequestMapping("/updateState")
    public ResponseEntity<Map> updateState(@RequestBody List<Modle> list){
       Map map1=new HashMap();
       int a= orderFormService.updateState(list);
       if(a!=1){
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

    /**
     * 获取订单的详细时间
     * @param id
     * @return
     */
   @RequestMapping("/selectById")
   public ResponseEntity<Map> selectById(@RequestParam String id){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",orderFormService.selectById(id));
        return new ResponseEntity<Map>(map,HttpStatus.OK);
   }
  }
