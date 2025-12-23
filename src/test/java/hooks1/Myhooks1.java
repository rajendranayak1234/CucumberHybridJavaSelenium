package hooks1;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory1.DriverFactory1;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class Myhooks1 {
	
	WebDriver driver;
	
 @Before 
 public void setup()
{
	Properties prop=ConfigReader.initializeProperties();
	DriverFactory1.initializeBrowser(prop.getProperty("browser"));
	driver=DriverFactory1.getDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(prop.getProperty("url"));
	
}
@After
public void tearDown(Scenario Scenario)
{
	String ScenarioName = Scenario.getName().replaceAll("","_");
	byte[] scrScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	Scenario.attach(scrScreenshot, "image/png",ScenarioName );
	
	driver.quit();
}
}
