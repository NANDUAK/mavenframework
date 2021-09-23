package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class posibolt_common_scenario {
	WebDriver d;
	public posibolt_common_scenario (WebDriver d) 
	{
		this.d=d;
	}
	@FindBy(how=How.ID,using="userPIN")
	private WebElement pincodefield;

	@FindBy(how=How.ID,using="newbutton")
	private WebElement enterkey;

	//methods

	public void setpincodefield(String arg)
	{
		pincodefield.sendKeys(arg);
		Reporter.log("password entered" +arg ,true);
	}
	public void setpin()

	{
		enterkey.click();
		Reporter.log("click login" ,true);

	} 
	

	//business method
	public void posiboltentry(String arg)
	{
		setpincodefield(arg);
		setpin();
		String actual=d.getTitle();
		String expected="ak | POSibolt ERP";
		Assert.assertEquals(actual, expected, "not able to LOGIN");
		
		Reporter.log("entered to posibolt" , true);

		
		
	}}










