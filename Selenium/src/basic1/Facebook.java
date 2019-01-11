package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String path = "D:\\Selenium\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		driver.findElement(By.xpath("name")).sendKeys("Navjeet");

		driver.findElement(By.name("pass")).sendKeys("1234");
		
		
		
		//Thread.sleep(2000);
		
	//	driver.findElement(By.id("email")).clear();
		
		
		
		// this is use for link text
		
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		
		// This is used for partial link text

		
	//	driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		driver.findElement(By.id("u_0_a")).click();
		
		
		driver.findElement(By.id("u_0_9")).click();
		
		
		driver.findElement(By.id("u_0_2")).click();
		
		
		driver.findElement(By.name("firstname")).sendKeys("Navjeet");
		
		
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		
	}

}
