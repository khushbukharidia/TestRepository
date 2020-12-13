package SeleniumFirstScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetExcel extends ReadExcel {
	
	
	String baseUrl = "http://www.amazon.in";
	Map<String, Object[]> testresultdata;
	
	@Test(dataProvider = "TestResult")
	public void Customer_Signin(String Username,String Password,String Test_Results)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		driver.get(baseUrl);
		 
		// Maximize browser  #nav-signin-tooltip > a > span
	
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
		driver.findElement(By.id("ap_email")).sendKeys(Username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(Password);
		driver.findElement(By.id("signInSubmit")).click();
		
		String actual = driver.getTitle();
		String Expected = "Online Shopping";
		try {
			Assert.assertEquals(actual, Expected);
			System.out.println("Login test case is passed");
		}
		catch(Exception e) {
			System.out.println("Login test case is fail");
		}
		
	}
	
	

}
