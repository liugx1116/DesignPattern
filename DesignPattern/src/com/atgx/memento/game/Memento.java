package com.atgx.memento.game;

/**
 * @author liugx
 * @Description  备忘录模式-游戏
 * @date 2022/10/6 18:18
 **/
public class Memento {
    // 攻击力
    private int vit;
    // 防御力
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Memento(int vit, int def) {

        this.vit = vit;
        this.def = def;
    }
}
