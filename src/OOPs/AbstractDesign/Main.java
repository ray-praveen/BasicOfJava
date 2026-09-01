//package OOPs.AbstractDesign;
//
//abstract class Bird{
//
//    abstract void fly(); //abstract -> upar upar se concept
//    abstract void eat();
//
//}
//
//class Sparrow extends Bird {
//
//    @Override
//    void fly() {
//        System.out.println("Sparrow Flying alag way se");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow Eating");
//    }
//}
//
//class Crow extends Bird {
//
//    @Override
//    void fly() {
//        System.out.println("Crow Flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow Eating");
//    }
//}
//
//
//public class Main {
//
//    public static void doBirdStuff(Bird b){
//        b.fly();
//        b.eat();
//    }
//
//    static void main(String[] args) {
////        Bird b = new Bird() {
////            @Override
////            void fly() {
////
////            }
////
////            @Override
////            void eat() {
////
////            }
////        };
//
////        Bird c = new Sparrow();
////        c.eat();
////        c.fly();
////
////        c = new Crow();
////        c.eat();
////        c.fly();
//
//        doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
//
//    }
//
//}


//Interface
package OOPs.AbstractDesign;

import OOPs.Polymorphism.compileTime.methodOverloading.Calculator;

interface Bird{
    void fly();
    void eat();
}

class Sparrow implements Bird {


    @Override
    public void fly() {
        System.out.println("Sparrow fly 23e23e42");
        System.out.println("Sparrow fly 2eddddf4rfdgdgdgd");
        System.out.println("Sparrow fly 34344ft5m4ktm");
        System.out.println("Sparrow fly 2"); // changes in implement no need to change in interface call b.fly()!!
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }
}

class Crow implements Bird {


    @Override
    public void fly() {
        System.out.println("Crow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating");

    }
}


public class Main {

    public static void doBirdStuff(Bird b){
        b.fly();
        b.eat(); //interface
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();

    }

    static void main(String[] args) {
//        Bird b = new Bird() {
//            @Override
//            void fly() {
//
//            }
//
//            @Override
//            void eat() {
//
//            }
//        };

//        Bird c = new Sparrow();
//        c.eat();
//        c.fly();
//
//        c = new Crow();
//        c.eat();
//        c.fly();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

    }

}
