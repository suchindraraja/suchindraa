package subramanyam;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test04 
{

	public static void main(String[] args)throws Exception 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=Sc.nextLine();
		RemoteWebDriver driver;
		if(bn.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","G:\\workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		else 
		{
			System.setProperty("webdriver.edge.driver","G:\\workspace\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.quit();
	}

}
