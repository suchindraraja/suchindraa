package subramanyam;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ajaxtest27 
{

	public static void main(String[] args) throws Exception
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String x=sc.nextLine();
		//open chrome browser,avoid browser driver logs and launch site
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://angularjs.org/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-model='yourName']")));
		driver.findElement(By.xpath("//input[@ng-model='yourName']")).sendKeys(x);//input element
		try
		{
			//locate element that is changing text dynamically
			WebElement e=driver.findElement(By.xpath("//h1[text()='Hello "+x+"!']"));
			w.until(ExpectedConditions.visibilityOf(e));
			System.out.println("test passed");
		}
		catch(Exception ex)
		{
			System.out.println("Test failed due to"+ex.getMessage());
			//take screenshot of the page and save with current date and time as filename with .png extension
			SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
			Date dt=new Date();
			String ssname=sf.format(dt)+".png";
			File pagesrc=driver.getScreenshotAs(OutputType.FILE);
			File pagedest=new File(ssname);
			FileHandler.copy(pagesrc,pagedest);
		}
		driver.close();
		
		

	}

}
