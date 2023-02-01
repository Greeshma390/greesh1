package Greeshma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calender {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		String month="May 2027";
//		String year="2027";
		String date="15";
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/p/iframe")));
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		while(true)
		{
			String text=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			}
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[contains(text(),"+date+")]")).click();
		// TODO Auto-generated method stub

	}

}
