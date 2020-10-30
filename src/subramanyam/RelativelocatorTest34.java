package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativelocatorTest34 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silenOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebElement e1=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		WebElement e2=driver.findElement(By.xpath("//button[text()='Forgot email?']"));
		WebElement e3=driver.findElement(RelativeLocator.withTagName("input").below(e1).above(e2));
		e3.sendKeys("corona");
		driver.close();
	}

}
