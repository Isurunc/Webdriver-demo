import org.testng.annotations.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class TC002_Negative {
	
	public String webUrl = "http://automationpractice.com/index.php?";
	String driverPath = "C:\\Selenium\\drivers\\chromedriver.exe";
	public WebDriver driver; 
	
	@Test(priority=0)
	public void login_verifyHomepageTitle ()  {
	
		CommonMethods.userLogin("automationuser99x@gmail.com", "WrongPW", driver);
		screenshot.captureScreeShot("HomepageTitle", driver);
	
		String expectedText ="There is 1 error";
		Assert.assertEquals("There is 1 error",expectedText);
				
	}
	
	
	
	
	@BeforeTest
	public void launchBrowser() {
        System.out.println("launching Chrome browser"); 
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(webUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    }
	
	
	@AfterTest
    public void terminateBrowser(){
		CommonMethods.logOut(driver);
        driver.close();
        driver.quit();
    }
	  
	  
  }
