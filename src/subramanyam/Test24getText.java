package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24getText 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//input[@name='country']/parent::div[1]"));
		String x=e.getAttribute("class");
		String y=e.getCssValue("color");
		String z=e.getText();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		String w=(String) driver.executeScript("return(arguments[0].textContent);",e);
		System.out.println(w);
		

	}

}
