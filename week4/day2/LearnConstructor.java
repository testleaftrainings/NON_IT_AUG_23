package week4.day2;

public class LearnConstructor {

	int a;
	String name;
	
//default type-1
public  LearnConstructor() {
	System.out.println("its default constructor");
}

//parametrized  type -2
public  LearnConstructor(int a,int b) {
	this();
	System.out.println("parametrized constructor :"+(a+b));
	
}

public LearnConstructor(String name) {
	this(5,7);
	System.out.println(this.name=name);
}

//constructor overloading
//constructor chaining

public static void main(String[] args) {
	
	LearnConstructor lc1= new LearnConstructor("TestLeaf");
	
}

}
