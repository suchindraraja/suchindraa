package subramanyam;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitletest36 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in/");
		Thread.sleep(5000);
		String t=driver.getTitle();
		System.out.println(t);
		//checking for secured
		String u=driver.getCurrentUrl();
		if(u.startsWith("https"))
		{
			System.out.println("secured site");
		}
		else
		{
			System.out.println("unsecured site");
		}

	}

}
