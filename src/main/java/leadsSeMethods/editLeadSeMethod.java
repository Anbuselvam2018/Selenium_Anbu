package leadsSeMethods;

import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import wd.SeMethods;

public class editLeadSeMethod extends SeMethods{
	@Test
	public void EditLeadTest() throws InterruptedException {

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
		type(eleFirstName,"VincetHarris");


		/*WebElement eleCompanyName = locateElement("xpath","(//input[@name='companyName'])[2]");
		type(eleCompanyName,"SAM INTERNATIONAL");*/

		WebElement eleclickfind = locateElement("xpath","//button[text()='Find Leads']");
		click(eleclickfind);



		//Thread.sleep(10000);
		WebElement eleSearchFindLeads =   locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(eleSearchFindLeads);

		WebElement eleClickEdit= locateElement("xpath","//a[text()='Edit']");
		click(eleClickEdit);



		verifyTitle("View Lead | opentaps CRM");
		
		WebElement eleChangeCompanyName=locateElement("xpath","(//input[@name='companyName'])[2]");
		eleChangeCompanyName.clear();
		
		type(eleChangeCompanyName, "ROYAL INTERNATIONAL");

	/*	WebElement eleGetFirstName=locateElement("id","updateLeadForm_firstName");
		eleGetFirstName.clear();

		WebElement updateFirstName=locateElement("id","updateLeadForm_firstName");
		type(updateFirstName, "VincetHarrisVillan");*/

		WebElement updateDetails = locateElement("xpath","//input[@value='Update']");
		click(updateDetails);

		WebElement verifyChangedCompanyName=locateElement("id","viewLead_companyName_sp");
		verifyExactText(verifyChangedCompanyName, "ROYAL INTERNATIONAL (11009)");


		Thread.sleep(5000);
		closeAllBrowsers();

	}


}
