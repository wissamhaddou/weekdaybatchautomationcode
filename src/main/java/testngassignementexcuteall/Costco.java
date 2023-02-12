package testngassignementexcuteall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Costco {

	 public static WebDriver driver;
	 @BeforeMethod

	 public void OpenWebsite() {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://costco.com");
	 }
	 @Test
	 public void loginTest() {
		System.out.println("code for Costco is here ");
	 }
	 @AfterMethod 
	 public void tearDown() {
		 driver.quit();
}
}