package org.hxm.principle.singleResponsibility;

/**
 * @author aaron.hu
 * @version 1.0.0
 * @ClassName SignleResponsibility1.java
 * @Description TODO
 * @createTime 2021年05月18日 16:25:00
 */
public class SignleResponsibility2 {

    public static void main(String[] args) {

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        /***
         * 通过运行结果分析
         * 1、符合单一职责原则
         * 2、弊端
         *    1、需要增加新的类
         *    2、客户端调用时 需要new 不同的类
         * 3、这是最符合单一职责原则方案
         * 4、反单一职责原则
         *
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

class RoadVehicle{

    public void run(String vehicle){

        System.out.println(vehicle+":正在公路上运行");

    }

}
class WaterVehicle{

    public void run(String vehicle){

        System.out.println(vehicle+":正在水上运行");

    }

}
class AirVehicle{

    public void run(String vehicle){

        System.out.println(vehicle+":正在天上运行");

    }

}
