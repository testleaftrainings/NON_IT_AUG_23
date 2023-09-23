package week3.day1;

public class CBMW extends PCar{

	public void automatic() {
		System.out.println("automatic-> C");
	}
	
	
	public static void main(String[] args) {
		CBMW cb= new CBMW();
		cb.brake();
		cb.horn();
		cb.turnOnAC();
		cb.automatic();
	}
}
