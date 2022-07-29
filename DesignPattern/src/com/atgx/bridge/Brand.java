package com.atgx.bridge;

/**
 * @author lgx
 * @description: 桥接模式-> 行为实现类的接口
 * @date 2022/7/298:25
 */
public interface Brand {
    void open();
    void close();
    void call();
}
