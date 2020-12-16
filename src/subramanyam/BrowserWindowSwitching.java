package subramanyam;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindowSwitching 
{

	public static void main(String[] args) throws Exception
	{
		// open browser
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.sbicard.com/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Login'])[3]"))).click();
		//collect window handles to work with multiple windows
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(s);
		int count=a.size();
		System.out.println("count of tabs opened are: "+count);
		//swith to the second window
		driver.switchTo().window(a.get(1));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("suchindra");
		Thread.sleep(3000);
		//close second window
		driver.close();
		Thread.sleep(2000);
		//switch back to previously opened window
		driver.switchTo().window(a.get(0));
		Thread.sleep(2000);
		//close previous window
		driver.close();
		
		
		
		
		

	}

}
