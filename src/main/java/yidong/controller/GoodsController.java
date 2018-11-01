package yidong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import yidong.Util.IsEmpty;
import yidong.Util.UUIDUtils;
import yidong.model.Goods;
import yidong.model.GoodsModel;
import yidong.model.Modle;
import yidong.service.GoodsService;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static yidong.Util.Qiniu.uploadQNImg;

@RestController
@RequestMapping("/Goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 根据条件筛选排序商品，当state=0或者createTime=0,smallType=0时不启用条件
     * state为商品的状态，createTime则表示根据创建时间降序,smallType表示商品分类
     * @param state
     * @param createTime
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/selectGooods")
    public ResponseEntity<Map> selectGoods(@RequestParam(value = "state",required = false)int state,
                                            @RequestParam(value = "createTime",required = false)int createTime,
                                           @RequestParam(value = "smallTypeId",required = false)int smallTypeId,
                                           @RequestParam int page,@RequestParam int limit){
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("state",state);
        map.put("createTime",createTime);
        map.put("smallTypeId",smallTypeId);
        map.put("start",(page-1)*limit);
        map.put("end",limit);
        map1.put("status",1);
        map1.put("data",goodsService.selectGoods(map));
        map1.put("total",goodsService.selectCount(map));
        return new ResponseEntity<Map>(map1, HttpStatus.OK);
    }

    /**
     * 根据商品Id返回具体的信息
     * @param id
     * @return
     */
    @RequestMapping("/selectById")
    public ResponseEntity<Map> selectById(@RequestParam int id){
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",goodsService.selectById(id));
        return new ResponseEntity<Map>(map,HttpStatus.OK);
    }

    /**
     * 上传图片，并返回图片的地址
     * @param multipartFile
     * @return
     * @throws IOException
     */
    @RequestMapping("/getImg")
    public ResponseEntity<Map> getImg(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        FileInputStream inputStream = (FileInputStream) multipartFile.getInputStream();
        String path = uploadQNImg(inputStream, UUIDUtils.getUUID());
        Map map=new HashMap();
        Map map1=new HashMap();
        map1.put("img",path);
        map.put("status",1);
        map.put("data",map1);
        return new ResponseEntity<Map>(map,HttpStatus.OK);
    }

    /**
     * 添加商品
     * @param goods
     * @return
     */
    @RequestMapping("/addGoods")
    public ResponseEntity<Map> addGoods(@RequestBody Goods goods){


        Map map=new HashMap();
        if(goodsService.addGoods(goods)==1){
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
     * 批量下架
     * @param list
     * @return
     */
    @RequestMapping("/updata")
    public ResponseEntity<Map> updata(@RequestBody List<Modle> list){
        Map map=new HashMap();
        if(goodsService.updateState(list)!=0){
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
     * 批量删除商品
     * @param list
     * @return
     */
    @RequestMapping("/delete")
    public ResponseEntity<Map> delete(@RequestBody List<Modle> list){
        Map map=new HashMap();
        if(goodsService.delete(list)!=0){
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
     * 批量分类
     * @param goodsModel
     * @return
     */
    @RequestMapping("/updateSmall")
    public ResponseEntity<Map> updateSmall(@RequestBody GoodsModel goodsModel){
        Map map=new HashMap();

        if(goodsService.updatesmallTypeId(goodsModel)!=0){
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
     * 批量修改价格，选定二级分类和二级规格，然后批量更改
     * @param smallTypeId
     * @param smallModelId
     * @param price
     * @return
     */
    @RequestMapping("/updatePrice")
    public ResponseEntity<Map> updateBatch(@RequestParam int smallTypeId,@RequestParam int smallModelId,@RequestParam int price){
        Map map=new HashMap();
        if(goodsService.updateBatch(smallTypeId,smallModelId,price)!=0){
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
     * 修改商品，商品的创建时间不可以改。其他可以，价格部分则只能改价钱和库存。规格不能更改
     * @param goods
     * @return
     */
    @RequestMapping("/updateGoods")
    public ResponseEntity<Map>updateGoods(@RequestBody Goods goods){
        Map map=new HashMap();
        if(goodsService.updateGoods(goods)!=0){
            map.put("status",1);
            map.put("data",null);
            return new ResponseEntity<Map>(map,HttpStatus.OK);
        }else {
            map.put("status",0);
            map.put("data",null);
            return new ResponseEntity<Map>(map,HttpStatus.OK);
        }

    }
}
