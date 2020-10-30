package subramanyam;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailattachmentTest33 
{

	public static void main(String[] args) throws Exception
	{
		//open browser and avoid browser driver logs
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		driver.findElement(By.name("identifier")).sendKeys("subramanyamtesting");
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("suchindra249");
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='button'])[8]")));
		//click on compose
		driver.findElement(By.xpath("(//div[@role='button'])[8]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
		//fill fields in compose screen
		driver.findElement(By.name("to")).sendKeys("shweth");
		driver.findElement(By.name("subjectbox")).sendKeys("Window automation");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("hai SDET, how are you");
		//goto attachment via click on attachment icon
		driver.findElement(By.xpath("//div[@data-tooltip='Attach files']/descendant::div[1]")).click();
		//handle file upload window(java robot)
		Thread.sleep(5000); //wait for file upload popup window
		StringSelection f=new StringSelection("C:\\\\Users\\\\Public\\\\Pictures\\\\myscannedpicture2(2)");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(f,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//send mail and get output and display
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@aria-label,'Uploading')]")));
		driver.findElement(By.xpath("//*[starts-with(@aria-label,'Send')]"));
		try
		{
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Message sent')]")));
			System.out.println("Test passed");
		}
		catch(Exception ex)
		{
			System.out.println("Test failed");
		}
		//do logout
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]/child::span")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
		driver.findElement(By.linkText("Sign out")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Choose an account']")));
		//close site
		driver.close();
	}

}
