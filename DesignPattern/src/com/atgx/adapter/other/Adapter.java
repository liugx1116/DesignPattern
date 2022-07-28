package com.atgx.adapter.other;

/**
 * @author lgx
 * @description: TODO
 * @date 2022/7/2612:08
 */
public class Adapter extends Usber implements Ps2{
    @Override
    public void isPs2() {
        isUsb();
    }
}
