package learnattributes;

import org.testng.annotations.Test;

public class LearnPriority {

	/*default=0
	 * Ascii order-no priority
	 * -ve accepted
	 * which method lowest priority that will executed first
	 */
	
	/*1.priority- default =0
	 *2.enabled- default =true
	 *3.invocationCount - default=1 
	 *4.threadPoolSize- will come along with invocationCount-
	 * -it can run parallel in class level
	 *5.dependsonMethods- login-message default-{ }-String of Array
	 *6.timeOut- 5000,invocation count=3-.
	 *it will give individually(5000) time for all 3 testcase
	 *timeOut default=0
	 *7.invocationtimeout--it will take  for all testcase given with the time 
	 *default=0
	 *8.Alwaysrun default= false
	 */
	
	@Test(invocationCount=5)
	public void editLead() {
	System.out.println("editLead");
	}
	
	
	@Test(priority=3)
	public void createLead() {
		System.out.println("createLead");

	}
	
	@Test(priority=2)
	public void delteLead() {
		System.out.println("delteLead");

	}
	
	@Test(enabled=false,priority=-1)
	public void mergeLead() {
		System.out.println("mergeLead");

	}
	
	
	@Test
	public void smoke() {
		System.out.println("Login Functionalities");
	}
	
	@Test(dependsOnMethods={"smoke","mergeLead"})
	public void sanity() {
		System.out.println("Home page");
	}
}
