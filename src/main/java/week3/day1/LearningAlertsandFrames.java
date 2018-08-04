package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlertsandFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		Alert alertEle = driver.switchTo().alert();
		alertEle.getText();
		System.out.println(alertEle.getText());
		alertEle.sendKeys("Week3");
		alertEle.accept();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//*[@id='tryhome']").click();
		driver.close();

	}

}
