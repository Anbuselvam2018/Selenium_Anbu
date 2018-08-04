
/*HW#2: Find the number of frames within the application (only in chrome):

http://layout.jquery-dev.com/demos/iframes_many.html

Tip: The application has nested frames of only one level.
Hence you need to go within each frame and check if that frame has any 
child frame or not? And then you need to come out and go to next frame.*/

package week3.day1;




import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HomeWork2 {

	public static void main(String[] args) throws InterruptedException  {
		//Setting the System property
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		// Launching url
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Find the number of frames within the application (only in chrome)
		
		List<WebElement> iframes = driver.findElementsByXPath("//iframe");
		
		System.out.println("Total number of frames are :" +iframes.size());
		

		driver.close();
		driver.quit();
		

	}

}
