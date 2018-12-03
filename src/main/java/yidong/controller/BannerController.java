package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yidong.model.Banner;
import yidong.service.BannerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/Banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @ResponseBody
    @RequestMapping("/selectAll")
    public ResponseEntity<Map> select(){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",bannerService.selectAll());
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }




    @ResponseBody
    @RequestMapping("/delete")
    public ResponseEntity<Map> delete(@RequestParam String imgAddress){
        Map map=new HashMap();
        if(bannerService.delete(imgAddress)!=0) {
            map.put("status", 1);
            map.put("data", null);
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
        else {

            map.put("status", 0);
            map.put("data", null);
            return new ResponseEntity<Map>(map, HttpStatus.OK);

        }
    }


    @ResponseBody
    @RequestMapping("/add")
    public ResponseEntity<Map> add(@RequestBody List<Banner> list){
        Map map=new HashMap();
        if(bannerService.add(list)!=0) {
            map.put("status", 1);
            map.put("data", null);
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
        else {

            map.put("status", 0);
            map.put("data", null);
            return new ResponseEntity<Map>(map, HttpStatus.OK);

        }
    }
}
