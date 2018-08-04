package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerVerifications {

	public static void main(String[] args) {
		//Set the property of the brower
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		//Launch chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leafground.com/home.html");
		//Maximize window
		driver.manage().window().maximize();
		//Get the title
		System.out.println("The Title is" +driver.getTitle());
		
		if(driver.getTitle().contains("TestLeaf - Selenium Playground")) {
			System.out.println("I confirm that title has Test Leaf");
		}
		else
		{
			System.out.println("Title does not have title as Test Leaf");
		}
		
		// get current URL
		System.out.println("The current URL" +driver.getCurrentUrl());
		
		// get current source code
		System.out.println("The current URL" +driver.getPageSource());
		
		//To Close Browser
		driver.close();
		
		
	}

}
