package com.orangehrmlive1.steps;

import com.orangehrmlive1.pages.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks{
	
	@Before
	public void lauchBeforeScenario() {
		BasePage.launchBrowser();
		
	}
	@After
	public void launchAfterScenario() {
//		BasePage.closeWindow();
		
	}

}
