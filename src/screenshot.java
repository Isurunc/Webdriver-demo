import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


public class screenshot {
	
	public static void captureScreeShot(String fileName, WebDriver driver1){
		  TakesScreenshot driver = (TakesScreenshot) driver1;
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  	//try {
			//FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
		//} catch (IOException e) {
	//		e.printStackTrace();
		//}
		  
	  }}
