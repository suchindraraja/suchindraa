package subramanyam;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test12 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOuput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("subramanyamtesting@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("suchindra249");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@aria-label='To']")).sendKeys("suchindra.raja@yahoo.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Intersystem testing");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("The only thing you have to focus now is Test Automation, Forget about the world and concentrate on subject");
		driver.findElement(By.xpath("//div[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
		String m=driver.findElement(By.xpath("(//div[@class='vh'])[1]")).getText();
		System.out.println(m);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.get("https://mail.yahoo.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("suchindra.raja");
		driver.findElement(By.name("signin")).submit();
		Thread.sleep(10000);
		driver.findElement(By.name("password")).sendKeys("Magnitia249",Keys.ENTER);
		Thread.sleep(5000);
		WebElement latestmail=driver.findElement(By.xpath("(//button[contains(@title,'Tickbox')])[2]/ancestor::li"));
		String fromaddress=latestmail.findElement(By.xpath("descendant::span[4]")).getAttribute("title");
		if(fromaddress.contains("subramanyamtesting@gmail.com"))
		{
			System.out.println("Gmail mail sent works correctly");
		}
		else
		{
			System.out.println("Gmail mail sent not working correctly");
		}
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(l.get(0));
		driver.findElement(By.xpath("//a[@class='gb_D gb_Ra gb_i']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
