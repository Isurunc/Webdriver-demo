import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CommonMethods {
	
	public static void userLogin(String username, String password, WebDriver driver) {

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();

	}
	
	
	public static void logOut(WebDriver driver) {
		driver.findElement(By.linkText("Sign out")).click();

	}
	
	

}
















////public String webUrl1 = "https://twitter.com/login";
//	public static void userlogin (String username, String password, WebDriver driver) {
//		
//		
//		driver.findElement(By.cssSelector(".js-username-field")).sendKeys(username);
//		driver.findElement(By.xpath("//div[@class='clearfix field']//input[@placeholder='Password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//	}



