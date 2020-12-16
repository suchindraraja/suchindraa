package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiveElement 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.co.in");
		WebDriverWait w=new WebDriverWait(driver,20);
		driver.switchTo().activeElement().sendKeys("steve jobs");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(5000);
		driver.close();
	}

}
