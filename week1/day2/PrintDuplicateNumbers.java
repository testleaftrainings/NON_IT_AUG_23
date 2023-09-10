package week1.day2;

import java.util.Arrays;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] number= {3,7,9,2,6,1,7,9,34,12,56};
		//forloop-1 or 2
		//1 for loop
		//2 for loop
		
		//number[0]-3
		//number[1]=7
		//number[2]=9
		//number[7]=
		//3---7,9,2........
		//7---9,2,6,1,7
		for (int i = 0; i < number.length; i++) {
			
			//number[1]-7,9,2,6,1,7,9,34,12,56
			//number[2]-9,2,6,1,9,..56
			//number[3]-2.. ....56
			for (int j = i+1; j < number.length; j++) {
				
				//7==7
				//9==9
				//3==9
				//3==2
				if(number[i]==number[j]) {
					System.out.println("Duplicate values :"+number[j]);
				}
			}
		}

		System.out.println("************************************");
		
		//sort number  -3,7,9,2,6,1,7,9,34,12,56
		Arrays.sort(number);
		//1,2,3,6,7,7,9,9,12,34,56
		
		for (int i = 0; i < number.length-1; i++) {
			//number[0]==num[1]
			//1==2
			//7==7
			if(number[i]==number[i+1]) {
				System.out.println("Duplicate values :"+number[i+1]);

			}
			
		}
	}

}
