package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigations 
{

	public static void main(String[] args) 
	{
		// open browser
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(co);
		//maximize the browser window
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.sbicard.com/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Login'])[3]")));
		//open second site
		driver.navigate().to("https://www.axisbank.com/");
		WebElement e1=driver.findElement(By.xpath("(//span[text()='X'])[1]"));
		if(e1.isDisplayed())
		{
			e1.click();
		}
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Login')]")));
		//back to previously opened site
		driver.navigate().back();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Login'])[3]")));
		//navigate to second site
		driver.navigate().forward();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Login')]")));
		//refresh site
		driver.navigate().refresh();
		System.out.println("Test passed");
		//close site
		driver.close();

	}

}
