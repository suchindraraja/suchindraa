package subramanyam;

import org.openqa.selenium.edge.EdgeDriver;

public class Test03 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","G:\\workspace\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}

}
