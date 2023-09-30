package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSET {

	public static void main(String[] args) {

		String name="TestLEaf";
		
		String lowerCase = name.toLowerCase();
	
		char[] charArray = lowerCase.toCharArray();
		
		//set syntax
		
		Set<Character>uniq= new LinkedHashSet<Character>();
		
		for (Character ch : charArray) {
			uniq.add(ch);
		}
		System.out.println(uniq);
	}

}
