class Vehicle{
	public void start(){
		System.out.println("Engine started...");
	}
	public void stop(){
		System.out.println("Engine Stopped...");
	}
}
class Car extends Vehicle{
	public void playMusic(){
		System.out.println("Music started....");
	}
}
class ElectricCar extends Car{
	public void charge(){
		System.out.println("Charging.....");
	}
}
public class MultiLevelInheritance {
    public static void main(String args[]){
		ElectricCar ec=new ElectricCar();
		ec.start();
		ec.playMusic();
		ec.charge();
		ec.stop();
	}
}
