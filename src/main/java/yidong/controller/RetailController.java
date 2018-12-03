package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yidong.Util.IsEmpty;
import yidong.model.Retail;
import yidong.service.RetailService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/Retail")
public class RetailController {
    @Autowired
    private RetailService retailService;

    /**
     * 拿到当前日期全天的零售总金额
     * @param time
     * @return
     */
    @ResponseBody
    @RequestMapping("/getDay")
    public ResponseEntity<Map> getDay(String time){
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("status",1);
        map1.put("money",retailService.getDay(time));
        map.put("data",map1);
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }

    /**
     * 拿到当前日期整周的零售总金额，上周周日到这周周六
     * @param time
     * @return
     */
    @ResponseBody
    @RequestMapping("/getWeek")
    public ResponseEntity<Map> getWeek(String time){
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("status",1);
        map1.put("money",retailService.getWeek(time));
        map.put("data",map1);
        return new ResponseEntity<Map>(map, HttpStatus.OK);


    }

    /**
     * 拿到当前日期整个月份的零售总金额
     * @param time
     * @return
     */
    @ResponseBody
    @RequestMapping("/getMonth")
    public ResponseEntity<Map> getMonth(String time){
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("status",1);
        map1.put("money",retailService.getMonth(time));
        map.put("data",map1);
        return new ResponseEntity<Map>(map, HttpStatus.OK);


    }


    /**
     * 获取对应时间的零售
     * @param start
     * @param end
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectRetail")
    public ResponseEntity<Map> selectRetail(@RequestParam(value = "schoolName",required =false)String schoolName,@RequestParam String start,@RequestParam String end,@RequestParam int page,@RequestParam int limit
    ){
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("start",start);
        map.put("end",end);
        map.put("schoolName", IsEmpty.isEmpty(schoolName));
        map.put("begin",(page-1)*limit);
        map.put("over",limit);
        map1.put("status",1);
        map1.put("data",retailService.selectRetail(map));
        map1.put("total",retailService.selectCount(map));
        return new ResponseEntity<Map>(map1,HttpStatus.OK);
    }
}
