package week3.day2;

import java.util.ArrayList;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class LearnList {

	public static void main(String[] args) {
		List<String> mentors= new ArrayList<String>();
		
		//add()
		mentors.add("Aathi");
		mentors.add("Gokul");
		mentors.add("Muthu");
		mentors.add("Vinoth");
		mentors.add("Ranjini");
		mentors.add("Mukesh");
		System.out.println(mentors);
		
		//get()-index -'0'
		String name = mentors.get(3);
		System.out.println(name);
		
		//remove
		mentors.remove(2);
		System.out.println(mentors);
		
		//add-my name ,pos-2
		
		mentors.add(2, "Dilip");
		System.out.println(mentors);
		
		//contains
		
		boolean contains = mentors.contains("Muthu");
		System.out.println(contains);
		
		//clear
		/*
		 * mentors.clear(); System.out.println(mentors);
		 */

		for (int i = 0; i <mentors.size(); i++) {
		
			System.out.println(mentors.get(i));
			
		}

		
		
		
		
		
		
		

		
		
	}

}
