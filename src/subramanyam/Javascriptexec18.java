package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexec18 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(10000);
		WebElement e=driver.findElement(By.name("q"));
		Thread.sleep(5000);
		driver.executeScript("arguments[0].style.background='green';",e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].disabled=true;",e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].disabled=false;",e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].style.border='9px yellow solid';",e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].value='suchindra raja';",e);
		Thread.sleep(5000);
		e.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}

}
