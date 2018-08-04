package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;


public class myLeadPage extends Annotations{

	public myLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Create Lead")
	WebElement eleCreateLeads;

	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;

	@FindBy(xpath="//a[text()='Delete']")
	WebElement eleDeleteLead;

	/*@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeads;*/

	public createLeadPage clickCreateLeads()
	{

		click(eleCreateLeads);
		return new createLeadPage();
	}


	public  editFindLeadPage clickEditLeads()
	{

		click(eleFindLeads);
		return new editFindLeadPage();
	}

	public  findRecordPageForDuplicateLead clickDupFindLead()
	{

		click(eleFindLeads);
		return new findRecordPageForDuplicateLead();
	}

	public deleateFindLeadPage ClickToDeleteLead() {

		click(eleDeleteLead);
		return new deleateFindLeadPage();
		
	}

}
