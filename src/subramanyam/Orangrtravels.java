package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangrtravels 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.orangetravels.in/");
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bootstrap-dialog-close-button']/button"))).click();
		}
		catch(Exception ex)
		{
			
		}
	}

}
