package testng;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wd.SeMethods;

public class deleateleadTestNG extends SeMethods{
	@Test
	
	public void DeleteLeadTest() throws InterruptedException {

		startApp("Chrome", "http://leaftaps.com/opentaps/");

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,"DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword,"crmsfa");

		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);

		WebElement eleCreateLink = locateElement("xpath","//*[@id='label']/a");
		click(eleCreateLink);

		WebElement eleCreateLeadLink = locateElement("linkText","Create Lead");
		click(eleCreateLeadLink);

		WebElement eleFindLeads = locateElement("linkText","Find Leads");
		click(eleFindLeads);
		
		WebElement eleEmailTab= locateElement("xpath","//span[text()='Email']");
		click(eleEmailTab);
		
		WebElement eleEmail= locateElement("xpath","//input[@name='emailAddress']");
		type(eleEmail, "tnas@gmail.com");
		
		
	/*	WebElement eleFirstName = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(eleFirstName,"Kamalesh");

		WebElement eleCompanyName = locateElement("xpath","(//input[@name='companyName'])[2]");
		type(eleCompanyName,"SevenStar");*/
		
	
		
		WebElement eleclickfind = locateElement("xpath","//button[text()='Find Leads']");
		click(eleclickfind);
	
		Thread.sleep(5000);
		
		WebElement eleSearchFindLeads =   locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(eleSearchFindLeads);
		
		
		WebElement eleDeleteButton= locateElement("xpath","//a[text()='Delete']");
		click(eleDeleteButton);
		
	
		//input[@name='emailAddress']	
		//span[text()='Email']
		//button[text()='Search']
		
	
		Thread.sleep(5000);
		//();

	}


}
