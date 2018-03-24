package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumClass {

	public static void main(String[] args) {
       //Seting path of browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\SeleniumJars\\geckodriver.exe");      
		//Creating object of webdriver 
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		//get is used to pass url value
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://fb.com");
		
		driver.manage().window().maximize();
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("netkevinod@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("password");
		
		/*WebElement login = driver.findElement(By.xpath("//*[@id='u_0_4']"));
		login.click();*/
		WebElement sex = driver.findElement(By.xpath("//*[@id='u_0_12']/span[2]/label"));
		sex.click();
		
		Select dateofbirth = new Select(driver.findElement(By.id("day")));
		dateofbirth.selectByVisibleText("1");
		
		Select dateofbirthmonth = new Select(driver.findElement(By.id("month")));
		dateofbirthmonth.selectByVisibleText("Oct");
		
		Select dateofbirthyear = new Select(driver.findElement(By.id("year")));
		dateofbirthyear.selectByVisibleText("2018");
		
       
	}

}
