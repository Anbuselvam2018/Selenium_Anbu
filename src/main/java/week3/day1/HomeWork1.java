package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HomeWork1 {

	public static void main(String[] args) throws InterruptedException  {
		//Setting System property
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		// Launch irctc
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		// Click "Contact Us"
		driver.findElementByXPath("//*[@id='topnav']/li[3]/a").click();
		
		
		Set<String> allWindowHandle = driver.getWindowHandles();
		List<String> listOfAllWindowHandle = new ArrayList<String>();
		listOfAllWindowHandle.addAll(allWindowHandle);
		driver.switchTo().window(listOfAllWindowHandle.get(1));
		// GetTitle 
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		// Get URL
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(listOfAllWindowHandle.get(0));
		
		//Click "Compatible Browser"
		driver.findElementByXPath("/html/body/div[4]/div/div/div[2]/a").click();
		
		// GetTitle 
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		// Get URL
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		//Print the list of browsers
		
		List<WebElement> allElements = driver.findElementsByXPath("/html/body/div[4]/div/div/div[2]/a");
		int count=allElements.size();
		for(int i=1;i<=count;i++){
		    allElements = driver.findElementsByXPath("/html/body/div[4]/div/div/div[2]/a");
		    System.out.println(allElements);
		}
		
		//Close the ParentWindow, Contact US
		
		driver.close();
		driver.quit();
		
	

	}

}
