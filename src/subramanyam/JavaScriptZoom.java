package subramanyam;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptZoom 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		driver.executeScript("document.body.style.zoom='200%';");
		Thread.sleep(5000);
		driver.executeScript("document.body.style.zoom='100%';");
		

	}

}
