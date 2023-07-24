package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features"},
        glue = {"stepDefinition"},
        plugin = {"json:target/cucumber/cucumber.json",
                "pretty"},
        publish = true,
        tags = "@Smoke")

public class Run extends TestNGCucumber{


}
