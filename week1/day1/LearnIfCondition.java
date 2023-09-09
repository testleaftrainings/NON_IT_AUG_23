package week1.day1;

public class LearnIfCondition {

	public static void main(String[] args) {
		
		int mark=400;
		
		//if->ctrl+space
		//460>=450
		//430>=450
		//400>=450
		if (mark>=450) {
			System.out.println("Iphone :"+mark);
		} 
		
		//430>400
		//400>400
		else if (mark>400){
			System.out.println("Smart Phone :"+mark);
		}
		
		else {
System.out.println("Nothing :"+mark);
		}

	}

}
