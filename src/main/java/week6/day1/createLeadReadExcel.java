package week6.day1;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testng.Annotations;
import wd.SeMethods;


public class createLeadReadExcel extends Annotations{
	@Test(dataProvider="CreateLead")
	public void CreateLeadTest(String cName,String fName,String lName,String eMail, String phone) {
	
/*		startApp("Chrome", "http://leaftaps.com/opentaps/");
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,"DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword,"crmsfa");
		
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCreateLink = locateElement("xpath","//*[@id='label']/a");
		click(eleCreateLink);
*/		
		WebElement eleCreateLeadLink = locateElement("linkText","Create Lead");
		click(eleCreateLeadLink);
		
		WebElement eleComplanyName = locateElement("id", "createLeadForm_companyName");
		type(eleComplanyName,cName);
		
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName,fName);
		
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName,lName);
		/*
		WebElement   eleFirstNameLoc = locateElement("id","createLeadForm_firstNameLocal");
		type(eleFirstNameLoc,"Vincent");
		
		WebElement   eleLastNameLoc = locateElement("id","createLeadForm_lastNameLocal");
		type(eleLastNameLoc,"William");
		
		WebElement   eleSalutation = locateElement("id","createLeadForm_personalTitle");
		type(eleSalutation,"Mr.");
			
		
		WebElement eleSourceDD = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(eleSourceDD,"Employee");
		

		WebElement   eleTitle = locateElement("id","createLeadForm_generalProfTitle");
		type(eleTitle,"Mr.");
		
		WebElement   eleAnnulRevenue = locateElement("id","createLeadForm_annualRevenue");
		type(eleAnnulRevenue,"200000");
		
		WebElement   eleChooseIndustry = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingText(eleChooseIndustry,"Computer Software");
		
		
		WebElement   eleChooseOwnership = locateElement("id","createLeadForm_ownershipEnumId");
		selectDropDownUsingText(eleChooseOwnership,"Partnership");
		
		
		WebElement   eleSICCode = locateElement("id","createLeadForm_sicCode");
		type(eleSICCode,"SICJune30");
		
		WebElement   eleDescription = locateElement("id","createLeadForm_description");
		type(eleDescription,"http://leaftaps.com/crmsfa/control/createLeadForm;jsessionid=3A7BC49EFDE263F11968C9FA465C3D0E.jvm1");
		
		WebElement   eleImpNote = locateElement("id","createLeadForm_importantNote");
		type(eleImpNote,"Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class");
		
		WebElement   eleCountryCode = locateElement("id","createLeadForm_primaryPhoneCountryCode");
		type(eleCountryCode,"+91");
		
		WebElement   eleAreaCode = locateElement("id","createLeadForm_primaryPhoneAreaCode");
		type(eleAreaCode,"44");
		
		WebElement   eleExtCode = locateElement("id","createLeadForm_primaryPhoneExtension");
		type(eleExtCode,"724186");
		
		WebElement   eleDept = locateElement("id","createLeadForm_departmentName");
		type(eleDept,"Software Testing");
		
		WebElement elePreCurrency = locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingText(elePreCurrency,"INR - Indian Rupee");
		
		WebElement   eleNoOfEmployees = locateElement("id","createLeadForm_numberEmployees");
		type(eleNoOfEmployees,"1000");
		
		WebElement   eleTickerSymbol = locateElement("id","createLeadForm_tickerSymbol");
		type(eleTickerSymbol,"Plus");
		
		WebElement   elePrimaryPhone = locateElement("id","createLeadForm_primaryPhoneAskForName");
		type(elePrimaryPhone,"123123");
			
		WebElement   eleWebUrl = locateElement("id","createLeadForm_primaryWebUrl");
		type(eleWebUrl,"http://leaftaps.com/opentaps/control/main");
		

		WebElement eleMarketingCamp = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingText(eleMarketingCamp,"Affiliate Sites");
*/		
		WebElement eleEmail = locateElement("id","createLeadForm_primaryEmail");
		type(eleEmail,eMail); 
		
		WebElement elePhoneNumber = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elePhoneNumber,""+phone);
		
			
	/*	WebElement eleStateProvince = locateElement("id","createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(eleStateProvince,"Florida");
		
		WebElement eleCountry = locateElement("id","createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(eleCountry,"United States");
		
		WebElement   eleAddress2 = locateElement("id","createLeadForm_generalAddress2");
		type(eleAddress2,"Chennai,Tamil Naud, India");
		
		WebElement elePostalCode = locateElement("id","createLeadForm_generalPostalCode");
		type(elePostalCode,"1234");
		
		WebElement elePostalCodeExt = locateElement("id","createLeadForm_generalPostalCodeExt");
		type(elePostalCodeExt,"3333");	
		
		WebElement   eleAddress1 = locateElement("id","createLeadForm_generalAddress1");
		type(eleAddress1,"40 Rajaji Street");
	
		
		 */
			
		WebElement eleCreateLeadButton = locateElement("Name","submitButton");
		click(eleCreateLeadButton);
		
		
		
/*		//Match
		WebElement eleViewFirstname= locateElement("id", "viewLead_firstName_sp");		
		verifyExactText(eleViewFirstname, "John");
		
		closeBrowser();
		closeAllBrowsers();*/
		
		
		
	
	}
 
	@DataProvider(name="CreateLead")
	public Object getData() throws IOException {
		ReadExcelArray excel=new ReadExcelArray();
		return excel.readExcel("CreateLead");
	}
	}
	


