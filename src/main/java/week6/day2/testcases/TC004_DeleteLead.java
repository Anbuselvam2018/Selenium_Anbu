package week6.day2.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wd.Annotations;
import week6.day2.pages.myHomePage;

public class TC004_DeleteLead extends Annotations	 {
	@BeforeTest
	public void SetValues() 
	{
		excelFileName = "DeleteLeadTC01";
		testName = "Delete Lead";
		testDesc = "Delete Lead";
		category = "Sanity";
		author = "xyz";
		moduleName = "Leads";
	}
	
	@Test(dataProvider = "fetchData")
	public void DeleteLead(String fName) throws InterruptedException
	{
		new myHomePage()
			.clickLead()
			.ClickToDeleteLead()
			.typefNameToDelete(fName)
			.clickFindLeadsForDelete()
			.searchFindLeadsForDelete()
			.clickDeleteButton()
			.verifyFirstNameForDeleteLeadPage(fName);
			
		
			
			
			
			
			
			
			
			
			
			
			
		
	}
	

}
