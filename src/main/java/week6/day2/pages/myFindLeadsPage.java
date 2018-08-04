package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;


public class myFindLeadsPage extends Annotations{
	
	public myFindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeads;
	
	public  myFindLeadsPage clickEditLeads()
	{
		
		click(eleFindLeads);
		return new myFindLeadsPage();
	}

}
