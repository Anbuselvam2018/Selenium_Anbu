package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		//Setting System property
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		// Launch gmail
		driver.get("https://accounts.google.com/ServiceLogin?");
		/*driver.findElementById("identifierId").sendKeys("tnanbuselvam@gmail.com");
		driver.findElementById("identifierNext").click();
		driver.findElementByXPath("//input[@name='password']").sendKeys("Nedumaran@123");
		driver.findElementById("passwordNext").click();*/
		
		driver.get("https://accounts.google.com/ServiceLogin?");
	    // gmail login
	    driver.findElement(By.id("Email")).sendKeys("tnanbuselvam@gmail.com");
	    driver.findElement(By.id("next")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("Passwd")).sendKeys("Nedumaran@123");
	    driver.findElement(By.id("signIn")).click();

	    // some optional actions for reaching gmail inbox
	    driver.findElement(By.xpath("//*[@title='Google apps']")).click();
	    driver.findElement(By.id("gb23")).click();
	    // clicks compose
	    driver.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3")).click();
	    // types message in body without hampering signature
	    driver.findElement(By.id(":pg")).sendKeys("This is an auto-generated mail");;

		
		
	}

}
