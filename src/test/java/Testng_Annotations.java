import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Annotations {

WebDriver driver ;
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void tc1() throws InterruptedException {
				
      driver.findElement(By.cssSelector("[value=\"radio1\"]")).click();
           
	}
	@Test
	public void tc2() throws InterruptedException {
      
      driver.findElement(By.id("checkBoxOption1")).click();
               
	}
	
	@AfterTest
	public void teardwon() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
