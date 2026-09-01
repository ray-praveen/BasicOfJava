package OOPs.Inheritance.Vechicle.Transport;

public class Car extends  Vehicle {

    public int noOfDoors;
    public String transmission_Type;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmission_Type){
//        super(); // default ctor
//        this.noOfDoors =noOfDoors; //error
        super(name, model, noOfTyres); // parameterised ctor
        this.noOfDoors =noOfDoors;
        this.transmission_Type = transmission_Type;
//        super.startEngine();
//        super.stopEngine();

    }

    public void startAc(){
        System.out.println("Ac started of "  + name);
    }

}
