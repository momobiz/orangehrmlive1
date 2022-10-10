package com.orangehrmlive1.steps;

import java.lang.reflect.Method;
import java.util.ArrayList;

import com.orangehrmlive1.pages.BasePage;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks{
	
	@Before
	public void lauchBeforeScenario(Scenario scenario) throws ATUTestRecorderException  {
		BasePage.scenario=scenario;
		BasePage.startVideoRecording(BasePage.scenario.getName()+"_"+BasePage.scenario.getLine());
		BasePage.launchBrowser();
		
		
	}
	@After
	public void launchAfterScenario() throws ATUTestRecorderException {
//		BasePage.closeWindow();
		BasePage.stopVideoRecording();
		
	}

}
