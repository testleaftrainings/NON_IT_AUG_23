package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] num= {23,34,21,45,65,21,23,65,56,34};
//23,34,21,65
		
		Set<Integer> uniq= new LinkedHashSet<Integer>();
		//23,24,21,45,65,56
		
		for (Integer i : num) {
			uniq.add(i);
		}
		System.out.println(uniq);
		
		//convert my set in to list
		List<Integer> listdata=new ArrayList<Integer>(uniq);
		Integer a = listdata.get(3);
		System.out.println(a);
	}

}
