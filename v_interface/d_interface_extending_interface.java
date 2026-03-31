package v_interface;

interface Vehicle {
    public void accelerate();
}

interface Car extends Vehicle {
    public void run();
}

class Bike implements Car {

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating...");
    }

    @Override
    public void run() {
        System.out.println("Bike is running");
    }

}

public class d_interface_extending_interface {
    public static void main(String[] args) {
        Bike bv = new Bike();
        bv.accelerate();
        bv.run();
    }
}