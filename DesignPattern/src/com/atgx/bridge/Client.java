package com.atgx.bridge;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/298:37
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("========折叠三星手机======");
        Phone phone1 = new FoldedPhone(new Samsung());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("=======折叠苹果手机==========");
        FoldedPhone foldedPhone = new FoldedPhone(new Apple());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        System.out.println("============直立三星手机=============");
        UpRightPhone upRightPhone = new UpRightPhone(new Samsung());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
    }


}
