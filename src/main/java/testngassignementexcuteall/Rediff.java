package testngassignementexcuteall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff {

	 public static WebDriver driver;
	 @BeforeMethod

	 public void OpenWebsite() {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://Rediff.com");
	 }
	 @Test
	 public void RediffTest() {
		 String expectedTitle =driver.getTitle();
		 String actualTitle ="Rediff.com : News | Rediffmail | stock quotes | Shopping";
		 Assert.assertEquals(expectedTitle,actualTitle);
		 if (expectedTitle.equals(actualTitle)) {
			 driver.findElement(By.className("signin")).click();
			 if(true == true) {
				 System.out.println("the world is beautiful");
			 }
		 Assert.assertTrue(1<2);
		 Assert.assertTrue(1>2);
		 }
	 }
	 @AfterMethod 
	 public void tearDown() {
		 driver.quit();
}
}