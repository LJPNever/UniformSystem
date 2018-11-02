package yidong.Util;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import yidong.Util.ConstantQiniu;

import java.io.FileInputStream;


public class Qiniu {



    /**
     * 将图片上传到七牛云
     */
    public static String uploadQNImg(FileInputStream file, String key) {

        //七牛云对应的信息

         ConstantQiniu constantQiniu=new ConstantQiniu("tCXIZtggBOHG34FpJ87EqrWEvjULwsJVrM6IfBJu","ac81KB5mm3Zo6x9zRi7iTo3o4wdHJhi0lfl-J1tF",
                 "never","pbvxr9z7k.bkt.clouddn.com");
        // 构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone2());
        // 其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        // 生成上传凭证，然后准备上传

        try {
            Auth auth = Auth.create(constantQiniu.getAccessKey(), constantQiniu.getSecretKey());
            String upToken = auth.uploadToken(constantQiniu.getBucket());
            try {
                Response response = uploadManager.put(file, key, upToken, null, null);
                // 解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);

                String returnPath = "http://"+constantQiniu.getPath() + "/" + putRet.key;
                return returnPath;
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}