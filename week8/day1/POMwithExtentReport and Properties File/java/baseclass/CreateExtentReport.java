package baseclass;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateExtentReport {

	public static void main(String[] args) throws IOException {
		/*
		 * step1 : set path for the report ExtentHtmlReporter 
		 * step2: Create object forExtentReports 
		 * step3: attach the data with physical file (combine step1 andstep2) 
		 * step4: create testcase and adding details about testcase(tc name,tcdesp,category,author) 
		 * step5: step level status(fail,pass) 
		 * step6: mandatory close report flush();
		 */
		
	//step 1-set path for the report ExtentHtmlReporter 
		ExtentHtmlReporter repo=new ExtentHtmlReporter("./snaps/report.html");

	//to keep the report history
		repo.setAppendExisting(true);
		
	//* step2: Create object forExtentReports
		ExtentReports extent=new ExtentReports();
		
	//step3 : attach the data with physical file(attachReporter)
	extent.attachReporter(repo);
	
	// step4: create testcase and adding details about testcase(tc name,tcdesp,category,author) 

	ExtentTest test=extent.createTest("LoginPage", "Login with valid credential");
	test.assignAuthor("Dilip");
	test.assignCategory("regression");
	
	//step 5: step level status
	
	test.pass("enter username");
	test.pass("enter password");
	test.pass("login button");
	test.pass("crmsfa", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img.png").build());
test.pass("leads",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img1.png").build());
	
	ExtentTest test2=extent.createTest("CreatePage", "ceeateLead with valid credential");
	test2.assignAuthor("Gokul");
	test2.assignCategory("smoke");
	
	//step 5: step level status
	
	test2.pass("enter username");
	test2.fail("enter password");
	test2.pass("login button");
	
	
	
	
	//step 6:
	extent.flush();
	System.out.println("done");
	
	
	}

}
