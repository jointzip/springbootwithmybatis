package com.athome.springbootwithmybatis.common;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author zhaopo
 */
public class ImageStoreFactory {
    private static final Map<String, String> storeTypeMap = new HashMap<>(3);
    //初始化map数据
    static {
        for (Store_Enum value : Store_Enum.values()) {
            System.out.println("当前的map:" + storeTypeMap.toString());
            //存放在map中
            storeTypeMap.putIfAbsent(value.getName(),value.getType());
        }
    }

    @Autowired
    private SpringUtils springUtils;

    public ImageStore getImageStore(String name){
        String s = storeTypeMap.get(name);
        if(Objects.isNull(name)){
            return null;
        }
        return (ImageStore)springUtils.getBean(name);
    }
}
