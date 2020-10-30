package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test08 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentoutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("subramanyamtesting");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("suchindra249");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.findElement(By.xpath("//div[@class='aoD hl']")).sendKeys("suprajagarlapati@gmail.com");
		driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("missing you");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("love you 3000, dont worry i just sent this mail throuh my automated program");
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		driver.findElement(By.xpath("//span[@class='gb_Ia gbii']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='gb_Fb gb_ag gb_ig gb_Se gb_Xc']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
