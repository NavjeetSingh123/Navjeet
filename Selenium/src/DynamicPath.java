import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPath {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
		
		String path = "D:\\Selenium\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Khalsa_navjeet@yahoo.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("narinder");


		
		
		
	
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		//driver.quit();
		
		


	}

}
