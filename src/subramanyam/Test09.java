package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test09 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentoutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("nee kannu neeli samudram");
		driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[1]")).click();

	}

}
