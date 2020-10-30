package subramanyam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ExpicitfluentTest26 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		ExpectedCondition ec1=ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'RadCalendar')] "));
		FluentWait w=new FluentWait(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofMillis(1000));
		w.until(ec1);
		WebElement e=driver.findElement(By.xpath("//div[contains(@class,'RadCalendar')] "));
		driver.executeScript("arguments[0].scrollInToView;",e);
		ExpectedCondition ec2=ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv"));
		w.until(ec2);
		driver.close();

	}

}
