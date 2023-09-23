
package week3.day1;

public class PCar extends GpVehicle{

	public void turnOnAC() {
		System.out.println("AC-> P");
	}
	
	public static void main(String[] args) {
		PCar pc= new PCar();
		pc.brake();
		pc.horn();
		pc.turnOnAC();
	}
}
