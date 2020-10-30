package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(10000);
		WebElement e=driver.findElement(By.name("q"));
		driver.executeScript("arguments[0].value='kalam';",e);
		driver.executeScript("arguments[0].style.border='2px red dotted';",e);

	}

}
