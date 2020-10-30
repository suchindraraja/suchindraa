package subramanyam;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;

import com.google.common.collect.ImmutableMap;

public class DevtoolsTest30 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		DevTools dt=driver1.getDevTools();
		dt.createSession();
		driver1.get("https://www.google.com/");
		try
		{
			Command c=new Command("Browser.Crash",ImmutableMap.of());
			dt.send(c);
		}
		catch(Exception ex)
		{
			System.out.println("Continue further testing");
		}
		ChromeDriver driver2=new ChromeDriver();
		driver2.get("https://www.google.com/");

	}

}
