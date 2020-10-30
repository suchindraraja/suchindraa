package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptBorderDesign 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.name("q"));
		driver.executeScript("arguments[0].style.border='2px red dashed';",e);
		driver.executeScript("arguments[0].style.background='yellow';",e);
		driver.executeScript("arguments[0].style.color='blue';", e);
		driver.executeScript("arguments[0].value='kalam sir';",e);
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.partialLinkText("Sign in"));
		driver.executeScript("arguments[0].style.border='5px green solid';", e1);
	}

}
