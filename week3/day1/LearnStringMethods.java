package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {

		String companyName="Test Leaf";
		
		String name="Test leaf";
		
		String cN=new String("Test Leaf");
		
		//m1-length-ctrl-2-l
		
		int length = companyName.length();
		System.out.println("number char :"+length);
		
		//m2-equals()
		//== & equals()
		//== will compare the memory address values
		//equals()-string value
		
		if(companyName==cN) {
			System.out.println("its equal");
		}else {
			System.out.println("its not equal");
		}
		
		
		
		if(companyName.equals(cN)) {
			System.out.println("its equal");
		}else {
			System.out.println("its not equal");
		}
		
		//m3-equalsIgnoreCase()
		
		if(companyName.equalsIgnoreCase(name)){
			System.out.println(" equalsIgnoreCase()->its equal");
		}else {
			System.out.println(" equalsIgnoreCase()-> its not equal");
		}
		
		//m4-contains
		boolean contains = cN.contains("T");
		System.out.println(contains);
		
		//m5-tochararray
		
		String name1="Testleaf";
		
		char[] charArray = name1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		//m6-charAt
		//index-start '0'
		char charAt = name1.charAt(2);
		System.out.println(charAt);
		
		
	}
	
	
	
	
	

}
