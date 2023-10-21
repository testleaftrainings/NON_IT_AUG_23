package testcase;

import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC__002_LogOut extends ProjectSpecificMethod {

	@Test
	public void logOut() {
		System.out.println(driver);
		new LoginPage(driver)
		.enterUserName("DemoCsr")
		.enterPassword("crmsfa")
		.clickOnLogin()
		.clickOnLogOut();
	}
}
