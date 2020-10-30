package subramanyam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexec20 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\chromedriver_64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(10000);
		String bc1=(String) driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');var pe=window.getComputedStyle(ne,'::before');var x=pe.getPropertyValue('border-color');return(x);");
		String bgc1=(String) driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');var y=window.getComputedStyle(ne,'before').getPropertyValue('background-color');return(y);");
		System.out.println(bc1+ " "+bgc1);
		driver.findElement(By.xpath("//label[@for='roundTrip']")).click();
		String bc2=(String) driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');var pe=window.getComputedStyle(ne,'::before');var x=pe.getPropertyValue('border-color');return(x);");
		String bgc2=(String) driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');var y=window.getComputedStyle(ne,'before').getPropertyValue('background-color');return(y);");
		System.out.println(bc2+" "+bgc2);
		driver.close();

	}

}
