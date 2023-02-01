package Greeshma;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Downloadfile2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		HashMap<String,Object> pref=new HashMap<>();
		pref.put("plugins.alwayas_open_pdf_externally", true);
		options.setExperimentalOption("prefs", pref);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://file-examples.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"dismiss-button\"]")).click();
		driver.findElement(By.xpath("//h3[text()=\"Documents\"]/following-sibling::a")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
		driver.findElement(By.xpath("//td[text()=\"PDF\"]/following-sibling::td[2]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),\"Download sample\")]")).click();
		// TODO Auto-generated method stub

	}

}
