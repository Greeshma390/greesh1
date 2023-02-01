package Greeshma;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		Select sc=new Select(day);
		sc.selectByIndex(10);
		System.out.println(sc.isMultiple());
		List<WebElement> list=sc.getOptions();
		System.out.println(list.size());
		int n=list.size();
		for(int i=0;i<n;i++)
		{
			String data=list.get(i).getText();
			System.out.println(data);
			if(data.equals("15"))
			{
				list.get(i).click();
				break;
			}
		}
		
		// TODO Auto-generated method stub

	}

}
