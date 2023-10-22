package week7.day2;

public class LearnThrowAndThrows {

	public static void main(String[] args) throws InterruptedException {

		int a=15;
		if(a<5) {
			System.out.println("pass");
		}else {
			throw new RuntimeException("number is not correct");
		}
		
		//throws
		Thread.sleep(2000);
	}

}