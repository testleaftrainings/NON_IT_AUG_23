package week3.day2;

public abstract class SbiHQ implements RBI{

	//abstract class have both implement and unimplements
	//0 to 100 % abstract method
	public void withdrawals() {
		
		System.out.println("withdrawals -10L");
	}

	public void kyc() {
		System.out.println("Kyc-Pan card");
	}
	public abstract void GoldLoan();
	
	
	public static void main(String[] args) {
		//RBI rbi=new RBI();-for interface i cannot create object
	
		//SbiHQ sbi=new SbiHQ();-for abstract class i cannot create object
	}

}
