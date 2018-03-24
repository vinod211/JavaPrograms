package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
       //Seting path of browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\geckodriver.exe");      
		//Creating object of webdriver 
		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = new FirefoxDriver();
		//get is used to pass url value
		driver.get("http://fb.com");
       
	}

}
