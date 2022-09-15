package com.atgx.responsibilitychain;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-14  11:59
 * @Description: 职责链模式-具体处理者
 * @Version: 1.0
 */
public class CollegeApprover extends Approver{
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
