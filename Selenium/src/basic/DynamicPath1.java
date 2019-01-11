package basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicPath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String path="D:\\Selenium\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//Select day = new Select(driver.findElement(By.cssSelector("#day")));
		
		//day.selectByValue("10");
		
		
	//	Select m = new Select(driver.findElement(By.cssSelector("#month")));
	//	m.selectByVisibleText("Mar");
		
		//Select y = new Select(driver.findElement(By.cssSelector("#year")));
		
		//y.selectByIndex(15);
		
		if(driver.findElement(By.cssSelector("#pass")).isDisplayed())
		{
			
			System.out.println("Tc Pass");
		}
		
		else
		{
			System.out.println("Tc Fail");
		}
		
		driver.quit();
		
		
		
		
		
		
		
				
		
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("khalsa_navjeet@yahoo.com");
		
	//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		
	//	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Navjeet");
		
		//driver.findElement(By.xpath("//input[@id='email']/following::input[@id='pass']")).sendKeys("abc");
		
		//driver.findElement(By.xpath("//input[@id='pass']/preceding::input[@name='email']")).sendKeys("12345");
		
		//driver.findElement(By.xpath("//input[@tabindex='1']or [@name='email']/following::input[@id='pass']")).sendKeys("12345");
		
		
		
	//	driver.findElement(By.xpath("//input[@id='pass']/following::input")).click();
		
		
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Navjeet");
		
		
		
		//List links=driver.findElements(By.tagName("label"));
		
		
	//	Iterator<WebElement> it = links.iterator();
		
		//System.out.println("Total no of lables in facebook are:" +links.size());
		
		
	//	while(it.hasNext()) {
			
		//	System.out.println("Link Text:" + it.next().getText());
		}
		
		
		
	//	driver.close();
		
		
		
		
		
		
		
		
	}


