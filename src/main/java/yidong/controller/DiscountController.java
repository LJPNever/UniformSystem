package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin.net.protocol.jar.Handler;
import yidong.model.Discount;
import yidong.service.DiscountService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/Discount")
public class DiscountController {
    @Autowired
    private DiscountService discountService;

    /**
     * 获取折扣满减的信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/getDiscount")
    public ResponseEntity<Map> getDiscount(){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data", discountService.getDiscount());
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }


    /**
     * 获取一个Discount对象进行更新，满减和折扣只能同时生效一个
     * @param discount
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateDiscount")
    public ResponseEntity<Map> updateDiscount(@RequestBody Discount discount){
        Map map=new HashMap();
        if(discountService.updateDiscount(discount)==1)
        {
            map.put("status",1);
            map.put("data",null);
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
        else {
            map.put("status",0);
            map.put("data",null);
            return new ResponseEntity<Map>(map,HttpStatus.OK);
        }
    }
}
