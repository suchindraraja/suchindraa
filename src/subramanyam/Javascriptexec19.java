package subramanyam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexec19 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(10000);
		List<WebElement> l=driver.findElements(By.xpath("//h4[text()='Search Selection']/following-sibling::div/div[2]/div"));
		for(WebElement e:l)
		{
			String x=(String) driver.executeScript("return(arguments[0].textContent);",e);
			System.out.println(x);
		}
		driver.close();
	}

}
