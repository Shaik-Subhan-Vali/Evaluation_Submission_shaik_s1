import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Annotations {

    WebDriver driver;

    @BeforeTest
    public void setup() {
       
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(groups = {"radio"}, priority = 0)
    public void tc1() throws InterruptedException {
        driver.findElement(By.cssSelector("[value=\"radio1\"]")).click();
    }

    @Test(groups = {"checkbox"}, priority = 1)
    public void tc2() throws InterruptedException {
        driver.findElement(By.id("checkBoxOption1")).click();
    }

    @Test(groups = {"Multiple checkbox"}, priority = 2)
    public void tc3() throws InterruptedException {
        driver.findElement(By.id("checkBoxOption2")).click();

    }

    @Test(groups = {"Multiple checkbox"},dependsOnGroups = {"radio"}, priority = 3)
    public void tc4() throws InterruptedException {
        driver.findElement(By.id("checkBoxOption3")).click();
    }

	
	@AfterTest
	public void teardwon() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
