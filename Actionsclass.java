package Greeshma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(10000);
		Actions act=new Actions(driver);
		WebElement input1=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
		act.moveToElement(input1).build().perform();
		Thread.sleep(3000);
		WebElement input2=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]"));
		act.moveToElement(input2).build().perform();
		Thread.sleep(3000);
		WebElement input3=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[1]"));
		act.moveToElement(input3).click().build().perform();
//		act.moveToElement(input1).moveToElement(input2).moveToElement(input3).click().build().perform();
		
		
		
		// TODO Auto-generated method stub

	}

}
