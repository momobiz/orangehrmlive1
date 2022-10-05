package com.orangehrmlive1.pages;

import java.util.logging.Level;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameInput;
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordInput;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement invalidCredentialMessage;

	public LoginPage() {
		PageFactory.initElements(driver, this);
		logger.log(Level.INFO,"an instance of LoginPage is created");
		
	}
	public HomePage loginSuccess(String username, String password) {
		fillInput(usernameInput, username);
		fillInput(passwordInput, password);
		clickOn(loginButton);
		return new HomePage();
	
		
	}
	public void loginFail(String username, String password) {
		fillInput(usernameInput, username);
		fillInput(passwordInput, password);
		clickOn(loginButton);
		
	}
	
	public String getWarningMessage() {
		String warningMessage="No message";
		try {
			if(isDispayed(invalidCredentialMessage)) {
				warningMessage=invalidCredentialMessage.getAttribute("innerHTML");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return warningMessage;
		
	
	}

	

}
