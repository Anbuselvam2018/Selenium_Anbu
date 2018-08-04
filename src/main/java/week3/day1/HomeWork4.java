

/* HW#4: Goto jqueryui.com and click on 
 * draggable and print the content of the element inside draggable and then click on droppable*/
 

package week3.day1;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HomeWork4 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\'sidebar\']/aside[1]/ul/li[1]/a").click();
		driver.findElementById("draggable").click();
		driver.findElementById("draggable").getText();
		System.out.println(driver.findElementById("draggable").getText());
		driver.close();
		

		
	

	}

}
