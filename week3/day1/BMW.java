package week3.day1;

public class BMW extends Vehicle {

public void applyBreake() {
	System.out.println("Abs break");
}
public static void main(String[] args) {
	BMW car=new BMW();
	car.applyBreake();
	car.soundHorn();
	
}
	
}
