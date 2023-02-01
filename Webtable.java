package Greeshma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("saikrishna333380@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Pavan@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		WebElement input=driver.findElement(By.xpath("//a[@href=\"/contacts\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(input).click().build().perform();
		String before_path="//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
		String after_path="]/td[2]/a";
		for(int i=1;i<=2;i++)
		{
			String name=driver.findElement(By.xpath(before_path+i+after_path)).getText();
			System.out.println(name);
			if(name.contains("kalyan"))
			{
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr["+i+"]/td[2]/a")).click();
			}
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
