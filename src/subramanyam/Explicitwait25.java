package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait25 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		ExpectedCondition ec1=ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'RadCalendar')] "));
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ec1);
		WebElement e=driver.findElement(By.xpath("//div[contains(@class,'RadCalendar')] "));
		driver.executeScript("arguments[0].scrollInToView;",e);
		ExpectedCondition ec2=ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv"));
		w.until(ec2);
		driver.close();
		

	}

}
