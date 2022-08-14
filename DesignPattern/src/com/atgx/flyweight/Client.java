package com.atgx.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSiteCategory1 = factory.getWebSiteCategory("1");
        webSiteCategory1.use(new User("cs1"));

        WebSite webSiteCategory2 = factory.getWebSiteCategory("2");
        webSiteCategory2.use(new User("cs2"));

        WebSite webSiteCategory3 = factory.getWebSiteCategory("2");
        webSiteCategory3.use(new User("cs3"));

        int count = factory.getCount();
        System.out.println("连接数："+count);

    }
}
