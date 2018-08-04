package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDay1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("DXC Technologies");
		driver.findElementById("createLeadForm_firstName").sendKeys("Anbuselvam");
		driver.findElementById("createLeadForm_lastName").sendKeys("THAMANNA NEDUMARAN");
		WebElement Source=driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(Source);
		dd.selectByVisibleText("Conference");
		List<WebElement> allOptions=dd.getOptions();
		int size=allOptions.size();
		System.out.println(size);
		dd.selectByIndex(size-1);
		for(WebElement eachOpt : allOptions)
		{
			String text =eachOpt.getText();
			System.out.println(text);
		}
	}


}
