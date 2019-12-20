import org.testng.annotations.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class TC001_Positive {
	
	public String webUrl = "http://automationpractice.com/index.php?";
	String driverPath = "C:\\Selenium\\drivers\\chromedriver.exe";
	public WebDriver driver; 
	
	@Test(priority=0)
	public void login_verifyHomepageTitle ()  {
		
		//User enters username/password and click on login
		CommonMethods.userLogin("automationuser99x@gmail.com", "99automation@1", driver);
	
		String expectedTitle = "My account - ";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
				
	}
	
	
	@Test(priority=1)	
	public void checkSearchOption() {
		
	      driver.findElement(By.xpath("//form[@id='searchbox']/input[4]")).click();
	      driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("shirt");
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	      driver.findElement(By.cssSelector(".button-search")).click();
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      System.out.println(driver.getCurrentUrl());
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
