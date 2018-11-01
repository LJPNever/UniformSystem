package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yidong.service.BigTypeService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/BigType")
public class BigTypeController {
    @Autowired
    private BigTypeService bigTypeService;


    /**
     * 获得所有的一级分类信息
     * @return
     */
    @RequestMapping("/getBig")
    public ResponseEntity<Map> getBig(){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",bigTypeService.selectBig());
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }

    /**
     * 添加一级分类
     * @param name
     * @return
     */
    @RequestMapping("/addBig")
    public ResponseEntity<Map> addBig(@RequestParam String name){
        Map map=new HashMap();
        if(bigTypeService.addBig(name)==1){
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
     * 根据Id删除分类
     * @param id
     * @return
     */
    @RequestMapping("/deleteBig")
    public ResponseEntity<Map> deleteBig(@RequestParam int id){
        Map map=new HashMap();
        if(bigTypeService.deleteById(id)==1){
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
