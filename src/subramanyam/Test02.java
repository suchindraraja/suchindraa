package subramanyam;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test02 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","G:\\workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}

}
