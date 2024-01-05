package com.testrunner;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClassAPI;
import com.jvmreport.ReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags = (""),features="src\\test\\resources\\Features", glue={"com.stepdefinition"},monochrome=true,
plugin= { "json:target\\jsonReports\\cucumber-report.json","pretty"},dryRun=false)
public class TestRunner extends BaseClassAPI {

@AfterClass
public static void afterClass()throws FileNotFoundException,IOException{
	ReportClass.generateReport(getProjectPath() +getPropertyFileValue("jsonPath"));
	System.out.println("done");

}


}

 

