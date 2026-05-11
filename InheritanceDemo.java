class Vehicle {
    public void start() {
        System.out.println("Vehicle started...");
    }
    public void stop(){
        System.out.println("Vehicle stopped...");
    }
}
class Car extends Vehicle {
    public void playMusic() {
        System.out.println("Music played...");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.start(); // Inherited method from Vehicle
        v1.stop(); // Inherited method from Vehicle
        Car c = new Car();
        c.start(); // Inherited method from Vehicle
        c.playMusic(); // Method of Car
        c.stop(); // Inherited method from Vehicle
        Car c1 = new Car();
        c1.start(); // Inherited method from Vehicle
        c1.playMusic(); // Method of Car
        c1.stop(); // Inherited method from Vehicle
    }
}
