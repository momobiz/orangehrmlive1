package com.orangehrmlive1.pages;

import java.util.logging.Level;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmployeeProfilePage extends BasePage{
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 --strong']")
	WebElement profileName;
	
	
	public EmployeeProfilePage(){
		PageFactory.initElements(driver, this);
		logger.log(Level.INFO,"An instance of EmployeeProfilePage is created");
	}
	
	public boolean profileNameIsDisplayed() {
		return isDispayed(profileName);
		
	}
	
	

}
	

