package Steps;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Hooks  {
	Launchbrowser launch= new Launchbrowser();
	
	@Before
	public void prescenario(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		
		launch.browser();
}
	@After
	public void postscenario(Scenario sc) {
		
		System.out.println(sc.getStatus());
		
		launch.closebrowser();
	}

}
