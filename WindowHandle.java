package Greeshma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) 
	{
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			String parentHandle=driver.getWindowHandle();
			System.out.println("parenthandle:"+parentHandle);
//			driver.findElement(By.xpath())
		// TODO Auto-generated method stub

	}

}
