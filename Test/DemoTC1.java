

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

@Test
public class DemoTC1 {
	
	public String webUrl = "https://accounts.google.com";
	String driverPath = "C:\\Selenium\\drivers\\chromedriver.exe";
	public WebDriver driver; 
	
	
	@BeforeTest
	public void launchBrowser() {
        System.out.println("launching Chrome browser"); 
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(webUrl);
    }
	
  

  
	  
	  
  }
}
