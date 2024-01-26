package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=
"C:\\Users\\Dharti Patel\\eclipse-workspace\\cucumber\\src\\test\\resources\\Feature",
glue= {"Stepdefinations"},
monochrome=true,
tags= "@Reg",
plugin= {"pretty", "html:target/HtmlReports.html",
		"json:target/Json/report.json",
		"junit:target/Junit/report.xml",
	

})
public class Testrunner {}
