package Greeshma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://file-examples.com/");
		driver.findElement(By.xpath("//h3[text()=\"Documents\"]/following-sibling::a")).click();
		driver.findElement(By.xpath("//td[text()=\"PDF\"]/following-sibling::td[2]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),\"Download sample\")]")).click();
		// TODO Auto-generated method stub

	}

}
