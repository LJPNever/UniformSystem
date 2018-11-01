package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;
import yidong.model.Smalltype;
import yidong.service.SmallTypeService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/SmallType")
public class SmallTypeController {
    @Autowired
    private SmallTypeService smallTypeService;

    /**
     * 根据一级分类的ID获取对应所有二级分类
     * @param id
     * @return
     */
    @RequestMapping("/selectById")
    public ResponseEntity<Map> selectById(@RequestParam int id){
        Map map= new HashMap();
        map.put("status",1);
        map.put("data",smallTypeService.selectById(id));
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }


    /**
     * 添加二级分类
     * @param name
     * @return
     */
    @RequestMapping("/addSmall")
    public ResponseEntity<Map> addBig(@RequestBody Smalltype smalltype){
        Map map=new HashMap();
        if(smallTypeService.addBig(smalltype)==1){
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
     * 根据Id删除二级分类
     * @param id
     * @return
     */
    @RequestMapping("/deleteSmall")
    public ResponseEntity<Map> deleteBig(@RequestParam int id){
        Map map=new HashMap();
        if(smallTypeService.deleteById(id)==1){
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
