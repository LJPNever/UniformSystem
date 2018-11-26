package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yidong.model.Wholesale;
import yidong.service.RetailService;
import yidong.service.WholesaleService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Wholesale")
public class WholesaleController {
    @Autowired
    private WholesaleService wholesaleService;

    /**
     * 拿到当前日期全天批发总金额
     * @param time
     * @return
     */
    @ResponseBody
    @RequestMapping("/getDay")
    public ResponseEntity<Map> getDay(String time){

        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("status",1);
        map1.put("money",wholesaleService.getDay(time));
        map.put("data",map1);
        return new ResponseEntity<Map>(map, HttpStatus.OK);

    }

    /**
     * 拿到当前日期整周的批发总金额，上周周日到这周周六
     * @param time
     * @return
     */
    @ResponseBody
    @RequestMapping("/getWeek")
    public ResponseEntity<Map> getWeek(String time){

        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("status",1);
        map1.put("money", wholesaleService.getWeek(time));
        map.put("data",map1);
        return new ResponseEntity<Map>(map, HttpStatus.OK);

    }

    /**
     * 拿到当前日期整个月份的批发总金额
     * @param time
     * @return
     */
    @ResponseBody
    @RequestMapping("/getMonth")
    public ResponseEntity<Map> getMonth(String time){
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("status",1);
        map1.put("money", wholesaleService.getMonth(time));
        map.put("data",map1);
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }

    /**
     * 获取对应时间的批发
     * @param start
     * @param end
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectWholesale")
    public ResponseEntity<Map>selectWholesale(@RequestParam(value = "schoolName",required =false)String schoolName,@RequestParam String start, @RequestParam String end,@RequestParam int page,@RequestParam int limit){
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("start",start);
        map.put("end",end);
        map.put("schoolName",schoolName);
        map.put("begin",(page-1)*limit);
        map.put("over",limit);
        map1.put("status",1);
        map1.put("total",wholesaleService.selectCount(map));
        map1.put("data",wholesaleService.selectWholesale(map));
        return new ResponseEntity<Map>(map1,HttpStatus.OK);
    }
}
