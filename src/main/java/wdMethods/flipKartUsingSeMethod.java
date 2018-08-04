package wdMethods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wd.SeMethods;


public class flipKartUsingSeMethod extends SeMethods{

	@Test
	public void FlipkartTest() throws InterruptedException {
		//Lauch the chrome browser  and open Flipkart website

		startApp("Chrome", "https://www.flipkart.com/");

		// Close the login popup
		WebElement eleCloseX=locateElement("xpath","//button[text()='✕']");
		click(eleCloseX);

		//Mouse over to TVs & Appliances
		WebElement eleTVsAppliance = locateElement("xpath","//span[text()='TVs & Appliances']");

		//Click on Samsung product

		WebElement eleSamsung = locateElement("xpath","(//span[text() ='Samsung'])[2]");
		moveToElement(eleTVsAppliance, eleSamsung);
		Thread.sleep(3000);

		//In Price filter, select min price to 25000
		WebElement minPrice = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingText(minPrice, "₹25000");

		//In Price filter, select min price to 60000
		WebElement maxPrice = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingText(maxPrice, "₹60000");

		Thread.sleep(5000);

		//Click on Screen size filter		

		WebElement eleScreesize =locateElement("xpath","//div[text()='Screen Size']");
		click(eleScreesize);	
		Thread.sleep(10000);

		//click on 48 - 55 size box

		WebElement elecheckbox =locateElement("xpath","//div[text()='48 - 55']");
		click(elecheckbox);
		Thread.sleep(3000);

		WebElement eleSwitchFirstProduct = locateElement("xpath","//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");
		click(eleSwitchFirstProduct);
		Thread.sleep(3000);			

		//Switch to New window 
		switchToWindow(1);
		Thread.sleep(5000);

		//Click on compare check box 
		WebElement eleCompare1=locateElement("xpath","//span[text()='Compare']");
		click(eleCompare1);

		//Close the window
		closeBrowser();

		//Switch back to parent window  & Click on the second product 
		switchToWindow(0);

		WebElement eleSwitchSecondProduct = locateElement("xpath","//div[text()='Samsung Series 5 123cm (49 inch) Full HD LED TV']");
		click(eleSwitchSecondProduct);
		Thread.sleep(3000);

		//Switch to New window 
		switchToWindow(1);
		Thread.sleep(5000);

		//Click on compare check box 
		WebElement eleCompare2=locateElement("xpath","//span[text()='Compare']");
		click(eleCompare2);
		Thread.sleep(3000);

		//Close the window
		closeBrowser();

		//Switch back to parent window  & Click on the second product 
		switchToWindow(0);
		
		//Click on compare button
		
		WebElement eleCompareClick = locateElement("xpath","//span[text()='COMPARE']");
		click(eleCompareClick);

		
	   String price1,price2;

	   //WebElement eleprice1=locateElement("xpath","//div[text()='₹54,999']");
	   WebElement eleprice1=locateElement("xpath","//*[@id=/'fk-compare-page/']/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]");
	   WebElement eleprice2=locateElement("xpath","//*[@id=/'fk-compare-page/']/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/div/div[1]");
	   
	   
		
	   WebElement eleBuy1=locateElement("xpath","//*[@id=/'fk-compare-page/']/div/div/div/div[2]/div[1]/div[4]/div[2]/div/form/button"); 
	   WebElement eleBuy2=locateElement("xpath","//*[@id=/'fk-compare-page/']/div/div/div/div[2]/div[1]/div[4]/div[3]/div/form/button");
	  
	   //WebElement eleprice2=locateElement("xpath","//div[text()='₹44,999'] ");
	    price1=getText(eleprice1);
		price2=getText(eleprice2);
		price1=price1.substring(1).replace(",","");
		price2=price1.substring(1).replace(",","");
		
		int firstProdPrice=Integer.parseInt(price1);
		int secondProdPrice=Integer.parseInt(price2);
		
		if(firstProdPrice>secondProdPrice) {
			click(eleBuy2);
		}
		else
		{
			click(eleBuy1);
		}
		}

	}

