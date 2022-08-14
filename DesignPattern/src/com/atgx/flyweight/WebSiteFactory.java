package com.atgx.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 设计模式- 享元模式
 * 网站工厂类，根据需要返回压一个网站
 */
public class WebSiteFactory {

    // 连接池
    private Map<String,ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    //获取网站分类的总数 (池中有多少个网站类型)
    public int getCount(){
        return pool.size();
    }
}

