package week3.day1;

public class Car extends Vehicle {

	public void turnOnAc() {
		System.out.println(" Turn on A/c");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.applyBreake();
		c.soundHorn();
		c.turnOnAc();
	}
}
