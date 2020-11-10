package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaexecutescroll21 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(10000);
		Dimension d=new Dimension(400,500);
		driver.manage().window().setSize(d);
		Thread.sleep(10000);
		//scroll down
		driver.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//scroll up
		driver.executeScript("window.scrollBy(0,(-document.body.scrollHeight));");
		Thread.sleep(5000);
		//scroll right
		driver.executeScript("window.scrollBy(document.body.scrollWidth,0);");
		Thread.sleep(5000);
		//scroll left
		driver.executeScript("window.scrollBy(-(document.body.scrollWidth),0);");
		Thread.sleep(5000);
		//scroll to specific element in page
		WebElement e=driver.findElement(By.name("q"));
		driver.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
		driver.close();
		

	}

}
