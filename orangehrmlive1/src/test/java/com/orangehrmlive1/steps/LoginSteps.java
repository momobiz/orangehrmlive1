package com.orangehrmlive1.steps;

import org.junit.Assert;

import com.orangehrmlive1.pages.BasePage;
import com.orangehrmlive1.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseSteps {
	
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		loginPage=new LoginPage();
		
		
	    
	}

	@When("User enters valid username as {string} and password as {string} and clicks on login button")
	public void user_enters_valid_username_and_password_and_clicks_on_login_button(String username, String password) {
	  
		homePage=loginPage.loginSuccess(username,password);
	   
	}

	@Then("User should be navigated to Home page")
	public void user_should_be_navigated_to_Home_page() {
		Assert.assertTrue(homePage.pimIsDisplayed());
	   
	}

}
