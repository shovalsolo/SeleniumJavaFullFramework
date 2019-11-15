/* 
 * Class that is using the "config.properties" file  
 */

package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.googleSearchWithTestNG2;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {
		try {
			InputStream input = new FileInputStream(projectPath+ "/src/test/java/config/config.properties");	//setting a parameter with the location of the config file - InputStream is the way to read data from other files
			prop.load(input);														//setting prop with the location of file "config.properties"
			String browser = prop.getProperty("browser");							//Getting the input of the parameter and setting in to parameter called browser
			System.out.println("Using browser  : " + browser);						//Printing browser parameter from config file
			
			googleSearchWithTestNG2.browserName=prop.getProperty("browser");		//Related to a different class - setting browserName parameter to what we have in "config.properties"
		} 
		catch (Exception e) {														//Catch block
			System.out.println("Message is : " +e.getMessage());					//Printing the exception message
			System.out.println("Couse is : " +e.getCause());						//Printing the exception cause
			e.printStackTrace();													//Will print the line of the error
			System.out.println("Hi from catch block getProperties");				//Printing a message
		}
	}
	
	public static void setProperties() {
		try {
			OutputStream  output = new FileOutputStream(projectPath+ "/src/test/java/config/config.properties");	//Saving the file location
			prop.setProperty("browser","chrome");									//Changing the parameter "browser" in file "config.properties"
			prop.setProperty("result","pass");
			prop.store(output,null);												//Saving the file "config.properties" after the change
		} 
		catch (Exception e) {														//
			System.out.println("Message is : " +e.getMessage());					//Printing the exception message
			System.out.println("Couse is : " +e.getCause());						//Printing the exception cause
			e.printStackTrace();													//Will print the line of the error
			System.out.println("Hi from catch block setProperties");				//Printing a message
		}
	}

}
