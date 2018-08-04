package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;


public class viewLeadPage extends Annotations{

	public viewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement elefName;



	@FindBy(xpath="//a[text()='Delete']")
	WebElement eleClickDelete;
	
	public void verifyFirstName(String fName )
	{
		
		verifyPartialText(elefName, fName);
		
	}
	

	public void verifyFirstNameForDeleteLeadPage(String fName )
	{
		
		verifyPartialText(elefName, fName);
		
	}

	public viewLeadPage clickDeleteButton()
	{
		click(eleClickDelete);
		return new viewLeadPage();
	}
	
}
