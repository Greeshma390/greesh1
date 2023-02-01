package Greeshma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("juturugreeshma390@gmail.c");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		if(driver.findElement(By.xpath("//div[text()='Enter a valid email or phone number']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
		}
		// TODO Auto-generated method stub

	}

}
