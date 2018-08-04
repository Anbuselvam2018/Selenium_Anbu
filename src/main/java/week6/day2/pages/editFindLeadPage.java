package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;


public class editFindLeadPage extends Annotations {
	
	public editFindLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement elefName;
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleclickfind;
	
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleSearchFindLeads;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement eleClickEdit;
	
	@FindBy(id="updateLeadForm_firstName")
	WebElement eleUpdatefName;
	
	@FindBy(xpath="//input[@value='Update']")
	WebElement eleUpdateButton;
	
	
	
	public editFindLeadPage typefName(String fName)
	{
		type(elefName,fName);
		return this;
	}

	public editFindLeadPage clickFindLeads()
	{
		click(eleclickfind);
		return this;
	}
	
	public editFindLeadPage ClickFindSearch()
	{
		click(eleSearchFindLeads);
		return this;
	}

	public editFindLeadPage clickEdit()
	{
		click(eleClickEdit);
		return this;
	}
	
	public editFindLeadPage typeUpdatefName(String fNameUpdate )
	{
		type(eleUpdatefName,fNameUpdate);
		return this;
	}
	
	
	public viewLeadPage clickUpdateButton()
	{
		click(eleUpdateButton);
		return new viewLeadPage();
	}
	
}
