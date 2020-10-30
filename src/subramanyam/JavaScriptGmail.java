package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptGmail 
{

	public static void main(String[] args) throws Exception
	{
		//Gmail login via java script
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(10000);
		WebElement e1=driver.findElement(By.name("identifier"));
		WebElement e2=driver.findElement(By.xpath("//span[text()='Next']/parent::*"));
		driver.executeScript("arguments[0].value='subramanyamtesting';", e1);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].click();", e2);
		Thread.sleep(5000);
		driver.executeScript("document.getElementsByName('password')[0].value='suchindra249';");
		driver.executeScript("document.getElementsByTagName('button')[1].click();");
	}

}
