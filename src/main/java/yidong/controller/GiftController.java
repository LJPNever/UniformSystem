package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yidong.model.Gift;
import yidong.service.GiftService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/Gift")
@Controller
public class GiftController {
   @Autowired
    private GiftService giftService;

    /**
     * 获得满增信息
     * @return
     */
   @ResponseBody
    @RequestMapping("/getGift")
    public ResponseEntity<Math> getGift(){
       Map map=new HashMap();
       map.put("status",1);
       map.put("data",giftService.getGift());
       return new ResponseEntity(map, HttpStatus.OK);
   }

    /**
     *设置满增信息
     * @param gift
     * @return
     */
   @ResponseBody
    @RequestMapping("/updateGift")
   public ResponseEntity<Map> updateGift(@RequestBody List<Gift> list){
       Map map=new HashMap();
       int a=giftService.updateGift(list);
       if(a==1){
           map.put("status",1);
           map.put("data",null);
           return new ResponseEntity<Map>(map,HttpStatus.OK);
       }
      else {
           map.put("status",0);
           map.put("data",null);
           return new ResponseEntity<Map>(map,HttpStatus.OK);
       }
   }

    /**
     * 添加礼物
     * @param gift
     * @return
     */
   @RequestMapping("addGift")
    public ResponseEntity<Map> add(@RequestBody Gift gift){
       Map map=new HashMap();
       if(giftService.addGift(gift)==1){
           map.put("status",1);
           map.put("data",null);
           return new ResponseEntity<Map>(map,HttpStatus.OK);
       }
       else {
           map.put("status",0);
           map.put("data",null);
           return new ResponseEntity<Map>(map,HttpStatus.OK);
       }
   }

    /**
     * 删除礼物
     * @param id
     * @return
     */
    @RequestMapping("deleteGift")
    public ResponseEntity<Map> delete(@RequestParam int id){
        Map map=new HashMap();
        if(giftService.deleteGift(id)==1){
            map.put("status",1);
            map.put("data",null);
            return new ResponseEntity<Map>(map,HttpStatus.OK);
        }
        else {
            map.put("status",0);
            map.put("data",null);
            return new ResponseEntity<Map>(map,HttpStatus.OK);
        }
    }
}
