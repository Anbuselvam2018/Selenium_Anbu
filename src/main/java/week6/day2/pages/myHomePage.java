package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;

public class myHomePage extends Annotations{

	public myHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	
	public myLeadPage clickLead()
	{
		click(eleLeads);
		return new myLeadPage();
	}
}
