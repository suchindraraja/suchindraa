package subramanyam;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailDelete {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String userid = sc.nextLine();
		System.out.println("Enter password");
		String pwd = sc.nextLine();
		System.out.println("enter fromadress of which mails to e deleted");
		String efrom = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "G:\\workspace\\chromedriver_64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier"))).sendKeys(userid);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::*")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys(pwd);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Next']/parent::*")).click();
		Thread.sleep(20000);
		// go to each mail to check that mail is read or unread
		int eamc = 0;
		int dmc = 0;
		while (true) 
		{
			WebElement mailbox = driver.findElement(By.xpath("(//table)[7]/tbody"));
			List<WebElement> mails = mailbox.findElements(By.xpath("child::tr"));
			for (int i = 0; i < mails.size(); i++) 
			{
				try 
				{
					String afrom = driver.findElement(By.xpath("(//table)[7]/tbody/tr[1]/td[4]/div[2]/span/span"))
							.getAttribute("email");
					if (afrom.equalsIgnoreCase(efrom)) 
					{
						mails.get(i).findElement(By.xpath("child::td[2]/div[@role='checkbox']")).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath("//div[@class='aeH']/descendant::div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
					}

				}
				catch (Exception ex) 
				{

				}
			}
		}
	}

}
