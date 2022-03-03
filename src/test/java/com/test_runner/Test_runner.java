package com.test_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			junit= "--step-notifications",
			plugin = {"json:target/cucumber.json"},
			features="Feature",
			glue={"step_definitions"}
			,tags={"@OrangeHrm"}
			)
	public class Test_runner {

}
