package Greeshma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gprec {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://examcell.gprec.ac.in/studentdetails/studentdetailslogin.aspx");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_dfRollNo']")).sendKeys("189x1a0213");
		driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceHolder1_dfDob\']")).sendKeys("15052001");
		driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceHolder1_ImageButton1\']")).click();
		driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceHolder1_Button1\']")).click();
		driver.close();
		// TODO Auto-generated method stub

	}

}
