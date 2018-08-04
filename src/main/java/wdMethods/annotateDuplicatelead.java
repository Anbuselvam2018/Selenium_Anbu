package wdMethods;

import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import testng.Annotations;
import wd.SeMethods;

public class annotateDuplicatelead extends Annotations{
	@Test
	public void DulicateLeadTest() throws InterruptedException {

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
		
		WebElement eleFirstName = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(eleFirstName,"Kamalesh");

		WebElement eleCompanyName = locateElement("xpath","(//input[@name='companyName'])[2]");
		type(eleCompanyName,"SevenStar");
		
	
		
		WebElement eleclickfind = locateElement("xpath","//button[text()='Find Leads']");
		click(eleclickfind);
	
		Thread.sleep(5000);
		
		WebElement eleSearchFindLeads =   locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(eleSearchFindLeads);
		
		WebElement eleClickDuplicate= locateElement("xpath","//a[text()='Duplicate Lead']");
		click(eleClickDuplicate);

		WebElement eleCreateFromDuplicate= locateElement("xpath","//input[@value='Create Lead']");
		click(eleCreateFromDuplicate);

	
		Thread.sleep(5000);
		closeAllBrowsers();

	}


}
