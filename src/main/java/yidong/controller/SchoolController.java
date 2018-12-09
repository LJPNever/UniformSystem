package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yidong.model.School;
import yidong.service.SchoolService;

import javax.crypto.Mac;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api/School")
@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/add")
    public ResponseEntity<Map> add(@RequestBody School school){
        Map map=new HashMap();
        if(schoolService.addSchoolName(school)!=0){
        map.put("status",1);
        map.put("data","添加成功");
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }
    else {
            map.put("status",0);
            map.put("data","失败");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
    }

    @RequestMapping("/select")
    public ResponseEntity<Map> select(int smallTypeId){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",schoolService.selectAll(smallTypeId));
        return new ResponseEntity<Map>(map,HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{schoolName}",method = RequestMethod.DELETE)
    public ResponseEntity<Map> delete(@PathVariable() String schoolName){
        Map map=new HashMap();

        if(schoolService.delete(schoolName)!=0){
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
