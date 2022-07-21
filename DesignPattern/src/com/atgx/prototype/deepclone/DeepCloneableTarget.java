package com.atgx.prototype.deepclone;

import java.io.Serializable;

/**
 * @author lgx
 * @description:  深拷贝
 * @date 2022/7/189:19
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 9997867L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
