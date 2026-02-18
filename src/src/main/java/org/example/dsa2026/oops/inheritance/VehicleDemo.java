package org.example.dsa2026.oops.inheritance;
class VehicleManu{
    String carname;
    long price;
    public VehicleManu(String name, long price){
        this.carname = name;
        this.price = price;
    }
    public void Accessories(){
        System.out.println("Car Name : " + carname);
        System.out.println("Price of the Car : " + price);
    }
}

class FourWheeler extends VehicleManu{

    public FourWheeler(String name, long price) {
        super(name, price);
    }
    public void speed(){
        System.out.println("This is a Super Car");
    }

}
public class VehicleDemo {
    public static void main(String[] args) {
        FourWheeler fourWheeler = new FourWheeler("Land Cruser", 2600000);
        fourWheeler.Accessories();
        fourWheeler.speed();
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("\n");

        VehicleManu fourWheeler2 = new FourWheeler("Bugati",3500000);
        fourWheeler2.Accessories();
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("\n");

        VehicleManu vehicleManu = new VehicleManu("Maruti",240000);
        vehicleManu.Accessories();

       // FourWheeler fourWheeler4 = new VehicleManu("Safari",2340000); -> this gives error
        // because we are creating parent class object and reference is child class
    }
}
