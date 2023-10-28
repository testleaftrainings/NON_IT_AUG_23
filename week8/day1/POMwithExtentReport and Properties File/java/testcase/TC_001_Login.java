package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethod{

	@BeforeTest
	public void setData() {
		filename="Login1";
		testName="Login";
		testDesc="LeafTaps Application";
		testAuthor="Dilip";
		testCategory="Smoke";
		
		
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void logindata(String uname,String pass) throws IOException {
		LoginPage lp=new LoginPage(driver,node);
		System.out.println(driver);
		
		lp.enterUserName(uname)
		.enterPassword(pass)
		.clickOnLogin();
	}
	
}
