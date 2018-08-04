package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningAUTDroppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://jqueryui.com/selectable/");
		 WebElement eleFrameDrag = driver.findElementByClassName("demo-frame");
		 driver.switchTo().frame(eleFrameDrag);

		 WebElement eleItem1 = driver.findElementByXPath("//ol[text()='selectable']/li[1)");
		 WebElement eleItem2 = driver.findElementByXPath("//ol[text()='selectable']/li[4)");
		 
		 Actions builder = new Actions(driver);
		 builder.dragAndDrop(eleItem1, eleItem2);
		 
	}

}
