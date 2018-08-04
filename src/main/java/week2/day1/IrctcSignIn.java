package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");	
		driver.findElementByLinkText("REGISTER").click();
		driver.findElementById("userName").sendKeys("SeleniumAnbuJune30");
		driver.findElementById("usrPwd").sendKeys("AnbuJune30");
		driver.findElementById("cnfUsrPwd").sendKeys("AnbuJune30");
		//driver.findElementsByClassName("ng-tns-c13-7 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted")
	}

}
