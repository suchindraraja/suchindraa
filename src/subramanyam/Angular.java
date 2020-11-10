package subramanyam;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Angular 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		sc.close();
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://angularjs.org/");
		Thread.sleep(5000);
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@ng-model='yourName']"))).sendKeys(x);
		try
		{
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Hello "+x+"!']")));
			System.out.println("Test passed");
		}
		catch(Exception ex)
		{
			System.out.println("Test failed "+ex.getMessage());
		}

	}

}
