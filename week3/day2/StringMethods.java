package week3.day2;

public class StringMethods {

	public static void main(String[] args) {
		String name="Test Leaf";
		//Dilip kumar
		//ramuk piliD
		// Dilip
		// Kumar
		//piliD ramuk
		
		//m1-split
		String[] split = name.split(" ");
		for (int i = 0; i < split.length; i++) {
			//System.out.println(split[i]);
			char[] charArray = split[i].toCharArray();
			for (int j = charArray.length-1; j >=0 ; j--) {
				System.out.print(charArray[j]);
			}
		}
		
		System.out.println("***************");
		
		//m2-replace
		
		String mentorName="Vinotht";
		String replace = mentorName.replace('t', 'D');
		System.out.println(replace);
		
		//m3-replaceAll
		
		String mentor="Gokul@123";
		String replaceAll = mentor.replaceAll("[a-z A-Z 0-9]", "a");
		System.out.println(replaceAll);
		
		//m4-subString
		
		String mentors="Ranjini";
		String substring = mentors.substring(3);
		System.out.println(substring);
		
		String substring2 = mentors.substring(2, 7);
		System.out.println(substring2);
		
		//m5-lowercase
		
		String comName="TestLeaf";
		
		String lowerCase = comName.toLowerCase();
		
		System.out.println(lowerCase);
		
		//m6
		String upperCase = comName.toUpperCase();
		System.out.println(upperCase);
		
		//m7
		String price="2500";
		
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);
		
	}

}
