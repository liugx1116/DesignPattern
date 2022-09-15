package com.atgx.responsibilitychain;

/**
 * @Author: liugx
 * @CreateTime: 2022-09-14  10:35
 * @Description: 责任链模式-抽象处理者
 * @Version: 1.0
 */
public abstract class Approver {
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 下一个审批者
     *
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
     *
     * @param purchaseRequest
     */
    abstract void processRequest(PurchaseRequest purchaseRequest);
}
