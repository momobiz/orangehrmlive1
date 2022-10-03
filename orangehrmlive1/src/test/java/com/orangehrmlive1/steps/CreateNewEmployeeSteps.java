package com.orangehrmlive1.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewEmployeeSteps extends BaseSteps {
	
	
	
	@When("User clicks on add Employee")
	public void user_clicks_on_add_Employee() {
		addEmployeeFormularPage= homePage.addEmployee();
	}

	@And("User should be directed to formular page to add new employee")
	public void user_should_be_directed_to_formular_page_to_add_new_employee() {
	    Assert.assertTrue(addEmployeeFormularPage.addEmployeeMessageIsDisplayed());
	}

	@And("User enters firstname as {string} and lastname as {string} of a new employee and click on save button")
	public void user_enters_firstname_and_lastname_of_a_new_employee_and_click_on_save_button(String firstname, String lastname) {
		employeeProfilePage=addEmployeeFormularPage.addNewemployeeWithSuccess(firstname, lastname);
	}

	@Then("User should be navigated to profile")
	public void user_should_be_navigated_to_profile() {
		Assert.assertTrue(employeeProfilePage.profileNameIsDisplayed());
		
	   
	}
	
	

}
