package subramanyam;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingfile29 
{

	public static void main(String[] args) throws Exception
	{
		File fo=new File("G:\\mydownloads");
		HashMap<String,Object> hm=new HashMap<String,Object>();
		hm.put("profile.default_content_settings.popups",0);
		hm.put("download.default_directory",fo.getAbsoluteFile());
		ChromeOptions co=new ChromeOptions();
		co.setExperimentalOption("prefs",hm);
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Downloads']")));
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='3.141.59']")));
		driver.findElement(By.xpath("//a[text()='3.141.59']")).click();
		Thread.sleep(10000);
		driver.close();
		
		

	}

}
