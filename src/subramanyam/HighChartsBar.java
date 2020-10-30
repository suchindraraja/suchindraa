package subramanyam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HighChartsBar 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.highcharts.com/demo/line-basic");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Pie charts']"))).click();
		List<WebElement> le=driver.findElements(By.xpath("//div[@class='active']/following-sibling::ul/li"));
		System.out.println(le.size());
		
		WebElement e=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Pie with legend']")));
		driver.executeScript("arguments[0].click();",e);
		Thread.sleep(5000);
		driver.close();
	}

}
