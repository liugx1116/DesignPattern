package com.atgx.responsibilitychain;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-14  10:57
 * @Description: 职责链模式-具体处理者
 * @Version: 1.0
 */
public class DepartmentApprover extends Approver{
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println("请求编号 id = "+purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
