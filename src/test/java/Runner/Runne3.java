package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\Feauture\\Ajoutproduit.feature",
		glue="com.run",
		plugin= {"pretty","html:target/cucumber-report.html"}		
		)

public class Runne3 {

	
}
