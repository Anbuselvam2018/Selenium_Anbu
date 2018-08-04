package week6.day2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wd.Annotations;


public class viewLeadPageForDuplicateLead extends Annotations {
	
	public viewLeadPageForDuplicateLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Duplicate Lead']")
	WebElement eleDuplicateLead;
	
	

	public createLeadPageForDuplicateLead clickDuplicateLead()
	{
		click(eleDuplicateLead);
		return new createLeadPageForDuplicateLead();
	}
	
	
	
}
