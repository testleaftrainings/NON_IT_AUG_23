package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_Login2 extends ProjectSpecificMethod{

	@BeforeTest
	public void setData() {
		
		testName="Login";
		testDesc="LeafTaps Application";
		testAuthor="Dilip";
		testCategory="Smoke";
		
		
	}
	
	
	
	@Test
	public void logindata() throws IOException {
		LoginPage lp=new LoginPage(driver,node);
		System.out.println(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin();
	}
	
}
