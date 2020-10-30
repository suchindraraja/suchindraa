package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssvalueTest35 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.linkText("Gmail"));
		String x1=e.getCssValue("text-decoration");
		//String y1=e.getCssValue("")
		
		
	}

}
