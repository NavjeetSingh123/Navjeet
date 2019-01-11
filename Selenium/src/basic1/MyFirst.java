package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path="D:\\Selenium\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		
		String actual=driver.getTitle();
		
		String exp="Google";
		
		if(actual.equalsIgnoreCase(exp))
		{
			
			System.out.println("Result: Pass");
			
		}
		
	
		else
		{
			
			System.out.println("Result : Fail");
			
		}
		
		driver.quit();
		
		
		
		
		
		//driver.manage().window().maximize();
		
		
		//Thread.sleep(4000);
		
		
		//driver.close();
		
		
		
		
		

	}

}
