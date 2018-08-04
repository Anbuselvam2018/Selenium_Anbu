package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningAUTFlip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.flipkart.com/");
		 driver.findElementByXPath("//button[text()='✕']").click();
		 WebElement eleTVAppliance = driver.findElementByXPath("//span [text()='TVs & Appliances']");
		 WebElement eleThomson = driver.findElementByXPath("//span [text()='Thomson']");
		 Actions builder = new Actions(driver);
		 builder.moveToElement(eleTVAppliance).pause(3000).click(eleThomson).perform();
		 
	}

}
