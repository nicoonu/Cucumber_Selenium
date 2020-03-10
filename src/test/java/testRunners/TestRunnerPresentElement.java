package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Nicolas.Onufryjczuk\\Cucumber\\src\\test\\resources\\estanPresentesGoogle.feature", glue = "ElementosPresentes.java")
public class TestRunnerPresentElement {

}
