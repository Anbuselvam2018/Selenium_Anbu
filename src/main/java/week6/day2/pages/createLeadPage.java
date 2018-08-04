package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;


public class createLeadPage extends Annotations {
	
	public createLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="createLeadForm_companyName")
	WebElement elecName;

	@FindBy(id="createLeadForm_firstName")
	WebElement elefName;
	
	@FindBy(className="errorList")
	WebElement eleErrorMessage;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement elelName;
	
	@FindBy(xpath="//input[@name='submitButton']")
	WebElement eleSubmit;
	
	@FindBy(id="createLeadForm_primaryEmail")
	WebElement eleEnterEmail;
	
	public createLeadPage typecName(String cName)
	{
		type(elecName,cName);
		return this;
	}
	public createLeadPage typefName(String fName)
	{
		type(elefName,fName);
		return this;
	}
	public createLeadPage typelName(String lName)
	{
		type(elelName,lName);
		return this;
	}
	
	public createLeadPage typeEmail(String email)
	{
		type(eleEnterEmail,email);
		return this;
	}
	
	public viewLeadPage clickSubmit()
	{
		click(eleSubmit);
		return new viewLeadPage();
	}

}
