package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("narinder");
	
		Select day= new Select(driver.findElement(By.xpath("//select[@id='day']")));
		
		day.selectByIndex(8);

		Select month= new Select(driver.findElement(By.xpath("//select[@id='month']")));
		
		month.selectByIndex(10);
		
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		
		year.selectByIndex(19);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("khalsa_navjeet@yahoo.com");
		
		
		
		
		
		
	}

}
