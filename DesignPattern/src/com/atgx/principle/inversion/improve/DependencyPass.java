package com.atgx.principle.inversion.improve;

/**
 * @author kingdee
 * @description: 依赖关系传递的三种方式
 * @date 2022/6/168:55
 */
public class DependencyPass {
    public static void main(String[] args) {
        // 通过接口传递实现依赖
        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

        //通过构造器进行依赖传递
//        ITV itv = new SANGXING();
//        OpenAndClose openAndClose = new OpenAndClose(itv);
//        openAndClose.open();
        //通过setter方法进行依赖传递
        OpenANdClose openANdClose = new OpenANdClose();
        openANdClose.setTv(changHong);
        openANdClose.open();

    }
}
// 方式1： 通过接口传递实现依赖
//interface IopenAndClose{
//    public void open(ITV itv); //抽象方法,接收接口
//}
//interface ITV{
//    public void play();
//}
//
//class ChangHong implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开");
//    }
//}
//
//class OpenAndClose implements IopenAndClose{
//
//    @Override
//    public void open(ITV itv) {
//        itv.play();
//    }
//}

// 方式2: 通过构造方法依赖传递
// interface IOpenAndClose {
// public void open(); //抽象方法
// }
// interface ITV { //ITV接口
// public void play();
// }
// class OpenAndClose implements IOpenAndClose{
//     public ITV tv; //成员
//
//     public OpenAndClose(ITV tv){
//         this.tv = tv;
//     }
//     @Override
//     public void open() {
//         tv.play();
//     }
// }
//class SANGXING implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("sanxing电视机，打开");
//    }
//}

interface IOpenAndClose{
    public void open();

    public void setTv(ITV itv);
}

interface ITV{
    public void play();
}
class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}

class OpenANdClose implements IOpenAndClose{

    private ITV itv;
    @Override
    public void open() {
        itv.play();
    }

    @Override
    public void setTv(ITV itv) {
        this.itv = itv;
    }
}