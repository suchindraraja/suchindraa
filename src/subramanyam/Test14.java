package subramanyam;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Set<Cookie> s=driver.manage().getCookies();
		ArrayList<Cookie> l=new ArrayList<Cookie>(s);
		System.out.println("count of all cookies is "+l.size());
		System.out.println("cookies are: ");
		for(Cookie c:l)
		{
			System.out.println(c.getName()+"----"+c.getValue()+"----"+c.getDomain());
		}
		driver.close();
		

	}

}
