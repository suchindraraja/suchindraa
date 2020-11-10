package subramanyam;

import org.openqa.selenium.chrome.ChromeDriver;

public class Raja
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();

	}

}
