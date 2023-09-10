package week1.day2;

public class LearnMethods {

	//if i need create method -inside class level
	//not inside the main method
	
	public void browserOpen() {
		System.out.println("Browser is opened");

	}
	
	//default modifier
	 void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	public int browserversion() {
		return 116;
	}
	
	//private modifier
	private String browserName(String name) {
		//System.out.println("Browser name :"+name);
		return name;
	}
	
	public static void main(String[] args) {
		
		//step1
		//syntax- classname objectname= new classname();
		
		LearnMethods details= new LearnMethods();
		
		//step2
		//objectname.methodname
		details.browserOpen();
		details.add(20, 20);
		
		//return-2 ways
		System.out.println(details.browserName("chrome"));
		
		//ctrl+2+L->local variable
		int version = details.browserversion();
		System.out.println(version);
		
	}
	

}
