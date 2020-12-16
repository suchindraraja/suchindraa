package subramanyam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClassMultiSelectDropdowns 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("iframeResult")));
		WebElement e1=driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(e1);
		
		//check whether drop dwon is single select or multi select
		WebElement e2=driver.findElement(By.name("cars"));
		Select s=new Select(e2);
		if(s.isMultiple())
		{
			System.out.println("multiselect dropdown");
		}
		else
		{
			System.out.println("SIngle select dropdown");
		}
		
		//get list of items in dropdown
		List<WebElement> l1=s.getOptions();
		System.out.println("number of items are "+l1.size());
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getText());
		}
		
		//select some items in dropdown
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL);
		s.selectByIndex(1);
		Thread.sleep(1500);
		s.selectByValue("volvo");
		Thread.sleep(1500);
		s.selectByVisibleText("Audi");
		
		//get first selected item
		System.out.println("first selected item is "+s.getFirstSelectedOption().getText());
		
		//get all selected items
		List<WebElement> l2=s.getAllSelectedOptions();
		System.out.println("All selected items are "+l2.size());
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i).getText());
		}
		
		//deselect all selected items
		s.deselectByIndex(1);
		Thread.sleep(1500);
		s.deselectByValue("volvo");
		Thread.sleep(1500);
		s.deselectByVisibleText("Audi");
		
		//select all items in dropdown
		for(int i=0;i<l1.size();i++)
		{
			s.selectByVisibleText(l1.get(i).getText());
		}
		Thread.sleep(5000);
		
		//deselect all items
		s.deselectAll();
		
		//change focus to browser level
		driver.switchTo().defaultContent();
		
		//close site
		driver.close();
	}

}
