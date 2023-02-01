package Greeshma;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		List <WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			WebElement ele=list.get(i);
			String url=ele.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection http=(HttpURLConnection) link.openConnection();
			Thread.sleep(1000);
			http.connect();
			int rescode=http.getResponseCode();
			if(rescode>=400)
			{
				System.out.println(url+" "+"is a broken link");
			}
			else
			{
				System.out.println(url+" "+"is not a broken link");
			}
			
		}

	}

}
