package OOPs.Polymorphism.compileTime.methodOverloading;

public class Main {

    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2, 3, 5, 2.6));
        System.out.println(c.add(2, 3, 2.6));
    }


}
