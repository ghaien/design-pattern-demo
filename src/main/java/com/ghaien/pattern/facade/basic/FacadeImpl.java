package com.ghaien.pattern.facade.basic;

/**
 * 外观接口实现类
 *
 * @author guo.haien
 * @date 2019/3/4 10:47
 */
public class FacadeImpl implements Facade {

    private SubSystemOne subSystemOne;

    private SubSystemTwo subSystemTwo;

    private SubSystemThree subSystemThree;

    private SubSystemFour subSystemFour;

    public FacadeImpl() {
        this.subSystemOne = new SubSystemOneImpl();
        this.subSystemTwo = new SubSystemTwoImpl();
        this.subSystemThree = new SubSystemThreeImpl();
        this.subSystemFour = new SubSystemFourImpl();
    }

    @Override
    public void methodA() {
        System.out.println("方法组A");
        subSystemOne.methodOne();
        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }

    @Override
    public void methodB() {
        System.out.println("方法组B");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
