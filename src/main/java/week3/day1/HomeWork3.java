

/*HW#3: Close all the frames other than center -
http://layout.jquery-dev.com/demos/iframe_local.html 
Tip: Some of the close button is inside a frame and some are not. 
So you should move inside a frame and check if there are any close button. 
If yes, click of all them*/

package week3.day1;




import org.openqa.selenium.chrome.ChromeDriver;



public class HomeWork3 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html ");
		driver.manage().window().maximize();
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		

		
	

	}

}
