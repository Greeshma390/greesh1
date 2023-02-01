package Greeshma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Greeshma.Juturu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source=driver.findElement(By.id("box5"));
		WebElement target=driver.findElement(By.id("box106"));
		Actions act=new Actions(driver);
//		act.clickAndHold(source).moveToElement(target).release().build().perform();
		act.dragAndDrop(source, target).build().perform();
		// TODO Auto-generated method stub

	}

}
