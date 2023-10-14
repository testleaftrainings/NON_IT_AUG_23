package week6.day1;

public class LearnStatic {

	int id;
	String name; //non static variable
	static String companyName; //static variable


	//non static method
	public void empDetails(int id1,String name1,String companyName1) {

		id=id1;
		name=name1;
		companyName=companyName1;


	}



	public void printempDet() {
		System.out.println(id+";" +name+";" +companyName);
	}

	//static method no need to create object
	public static void add(int a,int b) {
		System.out.println(a+b);
	}


	public static void main(String[] args) {

		//static method directly we can call methodname alone
		add(7,5);

		LearnStatic ls=new LearnStatic();
		ls.empDetails(20,"Dilip","Tcs");
		ls.printempDet();

		LearnStatic ls1=new LearnStatic();
		ls1.empDetails(21, "Gokul", "Hcl");
		ls1.printempDet();
		ls.printempDet();//testleaf or hcl

		LearnStatic ls2=new LearnStatic();
		ls2.empDetails(22, "Vinoth", "Testleaf");
		ls2.printempDet();
		ls.printempDet();
		ls1.printempDet();
	}
}
