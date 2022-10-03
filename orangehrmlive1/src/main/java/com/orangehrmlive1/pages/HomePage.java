package com.orangehrmlive1.pages;

import java.util.logging.Level;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BasePage{
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	WebElement pim;
	@FindBy(xpath="//a[contains(text(),'Add Employee')]")
	WebElement addEmployeeButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		logger.log(Level.INFO,"an instance of HomePage is created");
		
	}
	public AddEmployeeFormularPage addEmployee() {
    	clickOn(addEmployeeButton);
    	return new AddEmployeeFormularPage();
    }
    public boolean pimIsDisplayed() {
    	return isDispayed(pim);
    }
	
    

}
