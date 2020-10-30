package subramanyam;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink1 
{

	public static void main(String[] args) throws Exception 
	{
		//open in chrome broser
		System.setProperty("webdriver.chrome.driver", "G:\\workspace\\chromedriver_64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in");

		Thread.sleep(5000);

		// locate one link and take href attribute value

		String x = driver.findElement(By.linkText("Gmail")).getAttribute("href");

		try

		{
			URL U = new URL(x);

			HttpURLConnection con = (HttpURLConnection) U.openConnection();

			con.connect();

			String y = con.getResponseMessage();

			int z = con.getResponseCode();

			System.out.println(y + " " + z);

			con.disconnect();

			if (z >= 200 && z <= 299) 
			{
				System.out.println(x + "is working correctly");

			}
			else 
			{
				System.out.println(x + "is not working correctly due to" + y);

			}

		} 
		catch (Exception ex)
		{

			System.out.println(ex.getMessage());
		}
		
		// close site
		driver.close();

	}

}
