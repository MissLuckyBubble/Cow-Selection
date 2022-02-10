package uni.fmi.search;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty","html:target/search-feature"})
//@CucumberOptions(monochrome = true, plugin = {"pretty","json:target/search-feature.json"})
public class SearchStarter {

	
}
