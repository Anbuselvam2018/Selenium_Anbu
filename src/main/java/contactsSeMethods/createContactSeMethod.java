package contactsSeMethods;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import wd.SeMethods;

public class createContactSeMethod extends SeMethods{

	@Test
	public void CreateContactTest() throws InterruptedException {

		startApp("Chrome", "http://leaftaps.com/opentaps/");

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,"DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword,"crmsfa");

		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);

		WebElement eleCreateLink = locateElement("xpath","//*[@id='label']/a");
		click(eleCreateLink);
		
	

		WebElement eleCreateContactLink = locateElement("linkText","Create Contact");
		click(eleCreateContactLink);


		WebElement eleFirstName = locateElement("id", "firstNameField");
		type(eleFirstName,"Willam");

		WebElement eleLastName = locateElement("id", "lastNameField");
		type(eleLastName,"Jones");


		WebElement   eleFirstNameLoc = locateElement("id","createContactForm_firstNameLocal");
		type(eleFirstNameLoc,"Vincent");

		WebElement   eleLastNameLoc = locateElement("id","createContactForm_lastNameLocal");
		type(eleLastNameLoc,"William");

		WebElement   eleSalutation = locateElement("id","createContactForm_personalTitle");
		type(eleSalutation,"Mr.");


		WebElement   eleDescription = locateElement("id","createContactForm_description");
		type(eleDescription,"Day 4 - Project Day");


		WebElement   eleImpNote = locateElement("id","createContactForm_importantNote");
		type(eleImpNote,"Don't Miss it");

		WebElement eleAreaCode = locateElement("id", "createContactForm_primaryPhoneAreaCode");
		type(eleAreaCode,"23");

		WebElement eleExt = locateElement("id", "createContactForm_primaryPhoneExtension");
		type(eleExt,"23");

		WebElement eleMail = locateElement("id", "createContactForm_primaryEmail");
		type(eleMail,"ars@gmail.com");

		WebElement elePriPhone = locateElement("id", "createContactForm_primaryPhoneNumber");
		type(elePriPhone,"123123123");

		WebElement eleAskPhone = locateElement("id", "createContactForm_primaryPhoneAskForName");
		type(eleAskPhone,"123123123");



		WebElement eleAddress1 = locateElement("id", "createContactForm_generalAddress1");
		type(eleAddress1,"xyz chennai");

		WebElement eleAddress2 = locateElement("id", "createContactForm_generalAddress2");
		type(eleAddress2,"Test Leaf Chennai");

		WebElement eleCity = locateElement("id", "createContactForm_generalCity");
		type(eleCity,"Chennai");

		WebElement elePostalCode = locateElement("id", "createContactForm_generalPostalCode");
		type(elePostalCode,"600078");

		WebElement elePostalExt = locateElement("id", "createContactForm_generalPostalCodeExt");
		type(elePostalExt,"2344");

		WebElement eleAttnName = locateElement("id", "createContactForm_generalAttnName");
		type(eleAttnName,"Balmer");

		WebElement   eleCountry = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText(eleCountry, "United States");

	
		WebElement   eleState = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(eleState, "Alaska");

		WebElement eleEditSubmit = locateElement("class","smallSubmit");
		click(eleEditSubmit);

	/*	
		WebElement eleToName= locateElement("id", "generalToNameField");
		String varToName = getAttribute(eleToName);
				
		WebElement eleFirstName1 = locateElement("xpath","//span[text()='JohnStephen']");
		verifyPartialText(eleFirstName1, varToName);
		
	
		WebElement eleEdit = locateElement("xapth","//a[text()='Edit']");
		click(eleEdit);
		
		
		WebElement   eleeMarCamp = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(eleeMarCamp, "Automobile");

		WebElement eleAdd = locateElement("xapth","//input[@value ='Add']");
		click(eleAdd);
		
		WebElement updateContact = locateElement("updateContactForm_departmentName");
		type(updateContact, "Automobile");
	

		WebElement eleClickUpdate = locateElement("xapth","//input[@value ='Update']");
		click(eleClickUpdate);
		
*/	

		//closeAllBrowsers();




	}


}
