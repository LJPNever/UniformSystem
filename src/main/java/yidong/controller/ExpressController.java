package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yidong.model.Express;
import yidong.service.OrderformExpressService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/Express")
public class ExpressController {
    @Autowired
    private OrderformExpressService orderformExpressService;

    /**
     * 添加快递单信息
     * @param express
     * @return
     */
    @RequestMapping("/addExpress")
    public ResponseEntity<Map> addExpress(@RequestBody Express express){
        Map map=new HashMap();
        int a=orderformExpressService.addExpress(express);
       if(a==1){
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
}
