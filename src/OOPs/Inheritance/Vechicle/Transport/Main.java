package OOPs.Inheritance.Vechicle.Transport;

public class Main {

    public static void main(String[] args){

//        Car c = new Car("maruti", "800", 4, 5, "Auto");
//        c.startEngine();
//        c.startAc();
//        c.stopEngine();

        MotorCycle m = new MotorCycle("Splender", "Xliine", 2, "U", "Soft");
        m.startEngine();
        m.wheelie();
        m.startEngine();

    }

}
