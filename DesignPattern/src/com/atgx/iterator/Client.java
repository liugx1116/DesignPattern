package com.atgx.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // 创建学院
        List<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoColleage = new InfoCollege();
        colleges.add(computerCollege);
        colleges.add(infoColleage);
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.pringColeage();

    }
}
