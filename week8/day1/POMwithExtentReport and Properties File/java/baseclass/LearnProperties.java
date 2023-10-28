package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	public static void main(String[] args) throws IOException {
		//setup the path of the properties file
		FileInputStream fis=new FileInputStream("./src/test/resources/English.properties");
		//create an object of properties class
	Properties p= new Properties();
	//connect method call load()
	p.load(fis);
	
	System.out.println(p.getProperty("username"));
	System.out.println(p.getProperty("password"));

	
	
	
	}

}
