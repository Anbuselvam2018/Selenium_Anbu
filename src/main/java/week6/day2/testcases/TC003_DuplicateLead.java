package week6.day2.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wd.Annotations;
import week6.day2.pages.myHomePage;

public class TC003_DuplicateLead extends Annotations	 {
	@BeforeTest
	public void SetValues() 
	{
		excelFileName = "DuplicateLeadTC01";
		testName = "Duplicate Lead";
		testDesc = "Lead Creation";
		category = "Sanity";
		author = "xyz";
		moduleName = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String locName,String eMail) throws InterruptedException
	{
		new myHomePage()
			.clickLead()
			.clickDupFindLead()
			.clickEmail()
			.enterEmail(eMail)
			.clickSearch()
			.clickFirstRowInTheGrid()
			.clickDuplicateLead()
			.typelocName(locName)
			.clickSubmit();
			
			
			
			
			
		
	}
	

}
