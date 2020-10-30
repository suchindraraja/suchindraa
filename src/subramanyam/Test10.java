package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]")).sendKeys("suchindra249@gmail.com");
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]")).sendKeys("Suchindra249@");
		driver.findElement(By.xpath("//input[@aria-label='Log In']")).submit();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("supraja garlapati");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Supraja Garlapati']")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _4jy4 _517h _51sy']")).click();
		driver.findElement(By.xpath("(//div[@data-offset-key='62mkr-0-0'])[1]")).sendKeys("Hi baby, I just sent this message from my automated program");
		driver.findElement(By.xpath("(//div[@data-offset-key='62mkr-0-0'])[1]")).sendKeys(Keys.ENTER);
		
		
		

	}

}
