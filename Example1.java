package Greeshma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=1udMohDluVQ&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV&index=3");
		
		// TODO Auto-generated method stub

	}

}
