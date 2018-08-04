package wd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods extends Reporter implements WdMethods{
	public static RemoteWebDriver driver  ;
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
				 driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				 driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//System.out.println("The Browser "+browser+" is Launched Successfully");
			reportStep("The Browser "+browser+" is Launched Successfully", "Pass");
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("The Browser "+browser+" is not Launched Successfully", "Fail");
			throw new RuntimeException();
		}
		finally {
			takeSnap();	
		}
			
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "linkText" : return driver.findElementByLinkText(locValue);
			case "Name": return driver.findElementByName(locValue);
			}
			return null;
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			//System.out.println("The Data "+data+" is Entered Successfully");
			reportStep("The Data "+data+" is Entered Successfully", "Pass");
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("The Data "+data+" is not Entered Successfully", "Fail");
			throw new RuntimeException();
		}
		
		finally {
			takeSnap();	
		}
		
	}

	public void click(WebElement ele) {
	try {
		ele.click();
		//System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The Element "+ele+" is clicked Successfully", "Pass");
	} catch (Exception e) {
		reportStep("The Element "+ele+" is not clicked Successfully", "Fail");
		//System.err.println("Exception has occured");
		throw new RuntimeException();
	}
	
	finally {
		takeSnap();	
	}
			
	}

	public String getText(WebElement ele) {
				
		try {
			return ele.getText();
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		
		try {
			Select dropdown =new Select(ele);
			dropdown.selectByVisibleText(value);
			//System.out.println(value);
			reportStep("The Element "+value+" is selected Successfully", "Pass");
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("The Element "+value+" is not selected Successfully", "Fail");
			throw new RuntimeException();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
	
		try {
			Select dropdownindex= new Select(ele);
			dropdownindex.selectByIndex(index);
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
		
		}

	public void verifyTitle(String expectedTitle) {
		
		try {
			String currenttitle=driver.getTitle();
			if(currenttitle.equals(expectedTitle))
			{
				reportStep("Title has verified successfully", "Pass");
				//System.out.println("Title has verified successfully");
			}
			else
			{
				//System.out.println("Title verification failed");
				reportStep("Title has verified unsuccessfully", "Fail");
			}
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured\"", "Fail");
			throw new RuntimeException();
		}
		
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			String extractedText = ele.getText();
			
			if(expectedText.equals(extractedText)) {
				//System.out.println("Text matched exactly");
				reportStep("Text matched exactly", "Pass");
			}
			else {
				//System.out.println("Text Not Matched");
				reportStep("Text not matched exactly", "Fail");
			}
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
		
		
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		
		try {
			String partialTtext = ele.getText();
			if(expectedText.contains(partialTtext)) 
			{
				//System.out.println("Text contains partially");
				reportStep("Text contains partially", "Pass");
			}
			else
			{
				//System.out.println("Text not contains partially");
				reportStep("Text not contains partially", "Fail");
			}
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
		
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			if(ele.getAttribute(value).contains(attribute))
			{
				//System.out.println("Attribute verified successfully");
				reportStep("Attribute verified successfully", "Pass");
			}
			else
			{
				//System.out.println("Attribute verification is failed");
				reportStep("Attribute verification is failed", "Pass");
			}
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
		finally 
		{
			takeSnap();	
		}
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if(ele.getAttribute(value).contains(attribute))
			{
				//System.out.println("Partial Attribute verified successfully");
				reportStep("Partial Attribute verified successfully", "Pass");
			}
			else
			{
				//System.out.println("Partial Attribute verification is failed");
				reportStep("Partial Attribute verification is unsuccessful", "Fail");
			}
		} catch (Exception e) {
			System.err.println("Exception has occured");
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
		
		finally {
			takeSnap();
		}
			
		 
		
	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected())
			{
				//System.out.println(ele+ "is selected");
				
				reportStep("The Element "+ele+" is selected Successfully", "Pass");
			}
			else
			{
				//System.out.println(ele+ "is not selected");
				
				reportStep("The Element "+ele+" is not selected Successfully", "Fail");
			}
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
				
		finally {
			takeSnap();
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
			{
				//System.out.println(ele+ "is displayed");
				reportStep("The Element "+ele+" is displayed Successfully", "Pass");
			}
			else
			{
				//System.out.println(ele+ "is not displayed");
				reportStep("The Element "+ele+" is not displayed Successfully", "Fail");
			}
		} catch (Exception e) {
			//System.err.println("Exception has occured");
			reportStep("Exception has occured", "Fail");
			throw new RuntimeException();
		}
				
		finally {
			takeSnap();
		}
		
	}

	public void switchToWindow(int index) {
		
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> listAllWindwos = new ArrayList<String>();
			listAllWindwos.addAll(allWindows);
			driver.switchTo().window(listAllWindwos.get(index));
			//System.out.println("Window Switched Successfully");
			reportStep("Window Switched Successfully", "Pass");
		} catch (Exception e) {
			//System.out.println("Window Not Switched Properly");
			reportStep("Window Not Switched Successfully", "Fail");
		
		}
		
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		
	}

	public String getAlertText() {
		return driver.switchTo().alert().getText();
		
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	
	public String getTextFromDropDown(WebElement ele) {

		String text;
		try {
			Select objDD = new Select(ele);	
			text =objDD.getFirstSelectedOption().getText();
			return text;
		} catch (Exception e) {
			//System.err.println("Exception has occurred");
			reportStep("Exception has occurred", "Fail");
			throw new RuntimeException();
		}
		
		

	}
	
	public String getAttribute(WebElement ele) {

		String text;
		try {
			text = ele.getAttribute("value");
			reportStep("The Element \"+text+\" is selected Successfully", "Pass");
			//System.out.println(text);
			return text;
		} catch (Exception e) {
			//System.err.println("Exception has occurred");
			reportStep("Exception has occurred", "Fail");
			throw new RuntimeException();
		}

	}

	
	public void moveToElement(WebElement ele1,WebElement ele2) {

		 Actions builder = new Actions(driver);
		 builder.moveToElement(ele1).pause(3000).click(ele2).perform();
		

	}

	@Override
	public void mouseHoverAndClick(WebElement ele1, WebElement ele2) {
		// TODO Auto-generated method stub
		
	}
	
}
