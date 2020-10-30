package subramanyam;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceDiagramBox 
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		driver.get("https://www.groupboard.com/demo/groupboard-online-whiteboard-demo.shtml");
		//clear existting drawings if exist
		/*FluentWait wait=new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Got It!']")))*/
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Got It!']"))).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("centre"))).isDisplayed())
		{
			driver.findElement(By.id("centre")).click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		drawbody(driver,625,150,150,0);
		drawbody(driver,775,150,0,200);
		drawbody(driver,775,350,-150,0);
		drawbody(driver,625,350,0,-200);
		
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.close();		

	}
	public static void drawbody(ChromeDriver driver,int x,int y,int xr,int yr)
	{
		Point firstpoint=new Point(x,y);
		Point secondpoint=new Point(x+xr,y+yr);
		PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
		Sequence body=new Sequence(pi,1);
		body.addAction(pi.createPointerMove(Duration.ofMillis(20),PointerInput.Origin.viewport(), firstpoint.x,firstpoint.y));
		body.addAction(pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		body.addAction(pi.createPointerMove(Duration.ofMillis(50),PointerInput.Origin.viewport(), secondpoint.x,secondpoint.y));
		body.addAction(pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(body));
		
	}

}
