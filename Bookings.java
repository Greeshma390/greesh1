package Greeshma;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bookings {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.booking.com/?aid=355028");
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[2]/ul/li[2]/a/span[2]")).click();
		WebElement economy=driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/select"));
		Select sc=new Select(economy);
		sc.selectByVisibleText("Business");
		driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/span/div")).click();
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"__bui-9\"]/div/div/div/div/div/div[1]"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Adult"))
			{
				list.get(i).findElement(By.xpath("//*[@id=\"__bui-7\"]/div/div/div/div/div/div[1]/div[1]/div/div[2]/button[2]")).click();
			}
		}

	}

}
