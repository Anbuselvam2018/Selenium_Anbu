package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;

public class findRecordPageForDuplicateLead extends Annotations{

	public  findRecordPageForDuplicateLead      () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Email']")
	WebElement eleMail;
	
	@FindBy(xpath="//input[@name='emailAddress']")
	WebElement eleEnterEmail;
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleSearchFindLeads;
	
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleSelectRow;
	
	public findRecordPageForDuplicateLead clickEmail() {
		click(eleMail);
		return this;
	}
	
	public findRecordPageForDuplicateLead enterEmail(String eMail) {
		type(eleEnterEmail,eMail);
		return this;
	}
	
	public findRecordPageForDuplicateLead clickSearch() {
		click(eleSearchFindLeads);
		return this;
	}
	
	public viewLeadPageForDuplicateLead clickFirstRowInTheGrid() {
		click(eleSelectRow);
		return new viewLeadPageForDuplicateLead();
	}
}
