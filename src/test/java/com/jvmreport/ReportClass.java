package com.jvmreport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {
	
	public static void generateReport(String jsonFile) throws FileNotFoundException, IOException {
		
		

		File file = new File("C:\\Users\\MPT2023163\\eclipse-workspace\\TimeBoundAutomation\\target`");

		Configuration configuration = new Configuration(file, "Time Bound API Automation");

		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("browserversion", "109");
		configuration.addClassifications("OS", "Windows11");

		List<String> JsonFiles = new ArrayList<String>();
		JsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(JsonFiles,configuration);

		builder.generateReports();
		}

	

}


