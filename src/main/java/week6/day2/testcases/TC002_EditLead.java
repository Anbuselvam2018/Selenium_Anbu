package week6.day2.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wd.Annotations;
import week6.day2.pages.myHomePage;

public class TC002_EditLead extends Annotations	 {
	@BeforeTest
	public void SetValues() 
	{
		excelFileName = "EditLeadTC01";
		testName = "Edit Lead";
		testDesc = "Lead Creation";
		category = "Sanity";
		author = "Anbu";
		moduleName = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void EditLead(String fName, String fNameUpdate ) throws InterruptedException
	{
		new myHomePage()
		.clickLead()
		.clickEditLeads()
		.typefName(fName)
		.clickFindLeads()
		.ClickFindSearch()
		.clickEdit()
		.typeUpdatefName(fNameUpdate)
		.clickUpdateButton();
		
		
	}
	

}
