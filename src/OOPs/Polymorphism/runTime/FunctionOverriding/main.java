package OOPs.Polymorphism.runTime.FunctionOverriding;

public class main {

    public static void main(String[] args){

//        //runtime polymorphism
//        circle c = new circle();
////        c.draw();
//
//        doDraingStuff(new Shape());
//        doDraingStuff(c);
//
//        Rect r = new Rect();
////        r.draw(); // draw is polymorphic depend on requirement
//        doDraingStuff(r);
//
//        Shape s = new Shape();
//        doDraingStuff(s);

        //downCasting
//        circle c = new circle();
//        doDraingStuff(c);

        Rect r = new Rect();
        doDraingStuff(r);
    }

    public static void doDraingStuff(Shape s){
        s.draw(); // polymorphic
        circle c = (circle)s; // downCasting
        c.personal();
    }

}
