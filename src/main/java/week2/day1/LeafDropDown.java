package week2.day1;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LeafDropDown {

	public static void main(String[] args) {
		
		// WAP to select the last but one option in any of the dropdown
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		Select listBox1 = new Select(driver.findElementByXPath("//*[@id=\"dropdown1\"]"));
		    int listOptions1 = listBox1.getOptions().size();
		    listBox1.selectByIndex(listOptions1 - 1);
		    
		 //How to verify if the given check is checked or not 
		    
			ChromeDriver checkbox = new ChromeDriver();
			checkbox.get("http://www.leafground.com/pages/checkbox.html");			
		    WebElement checkboxchecked	= checkbox.findElementByXPath(" //*[@id=\"contentblock\"]/section/div[2]/input");		 	    		
		    System.out.println(" selection state of \"Confirm Selenium checkbox\"   - " + 
		    ((WebElement) checkboxchecked).isSelected());
	    
	}

}
