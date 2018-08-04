package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set the property of the browser
				System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
				//Launch chrome browser
				ChromeDriver driver = new ChromeDriver();
				//Load URL
				driver.get("http://leafground.com/pages/Edit.html");
				//Maximize window
				driver.manage().window().maximize();
				System.out.println(driver.findElementByName("username").getAttribute("value"));
				
				
				driver.get("http://leafground.com/pages/Link.html");
				//Maximize window
				driver.manage().window().maximize();
				//Get the attribute value of  "Get Default text entered "
				System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
				
				
		//Get the text of the color
				driver.get("http://leafground.com/pages/Button.html");
				
				System.out.println(driver.findElementById("color").getCssValue("background-color"));
				
				System.out.println(driver.findElementById("color").getText());
				
				//Get location of both x and y
				System.out.println(driver.findElementById("color").getLocation());
				
				System.out.println(driver.findElementById("color").getLocation().getX());	
				
				System.out.println(driver.findElementById("color").getSize());
				
				System.out.println(driver.findElementById("color").getTagName());
				
				System.out.println(driver.findElementById("color").isDisplayed());
				
				System.out.println(driver.findElementById("color").isSelected());
				
		
				
				driver.get("http://leafground.com/pages/Edit.html");
				
				System.out.println(driver.findElementByName("username").isEnabled());
				
				System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/div/div/input").isEnabled());
				
			
				
				driver.get("http://leafground.com/pages/checkbox.html");
				
				System.out.println(driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/input[1]").isSelected());
				
				driver.close();
	}
	
}
