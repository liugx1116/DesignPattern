package com.atgx.proxy.staticproxy;

/**
 * 静态代理- 代理类
 */
public class TeachDaoProxy implements ITeacherDao{
    // 目标对象，通过接口来聚合
    ITeacherDao teacherDao;

    public TeachDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        teacherDao.teach();
        System.out.println("结束代理");

    }
}
