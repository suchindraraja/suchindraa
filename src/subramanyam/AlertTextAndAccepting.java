package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTextAndAccepting 
{

	public static void main(String[] args) 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert2");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("iframeResult")));
		//switch to frame 
		WebElement e=driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(e);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		w.until(ExpectedConditions.alertIsPresent());
		//get the text from alert and print
		String x=driver.switchTo().alert().getText();
		System.out.println("text inside alert is: \n"+x);
		//accept the alert
		driver.switchTo().alert().accept();
		//change driver obj focus to page level
		driver.switchTo().defaultContent();
		//close the site
		driver.close();
		
		

	}

}
