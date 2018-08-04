package testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wd.SeMethods;


public class Annotations  extends SeMethods{
	@BeforeMethod /*(groups= {"smoke","sanity"})*/
	@Parameters({"url","uName","pwd"})
	public void login(String url,String uName,String pwd)
	{
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,uName);
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword,pwd);
		
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCreateLink = locateElement("xpath","//*[@id='label']/a");
		click(eleCreateLink);

	}
	
@AfterMethod/*(groups= {"smoke","sanity"})*/
	public void closeBrowserApp()
	{
		closeBrowser();
	}
	
	
	
	
	
	
	
	
	}