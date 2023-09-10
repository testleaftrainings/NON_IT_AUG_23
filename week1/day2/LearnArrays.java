package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		String[] mentors= {"Athi","Gokul","Ragu","Mukesh" ,"Dilip","Muthu","Ranjini",
				"vinoth"};
		
		//0-7-->8
		//0-8-->9
		int [] age= {20,17,67,34,68,33};
		//17,20,33,34,67,68
		
		//length-property
		int mentorSize = mentors.length;
		System.out.println("size present in the arrays :"+mentorSize);
		
		//print first value is present in the array
		System.out.println("first data present in the array :"+mentors[0]);
	
	//print last value is present in the array
		System.out.println("last data present in the array :"+mentors[mentorSize-1]);
		
		//print Muthu names
		System.out.println("print muthu's name :"+ mentors[mentorSize-3]);
		
		//sort data
		
		Arrays.sort(age);
		System.out.println("expect value 17 :"+age[0]);
		
		//print all values after sorting
		
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		for (int i = 0; i < mentorSize; i++) {
			System.out.println(mentors[i]);
		}
		
		for (int i =age.length-1 ; i >=0 ; i--) {
			System.out.println(age[i]);
		}
	}

}
