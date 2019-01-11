package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "D:\\Selenium\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//iput[@id='email']")).sendKeys("Khalsa_navjeet@yahoo.com");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		
		
		
		

	}
}