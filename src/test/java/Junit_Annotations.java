import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Junit_Annotations {


    WebDriver driver ;
	
	@BeforeClass
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
	@Test
	public void tc3() throws InterruptedException {
      
      driver.findElement(By.id("checkBoxOption2")).click();
      driver.findElement(By.id("checkBoxOption3")).click();     
               
	}
	
	@AfterClass
	public void teardwon() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}
