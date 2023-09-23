package week3.day1;

public class Vehicle extends LearnMethodOverRiding {

	
	
	public void applyBrake(int a) {
		System.out.println("ABS brake");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Vehicle v= new Vehicle();
		v.applyBrake(7);
	}
}
