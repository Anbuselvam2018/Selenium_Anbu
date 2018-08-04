package wdMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.IGherkinFormatterModel;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateContactReports {

	public static void main(String[] args) {
		 
		/*ExtentHtmlReporter html = new ExtentHtmlReporter("../reports/results.html");
		html.setAppendExisting(false);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		String testCaseName="TC001";
		String testDesc="TC001";
		
		Class<? extends IGherkinFormatterModel> testName;
		String description;
		ExtentTest suitetest = extent.createTest(testName, description)
				
*/		 System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElementById("username").sendKeys("DemoSalesManager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByXPath("//*[@id='label']/a").click();
		 driver.findElementByXPath("//a[text()='Create Contact']").click();
		 driver.findElementById("firstNameField").sendKeys("JohnStephen");
		 driver.findElementById("lastNameField").sendKeys("Simson");
		 
		 driver.findElementById("createContactForm_firstNameLocal").sendKeys("Sim");
		 driver.findElementById("createContactForm_lastNameLocal").sendKeys("William");
		 driver.findElementById("createContactForm_personalTitle").sendKeys("Mr");
		 driver.findElementById("createContactForm_generalProfTitle").sendKeys("Mr");
		 
		 WebElement eleSelectCurrency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		 Select objCurrency = new Select(eleSelectCurrency);
		 objCurrency.selectByVisibleText("EUR - Euro");
		 
		 driver.findElementById("createContactForm_description").sendKeys("Day 4 - Project Day");
		 driver.findElementById("createContactForm_importantNote").sendKeys("Don't Miss it");
		 driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("23");
		 driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("233");
		 
		 driver.findElementById("createContactForm_primaryEmail").sendKeys("ars@gmail.com");
		 driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("123123123");
		 
		 driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("123"); 
		 
		 String varToName = driver.findElementById("generalToNameField").getAttribute("value");
		 System.out.println("varToName: "+varToName);
		 
		 driver.findElementById("createContactForm_generalAddress1").sendKeys("xyz chennai");
		 driver.findElementById("createContactForm_generalAddress2").sendKeys("Test Leaf Chennai");
		 driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		 
		 driver.findElementById("createContactForm_generalPostalCode").sendKeys("600078");
		 driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("2344");
		 
		 driver.findElementById("createContactForm_generalAttnName").sendKeys("Veenran");
		 
		 
		 WebElement eleCountry = driver.findElementById("createContactForm_generalCountryGeoId");
		 Select eleSelectCountry = new Select(eleCountry);
		 eleSelectCountry.selectByVisibleText("United States");
		 
		 WebElement eleState = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		 Select eleSelectState = new Select(eleState);
		 eleSelectState.selectByVisibleText("Alabama");
		 
		 driver.findElementByClassName("smallSubmit").click();
		 
		 String valFirstName = driver.findElementByXPath("//span[text()='JohnStephen']").getText();
		 System.out.println("valFirstName: "+valFirstName);
		 
		 if(valFirstName.contains(varToName))
				 {
			 assert(valFirstName.contains(varToName));
			 		System.out.println("Matched Successfully");
				 }
		 else	{
			 System.out.println("Not Matched");
		 }
		 
		 driver.findElementByXPath("//a[text()='Edit']").click();
		 
		 
		 WebElement eleeMarCamp = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		 Select eleChooseMarCamp = new Select(eleeMarCamp);
		 eleChooseMarCamp.selectByVisibleText("Automobile");
		 
		 driver.findElementByXPath("//input[@value ='Add']").click();
		 
		 driver.findElementById("updateContactForm_departmentName").sendKeys("Automobile");
		 driver.findElementByXPath("//input[@value ='Update']").click();
		 
		
		 
		 
		 	
	}
	

}
