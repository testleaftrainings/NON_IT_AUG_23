package week3.day2;

public class Concrete extends SbiHQ{

	public static void main(String[] args) {

		Concrete exe=new Concrete();
		
		exe.withdrawals();
		exe.kyc();
		exe.fdRate();
	}

	public void fdRate() {
		System.out.println("fd-5.5%/pa");
		
	}

	@Override
	public void GoldLoan() {
		System.out.println("GoldLoan -4.5%/pa");
		
	}

}
