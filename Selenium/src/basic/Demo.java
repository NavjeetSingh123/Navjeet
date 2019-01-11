package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="D:\\Selenium\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com:");
		//driver.close();
		
		System.out.println(driver.getTitle());
		String act=driver.getTitle();
		String exp="Facebook – log in or sign up";
		
		if(act.equalsIgnoreCase(exp)==true)
		{
			System.out.println("result:   pass");
		}
		
		else
		{
			System.out.println("result :    Fail");
			
		}
			
		
	//	driver.quit();
		
		
		
		
		
		

		
	}

}
