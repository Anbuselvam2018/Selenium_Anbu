package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningAUTSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://jqueryui.com/droppable/");
		 WebElement eleFrameDrag = driver.findElementByClassName("demo-frame");
		 driver.switchTo().frame(eleFrameDrag);

		 WebElement eleDrag1 = driver.findElementByXPath("//p[text()='Drag me to my target']");
		 WebElement eleDrag2 = driver.findElementById("droppable");
		 
		 Actions builder = new Actions(driver);
		 builder.dragAndDrop(eleDrag1, eleDrag2).perform();
		 
	}

}
