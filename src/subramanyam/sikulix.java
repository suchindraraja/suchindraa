package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class sikulix 
{

	public static void main(String[] args) throws Exception 
	{
		//open chrome browser(swd)
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//launch site
		driver.get("https://www.youtube.com/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search_query']"))).sendKeys("abdul kalam sir speeches");
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(@title,'APJ Abdul Kalam Inspiring Speech on India')]")).click();
		//automate video icons
		Screen s=new Screen();
		if(s.exists("skipadd.png",10)!=null)
		{
			s.click("skipadd.png");
		}
		Location l1=new Location(200,300);
		s.wheel(l1,Button.LEFT,0);
		s.click("pause.png");
		Thread.sleep(3000);
		s.wheel(l1,Button.LEFT,0);
		s.click("play.png");
		Thread.sleep(3000);
		s.wheel(l1,Button.LEFT,0);
		s.mouseMove("sound.png");
		Match e=s.find("bubble.png");
		int x1=e.getX();
		int y1=e.getY();
		Location l2=new Location(x1-50,y1);
		s.dragDrop(e,l2);
		Thread.sleep(3000);
		int x2=e.getX();
		int y2=e.getY();
		Location l3=new Location(x2+50,y2);
		s.dragDrop(e,l3);
		
	}

}
