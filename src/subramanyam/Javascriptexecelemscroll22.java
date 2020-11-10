package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecelemscroll22 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
		Thread.sleep(10000);
		WebElement e=driver.findElement(By.xpath("//pre[1]"));
		driver.executeScript("arguments[0].scrollInToView();",e);
		Thread.sleep(5000);
		driver.executeScript("var x=arguments[0].scrollHeight;arguments[0].scrollTop=x",e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].scrollTop=0",e);
		Thread.sleep(5000);
		driver.executeScript("var x=arguments[0].scrollWidth;arguments[0].scrollLeft=x",e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].scrollLeft=0",e);
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
