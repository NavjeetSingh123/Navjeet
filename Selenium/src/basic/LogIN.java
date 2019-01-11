package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="D:\\Selenium\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.cssSelector("#loginbutton")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("Navjeet");
		
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		
		
		
		
		
		
		
		

	}

}
