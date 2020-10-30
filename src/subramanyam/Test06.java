package subramanyam;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test06 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		Thread.sleep(5000);
		int allrescount=0;
		int pagenumber=0;
		while(10!=1)
		{
			pagenumber++;
			int rescountperpage=0;
			List<WebElement> l=driver.findElements(By.xpath("//div[@class='rc']"));
			for(WebElement e:l)
					{
						if(e.isDisplayed())
						{
							rescountperpage++;
							
						}
					}
					System.out.println(pagenumber+"pagehad"+rescountperpage+"results");
					allrescount=allrescount+rescountperpage;
					try
					{
						driver.findElement(By.xpath("//*[text()='next']")).click();
						Thread.sleep(5000);			
					}
					catch(Exception ex)
					{
						break;
					}
		}
		System.out.println("Total result count is " +allrescount);
		driver.close();
	}
	

}
