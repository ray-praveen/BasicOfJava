package OOPs.Polymorphism.runTime.FunctionOverriding;

public class circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Circle drawing...");
    }

    public void personal(){
        System.out.println("Personal method of Circle...");
    }

}
