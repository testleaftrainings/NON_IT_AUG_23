package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC__002_LogOut extends ProjectSpecificMethod {

	@BeforeTest
	public void setData() {
		filename="Login1";
		testName="LogOut";
		testDesc="LeafTaps Application";
		testAuthor="Dilip";
		testCategory="Smoke";
		
		
	}
	
	
	@Test(dataProvider = "fetchData")
	public void logOut(String uname,String pass) throws IOException {
		System.out.println(driver);
		new LoginPage(driver,node)
		.enterUserName(uname)
		.enterPassword(pass)
		.clickOnLogin()
		.clickOnLogOut();
	}
}
