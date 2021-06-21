package org.hxm.principle.segreation;

/**
 * @author aaron.hu
 * @version 1.0.0
 * @ClassName Segreation1.java
 * @Description TODO
 * @createTime 2021年05月25日 10:44:00
 */
public class Segreation1 {
    public static void main(String[] args) {

    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("类B实现了operation1 ");
    }

    @Override
    public void operation2() {
        System.out.println("类B实现了operation2 ");
    }

    @Override
    public void operation3() {
        System.out.println("类B实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("类B实现了operation4 ");
    }

    @Override
    public void operation5() {
        System.out.println("类B实现了operation5 ");
    }
}

class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("类D实现了operation1 ");
    }

    @Override
    public void operation2() {
        System.out.println("类D实现了operation2 ");
    }

    @Override
    public void operation3() {
        System.out.println("类D实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("类D实现了operation4 ");
    }

    @Override
    public void operation5() {
        System.out.println("类D实现了operation5 ");
    }
}

//类A Interface1 使用B类， 123 接口
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }
}

//类c通过Interface1 使用D类 145 接口
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }
}