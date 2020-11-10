package subramanyam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("ipl2020 schedule",Keys.ENTER);
		

	}

}
