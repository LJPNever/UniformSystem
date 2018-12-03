package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yidong.model.BigModel;
import yidong.service.BigModelService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/BigModel")
public class BigModelController {
    @Autowired
    private BigModelService bigModelService;

    /**
     * 获取第一级规格
     * @return
     */
    @RequestMapping("/get")
    public ResponseEntity<Map> get(){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",bigModelService.get());
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }
    /**
     * 添加第一级规格
     * @return
     */
    @RequestMapping("/add")
    public ResponseEntity<Map> add(@RequestBody BigModel bigModel){
        Map map=new HashMap();
       if(bigModelService.add(bigModel)==1){
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
     * 根据id删除第一级规格
     * @return
     */
    @RequestMapping("/delete")
    public ResponseEntity<Map> delete(@RequestParam int id){
        Map map=new HashMap();
        if(bigModelService.delete(id)==1){
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
