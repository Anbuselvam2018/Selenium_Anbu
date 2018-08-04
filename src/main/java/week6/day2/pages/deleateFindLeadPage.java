package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;

public class deleateFindLeadPage extends Annotations{

	public deleateFindLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement elefName;

	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleclickfind;

	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleSearchFindLeads;


	public deleateFindLeadPage typefNameToDelete(String fName) 
	{
		type(elefName, fName);
		return this;
	}
	
	public deleateFindLeadPage clickFindLeadsForDelete()
	{
		click(eleclickfind);
		return this;
	}
	
	public viewLeadPage searchFindLeadsForDelete()
	{
		click(eleSearchFindLeads);
		return new viewLeadPage();
	}
	
	
}
