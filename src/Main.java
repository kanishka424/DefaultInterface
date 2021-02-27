import java.util.function.DoubleToIntFunction;

interface Demo{
    default void show(){
        System.out.println("Demo show");
    }
}

interface Demo2{
    default void show(){
        System.out.println("Demo show 2");
    }
}


interface Demo3 {
    public static void sayStatic() {//3.ststic method in interfaces
        System.out.println("DemoImpl say Static");
    }
}

class  DemoImpl implements Demo{
    public void sayHi(){
        System.out.println("DemoImpl say Hi");
    }

}


class  DemoImpl2 implements Demo,Demo2 {
    public void sayHi() {
        System.out.println("DemoImpl2 say Hi");
    }


    @Override
    public void show() {//2.when two interfaces the calss implements have same default method
        System.out.println("Demo Impl show");
    }

}


class  DemoImpl3 implements Demo3 {
    public void sayHi() {
        System.out.println("DemoImpl3 say Hi");
    }




}






    public class Main {
    public static void main(String[] args) {
        DemoImpl demoImpl=new DemoImpl();
        demoImpl.show();
        demoImpl.sayHi();//1.default method in interface



        DemoImpl2 demoImpl2=new DemoImpl2();//2.when two interfaces the calss implements have same default method
        demoImpl2.show();
        demoImpl2.sayHi();


Demo3.sayStatic();//3.when a static method i declared  in interface


    }
}



//==========================================NOTE==============================================

//CLASS METHOD IS POWERFUL THAN INTERFACE SO CLASS METHOD WILL OVERRIDE INTERFACE IF SAME METHOD IS ENCOUNTERED