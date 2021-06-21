package org.hxm.principle.SingleResponsibility;

/**
 * @author aaron.hu
 * @version 1.0.0
 * @ClassName SignleResponsibility1.java
 * @Description TODO
 * @createTime 2021年05月18日 16:25:00
 */
public class SignleResponsibility3 {

    public static void main(String[] args) {

        Vehicle2 vehicle = new Vehicle2();
        vehicle.Roadrun("汽车");
        vehicle.Waterrun("飞机");
        vehicle.Airrun("轮船");
        /***
         * 通过运行结果分析
         * 1、类层面违反单一职责原则，但方法上是单一职责原则(比如:如果需要对汽车限行只需要修改RoadRun方法即可)
         * 2、反单一职责原则，只可在类中方法较少的情况下
         * 3、
         *{@Link SignleR esponsibility2}
         *
         *
         *
         *
         */
    }

}

/**
 * 交通工具类
 */

class Vehicle2{

    public void Roadrun(String vehicle){
        System.out.println(vehicle+":正在公路上运行");
    }
    public void Waterrun(String vehicle){
        System.out.println(vehicle+":正在公路上运行");
    }
    public void Airrun(String vehicle){
        System.out.println(vehicle+":正在公路上运行");
    }
}
