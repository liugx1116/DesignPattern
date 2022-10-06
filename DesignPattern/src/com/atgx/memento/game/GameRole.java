package com.atgx.memento.game;

/**
 * @author liugx
 * @Description TODO
 * @date 2022/10/6 18:20
 **/
public class GameRole {
    // 攻击力
    private int vit;
    // 防御力
    private int def;

    // 创建memento，根据当前状态得到memento
    public Memento createMenmento(){
        return new Memento(vit,def);
    }

    // 从备忘录恢复对象
    public void recoverGameRoleFromMenento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    // 显示当前游戏角色状态
    public void display(){
        System.out.println("游戏角色当前的共记录："+this.getVit()+"防御力："+this.def);
    }

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
}
