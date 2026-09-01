package OOPs.Inheritance.Vechicle.Transport;

public class Vehicle {

    public String name;
    public String model;
    public int noOfTyres;

   public Vehicle(){

        this.name = "";
        this.model = "";
        this.noOfTyres = -1;

    }

    public Vehicle(String name, String model, int noOfTyres){

        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;

    }

    void startEngine(){
        System.out.println("Engine is starting of %s %s".formatted(name, model));
    }

    void stopEngine(){
        System.out.println("Engine is starting of " + name + " " + model);
    }

}
