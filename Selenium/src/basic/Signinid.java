package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signinid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="D:\\Selenium\\drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
	driver.findElement(By.linkText("Forgotten")).click();
}
	}

