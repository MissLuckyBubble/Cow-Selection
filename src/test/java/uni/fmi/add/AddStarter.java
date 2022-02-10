package uni.fmi.add;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Стартер класа е задължителен за работа с тази рамка,
 * той показва в коя основна папка се намират нашите Featurе-и
 * и в кой пакет ще са стъпките
 * 
 *
 * В "RunWith" се добавя Cucumber.class, защотото така показваме,
 * че стандартния начин на работа на "jUnit" ще е заместен от 
 * "runer"-a на тестове "Cucumber"
 * 
 * @author MissLuckyBubble
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty","html:target/add-feature"})
//@CucumberOptions(monochrome = true, plugin = {"pretty","json:target/add-feature.json"})
public class AddStarter {

}