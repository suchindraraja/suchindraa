package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPseudo 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://material-components.github.io/material-components-web-components/demos/switch.html");
		Thread.sleep(5000);
		//switch 1
		WebElement ee1=driver.findElement(By.xpath("(//mwc-switch)[1]"));
		String s1="return(arguments[0].shadowRoot.querySelector('input[id=basic-switch]'));";
		WebElement el1=(WebElement) driver.executeScript(s1,ee1);
		try
		{
			String x=ee1.getAttribute("checked");
			if(x.equals("true"))
			{
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			
		}

	}

}
