package com.orangehrmlive1.steps;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.orangehrmlive1.utils.ReadDataSheet;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidCredentialsLoginSteps extends BaseSteps{
	
	@When("From excel sheet user enters invalid credentials {int} {int} and {int} {int}")
	public void from_excel_sheet_user_enters_invalid_credentials_userNameColumnNumber_and(int row1, int col1, int row2, int col2) throws InvalidFormatException, IOException {
		String[][] invalidCredentials=ReadDataSheet.readData();
		System.out.println("username : "+invalidCredentials[row1][col1]);
		System.out.println("password : "+invalidCredentials[row2][col2]);
		
		loginPage.loginFail(invalidCredentials[row1][col1], invalidCredentials[row2][col2]);
	
	}

	@Then("User should be stay on the same page and see an error message")
	public void user_should_be_stay_on_the_same_page_and_see_an_error_message() {
	    
	}

	

	

}
