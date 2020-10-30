package subramanyam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptcontecnttest23 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys("kalam",Keys.ENTER);
		Thread.sleep(5000);
		//inner text of page.
		String x=(String) driver.executeScript("return(document.documentElement.innerText);");
		System.out.println(x);
		//regular expression for pattern matching
		Pattern p=Pattern.compile("[aA][bB][dD][uU][lL]");
		Matcher m=p.matcher(x);
		int count=0;
		while(m.find())
		{
			count=count+1;
		}
		System.out.println("count of matched with given words is" +count);
		driver.close();
		

	}

}
