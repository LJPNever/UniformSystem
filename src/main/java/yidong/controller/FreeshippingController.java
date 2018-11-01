package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yidong.model.Freeshipping;
import yidong.service.FreeshippingService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/Free")
public class FreeshippingController {
    @Autowired
    private FreeshippingService freeshippingService;

    /**
     * 设置包邮条件
     * @param freeshipping
     * @return
     */
    @ResponseBody
    @RequestMapping("/setFree")
    public ResponseEntity<Map> setFree(@RequestBody Freeshipping freeshipping){
        Map map=new HashMap();
        if(freeshippingService.setFree(freeshipping)==1){
            map.put("status",1);
            map.put("data",null);
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
        else {
            map.put("status",0);
            map.put("data",null);
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
}

    /**
     * 查询已经设置的包邮条件
     * @return
     */
    @ResponseBody
    @RequestMapping("/getFree")
    public ResponseEntity<Map> getFree(){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",freeshippingService.getFree());
        return new ResponseEntity<Map>(map,HttpStatus.OK);
    }
}
