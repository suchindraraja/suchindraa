package subramanyam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement dd=driver.findElement(By.xpath("//a[@id='selection']/following-sibling::*[3]"));
		WebElement neighbour=driver.findElement(By.xpath("//h4[text()='selecion']"));
		driver.executeScript("arguments[0].ScrollInToView();",neighbour);
		if(dd.getAttribute("class").contains("multiple"))
			{
			System.out.println("Multi select dropdown");
			}
		else
		{
			System.out.println("single-select dropdown");
			List<WebElement> items=dd.findElements(By.xpath("child::div[2]/div"));
			System.out.println("count of items in dropdown is" +items.size());
			System.out.println("Items are:");
			for(WebElement item:items)
			{
				String x=(String)driver.executeScript("return arguments[0].textcontent();",item);
				System.out.println(x);
			}
			for(WebElement item:items)
			{
				try
				{
					dd.click();
					Thread.sleep(2000);
					if(item.isDisplayed())
					{
						String expected=item.getText();
						item.click();
						Thread.sleep(2000);
						String actual=dd.findElement(By.xpath("child::div[1]")).getText();
						if(expected.equals(actual))
						{
							System.out.println(expected+"item selection test passed");
						}
						else
						{
							System.out.println(expected +"item selection test failed");
						}
					}
					else
					{
						String y=(String)driver.executeScript("return(arguments[0].textcontent);",item);
						System.out.println(y+ "Item is hidden");
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
		}
		driver.close();
			
		
	}

}
