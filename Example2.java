package Greeshma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("greeshma");
		driver.findElement(By.id("userEmail")).sendKeys("greeshma@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Chennai");
		driver.findElement(By.id("permanentAddress")).sendKeys("kurnool");
		driver.findElement(By.id("submit")).click();
		driver.close();
//		driver.quit();
		// TODO Auto-generated method stub

	}

}
