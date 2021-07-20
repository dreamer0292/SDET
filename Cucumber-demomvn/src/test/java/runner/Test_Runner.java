package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Login"},
glue= {"stepDefinition"},
monochrome=true,
dryRun=false,//if dry run=true ,it will not execute the scenario 
strict=true,// it will strictly check I have all the methods covered/defined or I missed in step definition file
plugin= {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
)
public class Test_Runner {

}
