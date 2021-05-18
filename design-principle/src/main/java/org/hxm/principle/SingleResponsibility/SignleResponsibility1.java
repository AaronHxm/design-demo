package org.hxm.principle.SingleResponsibility;

/**
 * @author aaron.hu
 * @version 1.0.0
 * @ClassName SignleResponsibility1.java
 * @Description TODO
 * @createTime 2021年05月18日 16:25:00
 */
public class SignleResponsibility1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
        /***
         * 通过运行结果分析
         * 1、飞机和轮船不是在地面上运行
         * 2、违反单一职责原则
         * 3、改进方法
         *{@Link SignleResponsibility2}
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

class Vehicle{

    public void run(String vehicle){

        System.out.println(vehicle+":正在公路上运行");

    }

}
