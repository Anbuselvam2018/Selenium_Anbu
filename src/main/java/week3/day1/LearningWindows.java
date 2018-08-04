package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindows {

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
		
		Set<String> allWindowHandle = driver.getWindowHandles();
		List<String> listOfAllWindowHandle = new ArrayList<String>();
		listOfAllWindowHandle.addAll(allWindowHandle);
		
		driver.switchTo().window(listOfAllWindowHandle.get(1));
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(listOfAllWindowHandle.get(0));
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
	/*	driver.close();
		driver.quit();*/
		
	}

}
