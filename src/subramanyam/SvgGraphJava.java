package subramanyam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvgGraphJava 
{

	public static void main(String[] args) throws Exception 
	{
		//Open browser & launch site
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.highcharts.com/demo/line-basic");
		Thread.sleep(5000);
		//Close banner if exists
		try
		{
		driver.findElement(By.partialLinkText("OK")).click();
		}
		catch(Exception ex)
		{
		}
		//Get graph into visible area
		WebElement e =driver.findElement(By.xpath("//*[name()='svg']"));
		driver.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
		//Focus on "installation" in graph
		WebElement b=driver.findElement(By.xpath("//button[@aria-label='Hide Installation']"));
		Actions a=new Actions(driver);
		a.moveToElement(b).perform();
		Thread.sleep(5000);
		//Collect all paths in graph & take opacity values of those paths
		List<WebElement> paths=driver.findElements(By.xpath("//*[name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='g' and @aria-hidden='false']"));
		String temp1=paths.get(0).getAttribute("opacity");
		int o1=Integer.parseInt(temp1);//type conversion
		String temp2=paths.get(1).getAttribute("opacity");
		float o2=Float.parseFloat(temp2);
		String temp3=paths.get(2).getAttribute("opacity");
		float o3=Float.parseFloat(temp3);
		String temp4=paths.get(3).getAttribute("opacity");
		float o4=Float.parseFloat(temp4);
		String temp5=paths.get(4).getAttribute("opacity");
		float o5=Float.parseFloat(temp5);
		//Validation
		if(o1==1 && o2<1 && o3<1 && o4<1 && o5<1)
		{
		System.out.println("Test passed");
		}
		else
		{
		System.out.println("Test failed");
		}
		//Close site
		driver.close();

	}

}
