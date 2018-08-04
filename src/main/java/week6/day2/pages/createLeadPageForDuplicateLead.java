package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;


public class createLeadPageForDuplicateLead extends Annotations {
	
	public createLeadPageForDuplicateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="createLeadForm_lastNameLocal")
	WebElement elelocName;

	@FindBy(xpath="(//input[@class='smallSubmit'])")
	WebElement eleSmallButton;
	
	public createLeadPageForDuplicateLead typelocName(String locName)
	{
		type(elelocName,locName);
		return this;
	}
	
	public viewLeadPage clickSubmit()
	{
		click(eleSmallButton);
		return new viewLeadPage();
	}

}
