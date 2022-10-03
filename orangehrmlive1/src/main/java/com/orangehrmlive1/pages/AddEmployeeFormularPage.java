package com.orangehrmlive1.pages;

import java.util.logging.Level;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AddEmployeeFormularPage extends BasePage{
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	WebElement addEmployeeMessage;
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstnameInput;
	@FindBy(xpath="//input[@name='middleName']")
	WebElement middlenameInput;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastnameInput;
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;
	
	public AddEmployeeFormularPage() {
		PageFactory.initElements(driver, this);
		logger.log(Level.INFO,"an instance of AddEmployeeFormularPage is created");
		
	}
	public EmployeeProfilePage addNewemployeeWithSuccess(String firstname, String lastname) {
		fillInput(firstnameInput, firstname);
		fillInput(lastnameInput, lastname);
		clickOn(saveButton);
		return new EmployeeProfilePage();
	}
	public boolean addEmployeeMessageIsDisplayed() {
		return isDispayed(addEmployeeMessage);
	}
	

}
