package OOPs.Inheritance.Vechicle.Test;

import OOPs.Inheritance.Vechicle.Transport.Vehicle;

public class Truck extends Vehicle {

    Truck(){
        super();
        this.name = "123"; // subclass protected call possible
    }

}
