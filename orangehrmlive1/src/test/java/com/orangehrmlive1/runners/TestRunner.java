package com.orangehrmlive1.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/ressources/features",
				glue="",
				plugin= {"pretty", "html:target/reports/htmlreport.html"})
				

public class TestRunner {

}
