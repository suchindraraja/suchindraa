package subramanyam;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("suchindra.raja");
		driver.findElement(By.name("signin")).submit();
		Thread.sleep(10000);
		driver.findElement(By.name("password")).sendKeys("Magnitia249",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("subramanyamtesting@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("intersystem testing");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("The only thing you have to focus now is Test Automation, Forget about the world and concentrate on subject");
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		//String m=driver.findElement(By.partialLinkText(" has been sent.")).getText();
		//System.out.println(m);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.get("https://www.gmail.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("subramanyamtesting@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("suchindra249");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		WebElement latestmail=driver.findElement(By.xpath("(//table)[7]/tbody/tr[1]"));
		String fromaddress=latestmail.findElement(By.xpath("descendant::span[3]")).getAttribute("email");
		if(fromaddress.contains("suchindra.raja@yahoo.com"))
		{
			System.out.println("yahoo mail sent works correctly");
		}
		else
		{
			System.out.println("yahoo mail sent not working correctly");
		}
		driver.findElement(By.xpath("//a[@class='gb_D gb_Ra gb_i']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(l.get(0));
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
