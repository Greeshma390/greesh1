package Greeshma;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")).click();
//		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for=\"tripType\"]")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"dropDownList\"]//li"));
//		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
//			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Round Trip"))
			{
				list.get(i).click();
				break;
			}
		}
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//descendant::div[@class=\"makeFlex\"]"));
//		System.out.println(list1.size());
		for(int i=0;i<list1.size();i++)
		{
//			System.out.println(list1.get(i).getText());
			if(list1.get(i).getText().contains("Agra, India"))
			{
				list1.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//html[@dir=\"ltr\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"toCity\"]")).click();
		List<WebElement> list2=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//descendant::div[@class=\"makeFlex\"]"));
//		System.out.println(list1.size());
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i).getText());
			if(list2.get(i).getText().contains("Chennai, India"))
			{
				list2.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//html[@dir=\"ltr\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"departure\"]")).click();
		String month="January 2023";
		String date="26";
		while(true)
		{
			String text=driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[5]/div[1]/div/div/div/div/div[2]/div[1]/div[1]/div")).getText();
			String text1=driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[5]/div[1]/div/div/div/div/div[2]/div[2]/div[1]/div")).getText();
			if(text.equals(month) || text1.equals(month))
			{
				if(text.equals(month))
				{
					driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[5]/div[1]/div/div/div/div/div[2]/div[1]//div[@class='DayPicker-Day']//div[@class='dateContainer']//p[text()="+date+"]")).click();
					break;
				}
				else if(text1.equals(month))
				{
					driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[5]/div[1]/div/div/div/div/div[2]/div[2]//div[@class='DayPicker-Day']//div[@class='dateContainer']//p[text()="+date+"]")).click();
					break;
				}
				else
				{
					driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
				}
			}
//			driver.findElement(By.xpath("//input[@id=\"return\"]")).click();
			String month1="February 2023";
			String date1="12";
			while(true)
			{
				String text2=driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[6]/div[1]/div/div/div/div/div[2]/div[1]/div[1]")).getText();
				String text3=driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[6]/div[1]/div/div/div/div/div[2]/div[2]/div[1]")).getText();
				if(text2.equals(month1) || text3.equals(month1))
				{
					if(text2.equals(month1))
					{
						driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[6]/div[1]/div/div/div/div/div[2]/div[1]//div[@class=\"DayPicker-Day\" and text()="+date1+"]]")).click();
						break;
					}
					else if(text3.equals(month1))
					{
						driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[6]/div[1]/div/div/div/div/div[2]/div[2]//div[@class=\"DayPicker-Day\" and text()="+date1+"]")).click();
						break;
					}
					else
					{
						driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[6]/div[1]/div/div/div/div/div[1]/span[2]")).click();
					}
				}
		}
		
		
	}

}
}
