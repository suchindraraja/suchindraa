package subramanyam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClassSingleSelectDropdowns 
{
	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create New Account']")));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='First name']")));
		WebElement e=driver.findElement(By.name("birthday_day"));
		Select day=new Select(e);
		day.selectByIndex(16);
		Select mon=new Select(driver.findElement(By.name("birthday_month")));
		//check wheter the drop down is single select or multiselect 
		if(mon.isMultiple())
		{
			System.out.println("Multi select dropdown");
		}
		else
		{
			System.out.println("Single select dropdowns");
		}
		//selecting by index
		mon.selectByValue("5");
		Select yr=new Select(driver.findElement(By.name("birthday_year")));
		//selecting by visible text
		yr.selectByVisibleText("1995");
		Thread.sleep(5000);
		List<WebElement> l1=day.getOptions();
		System.out.println("no.of.days are "+l1.size());
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getText());
		}
		List<WebElement> l2=mon.getOptions();
		System.out.println("no.of.months are "+l2.size());
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i).getText());
		}
		List<WebElement> l3=yr.getOptions();
		System.out.println("no.of.months are "+l3.size());
		for(int i=0;i<l3.size();i++)
		{
			System.out.println(l3.get(i).getText());
		}
		Thread.sleep(5000);
		//close site
		driver.close();

	}

}
