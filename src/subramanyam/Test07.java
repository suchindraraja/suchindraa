package subramanyam;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Test07 
{

	public static void main(String[] args) throws Exception
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a User id");
		String u=Sc.nextLine();
		System.setProperty("webdriver.gecko.driver","G:\\workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("subramanyamtesting");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("suchindra249");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//pagination
		int expectedallmailscount=0;
		while(10!=1)
		{
			List<WebElement> mails=driver.findElements(By.xpath("//table[@role='grid'])[2]/tbody/tr"));
			expectedallmailscount=expectedallmailscount+mails.size();
			WebElement e=driver.findElement(By.xpath("//*[@data_tooltip='older']"));
			try
			{
				if(e.getAttribute("aria-disabled").equals("true"));
				{
					break;
				}
			}
			catch(Exception ex)
			{
			e.click();
			Thread.sleep(2000);
			}
		}
	System.out.println("Total expected mails count is"+expectedallmailscount);
	String temp=driver.findElement(By.xpath("(//span[@class='ts'])[3]")).getText();
	int actualallmailscount=Integer.parseInt(temp);
	System.out.println("Total actual mails count is"+ actualallmailscount);
	if(actualallmailscount==expectedallmailscount)
	{
		System.out.println("All mails count test passed");
	}
	else
	{
		System.out.println("All mails count test failed");
		File src=driver.findElement(By.xpath("(//span[@class='ts'])[3]")).getScreenshotAs(OutputType.FILE);
		File dest=new File("Screenshot.png");
		FileHandler.copy(src,dest);
	}
	driver.findElement(By.xpath("//a[starts-with(@aria-lable,'GoogleAccount')]))/child::span")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("signout")).click();
	Thread.sleep(5000);
	driver.close();
	}
}
