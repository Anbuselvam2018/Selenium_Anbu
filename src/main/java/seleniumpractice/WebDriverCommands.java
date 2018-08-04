package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
	
/*	Launch a new Firefox browser.
	Open Store.DemoQA.com
	Get Page Title name and Title length
	Print Page Title and Title length on the Eclipse Console.
	Get Page URL and verify if the it is a correct page opened
	Get Page Source (HTML Source code) and Page Source length
	Print Page Length on Eclipse Console.
	Close the Browser.*/

	public static void main(String[] args) {
	//create new instance of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	// Store the application url
		String  url = "http://www.store.demoqa.com";
		driver.get(url);
		
		String title=driver.getTitle();
		
		int titlelength = driver.getTitle().length();
			
		System.out.println("Title of the page is : " +title);
		
		System.out.println("length  of the Titleis : " +titlelength);
		
		String pageurl=driver.getCurrentUrl();
		
		System.out.println("The page url is " +pageurl);
		
		if (pageurl.equals(url)){
			System.out.println("verification is successful");
		}
		
		String pagesource=driver.getPageSource();
		System.out.println("The page source is"+pagesource);
		
		int pagesourcelength=pagesource.length();
		System.out.println("Total length of the Pgae Source is : " + pagesourcelength);
	//	driver.close();

	}

}
