package week3.day1;

public class LearnMethodOverLoading {

	//browser
	public void browser() {
System.out.println("Default browser");
	}

	public void browser(int version) {
      System.out.println(version);
	}
	public void browser(int version,String name) {

		System.out.println("Browser :"+version+" "+"Name : "+name);
	}

	public void browser(String name,int version) {
		System.out.println("Name : "+name+" "+"Browser :"+version);
	}
	
public static void main(String[] args) {
	LearnMethodOverLoading ol= new LearnMethodOverLoading();
	ol.browser();
	ol.browser(117);
	ol.browser(118, "Chrome");
	ol.browser("Edge", 116);
}

}
