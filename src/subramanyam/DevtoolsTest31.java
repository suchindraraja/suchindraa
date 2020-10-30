package subramanyam;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;
import org.openqa.selenium.devtools.network.model.ConnectionType;

public class DevtoolsTest31 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		DevTools dt=driver.getDevTools();
		dt.createSession();
		Command cmd1=Network.enable(Optional.of(1000000), Optional.empty(), Optional.empty());
		Command cmd2=Network.emulateNetworkConditions(false,100,200000,100000, Optional.of(ConnectionType.CELLULAR4G));
		dt.send(cmd1);
		dt.send(cmd2);
		long st=System.currentTimeMillis();
		driver.get("https://www.google.co.in/");
		long et=System.currentTimeMillis();
		System.out.println("load time is "+ (et-st));

	}

}
