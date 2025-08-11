package com.msi.msisurfaces.application.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
		glue={"com.msi.msisurfaces.application.stepDefinations","com.msi.msisurfaces.framework.base"},
		plugin= {"pretty","html:Reports/AutomationTestResults.html"}
//		tags="@Regression or @Sanity"
	)

public class TestRunnerE2E {

}
