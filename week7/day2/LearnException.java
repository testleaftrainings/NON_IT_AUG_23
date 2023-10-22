package week7.day2;

public class LearnException {

	public static void main(String[] args) {

		int x=10;
		int y=2;
		
		int[] age= {23,54,21,22,13,19};
		
		
		try {
			System.out.println(age[7]);
			System.out.println(x/y);//try getting fail that time catch will do that action
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(age[8]);
		}
		catch (Exception at) {
			System.out.println(at);
			System.out.println("2nd catch block : "+age[3]);
					}
		finally {
			System.out.println("error is occur");
		}
		System.out.println("execution done");
		
	}

}
