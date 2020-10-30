package subramanyam;

import org.openqa.selenium.chrome.ChromeDriver;

public class Raja
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();

	}

}
