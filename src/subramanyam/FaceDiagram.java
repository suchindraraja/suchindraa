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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceDiagram 
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
		Thread.sleep(5000);
		Point headorgin=new Point(700,100);
		Point lefteye=headorgin.moveBy(-17,-17);
		Point righteye=headorgin.moveBy(17,-17);
		Point mouth=headorgin.moveBy(0,20);
		Point exclmation1=new Point(1200,350);
		Point exclmation2=new Point(1225,350);
		//face
		drawcircle(driver,headorgin,50,25,"full");
		drawcircle(driver,lefteye,5,10,"full");
		drawcircle(driver,righteye,5,10,"full");
		drawcircle(driver,mouth,10,10,"half");
		//body
		drawbody(driver,625,150,150,0);
		drawbody(driver,775,150,0,200);
		drawbody(driver,775,350,-150,0);
		drawbody(driver,625,350,0,-200);
		//rightleg
		drawbody(driver,765,350,0,200);
		drawbody(driver,765,550,-35,0);
		drawbody(driver,730,550,0,-200);
		//left leg
		drawbody(driver,670,350,0,200);
		drawbody(driver,670,550,-35,0);
		drawbody(driver,635,550,0,-200);
		//righthand
		drawbody(driver,775,160,150,0);
		drawbody(driver,925,160,0,30);
		drawbody(driver,925,190,-150,0);
		//left hand
		drawbody(driver,625,160,-150,0);
		drawbody(driver,475,160,0,30);
		drawbody(driver,475,190,150,0);
		//rightshoe
		drawbody(driver,730,560,0,20);
		drawbody(driver,730,580,75,0);
		drawbody(driver,805,580,0,-10);
		drawbody(driver,805,570,-40,0);
		drawbody(driver,765,570,0,-10);
		drawbody(driver,765,560,-35,0);
		//leftshoe
		drawbody(driver,670,560,0,20);
		drawbody(driver,670,580,-75,0);
		drawbody(driver,595,580,0,-10);
		drawbody(driver,595,570,40,0);
		drawbody(driver,635,570,0,-10);
		drawbody(driver,635,560,35,0);
		//rightwrist
		drawbody(driver,935,160,50,0);
		drawbody(driver,985,160,0,10);
		drawbody(driver,985,170,-20,0);
		drawbody(driver,965,170,0,20);
		drawbody(driver,965,190,-30,0);
		drawbody(driver,935,190,0,-30);
		//leftwrist
		drawbody(driver,465,160,-50,0);
		drawbody(driver,415,160,0,10);
		drawbody(driver,415,170,20,0);
		drawbody(driver,435,170,0,20);
		drawbody(driver,435,190,30,0);
		drawbody(driver,465,190,0,-30);
		//hat
		drawbody(driver,640,50,0,-5);
		drawbody(driver,640,45,20,0);
		drawbody(driver,660,45,10,-15);
		drawbody(driver,670,30,60,0);
		drawbody(driver,730,30,10,15);
		drawbody(driver,740,45,20,0);
		drawbody(driver,760,45,0,5);
		drawbody(driver,760,50,-120,0);
		//w
		drawbody(driver,900,250,0,100);
		drawbody(driver,900,350,25,-75);
		drawbody(driver,925,275,25,75);
		drawbody(driver,950,350,0,-100);
		//I
		drawbody(driver,975,250,50,0);
		drawbody(driver,1000,250,0,100);
		drawbody(driver,975,350,50,0);
		//D
		drawbody(driver,1050,250,0,100);
		drawbody(driver,1050,350,35,0);
		drawbody(driver,1085,350,15,-25);
		drawbody(driver,1100,325,0,-50);
		drawbody(driver,1100,275,-15,-25);
		drawbody(driver,1085,250,-35,0);
		//E
		drawbody(driver,1125,250,0,100);
		drawbody(driver,1125,250,50,0);
		drawbody(driver,1125,300,40,0);
		drawbody(driver,1125,350,50,0);
		//!!
		drawbody(driver,1200,250,0,80);
		drawbody(driver,1225,250,0,80);
		drawcircle(driver,exclmation1,5,10,"full");
		drawcircle(driver,exclmation2,5,10,"full");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.close();		
	}
	public static void drawcircle(ChromeDriver driver,Point orgin,double radius, int steps,String style)
	{
		Point firstpoint=new Point((int) (orgin.x+radius),orgin.y);
		PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
		Sequence circle=new Sequence(pi,0);
		circle.addAction(pi.createPointerMove(Duration.ofMillis(20),PointerInput.Origin.viewport(),firstpoint.x,firstpoint.y));
		circle.addAction(pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		int p=steps;
		if(style.equals("half"))
		{
			p=steps/2;
		}
		for(int i=1;i<=p;i++)
		{
			double theta=2*Math.PI*((double)i/steps);
			int xoffset=(int) Math.floor(Math.cos(theta)*radius);
			int yoffset=(int) Math.floor(Math.sin(theta)*radius);
			Point nextpoint=new Point(orgin.x+xoffset,orgin.y+yoffset);
			circle.addAction(pi.createPointerMove(Duration.ofMillis(50),PointerInput.Origin.viewport(),nextpoint.x,nextpoint.y));
			
		}
		
		circle.addAction(pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(circle));
	}
	
	public static void drawbody(ChromeDriver driver,int x,int y,int xr,int yr)
	{
		Point firstpoint=new Point(x,y);
		Point secondpoint=new Point(x+xr,y+yr);
		PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
		Sequence body=new Sequence(pi,1);
		body.addAction(pi.createPointerMove(Duration.ofMillis(20),PointerInput.Origin.viewport(), firstpoint.x,firstpoint.y));
		body.addAction(pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		body.addAction(pi.createPointerMove(Duration.ofMillis(90),PointerInput.Origin.viewport(), secondpoint.x,secondpoint.y));
		body.addAction(pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(body));
		
	}
	

}
