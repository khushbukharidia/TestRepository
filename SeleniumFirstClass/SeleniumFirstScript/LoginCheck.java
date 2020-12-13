package SeleniumFirstScript;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginCheck {
	
	@Test
	public void testSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khush\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr276886");
		driver.findElement(By.name("password")).sendKeys("UvudAzu");
		driver.findElement(By.name("btnLogin")).click();
			
	}
	
	

}
