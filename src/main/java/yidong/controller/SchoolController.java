package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @RequestMapping("select")
    public ResponseEntity<Map> select(){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",schoolService.selectAll());
        return new ResponseEntity<Map>(map,HttpStatus.OK);
    }
}
