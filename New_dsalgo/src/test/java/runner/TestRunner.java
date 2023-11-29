package runner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import driverFactory.DriverFactory;
import io.cucumber.java.BeforeAll;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;

	@CucumberOptions(plugin = { "pretty","json:target/target/Cucumber.json",
			"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"pretty","html:target/dsAlgoReport.html"}, // reporting purpose
			monochrome = false, // console output
			tags = "", // tags from feature file
			features = { "src/test/resources/features" }, // location of feature files
			glue = { "stepDefinitions","pageObjects","driverFactory","hooks" }) // location of step definition files

	public class TestRunner extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {

			return super.scenarios();
		}
public	static WebDriver driver;
		//@Optional ("firefox")
		private static DriverFactory driverfactory;
		@BeforeTest
	     @Parameters({"browser"})
	    public void defineBrowser( String browser) throws Throwable {
			System.out.println("Browser is"+browser);
			driverfactory = new DriverFactory();
			driver = driverfactory.initializeDrivers(browser);
			LoggerLoad.info("Initializing driver for : "+browser);
		}
	}
	
//			if (browser.equalsIgnoreCase("firefox")) {
//				
//				WebDriverManager.firefoxdriver().setup();
//				driver = new FirefoxDriver();
//
//			} else if (browser.equalsIgnoreCase("chrome")) {
//				
//				WebDriverManager.chromedriver().browserVersion("119.0.6045.123").setup();
//				driver = new ChromeDriver();
//
//			} else if (browser.equalsIgnoreCase("safari")) {
//			
//				WebDriverManager.safaridriver().setup();
//				driver = new SafariDriver();
//
//			} else if (browser.equalsIgnoreCase("edge")) {
//				//Loggerload.info("Testing on Edge");
//				WebDriverManager.edgedriver().setup();
//				driver = new EdgeDriver();
//
//			}
//			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
//
//			driver.manage().window().maximize();
//			
//			driver.get("https://dsportalapp.herokuapp.com/"); 
//			return driver;
//	}
//		public WebDriver getdriver() {
//			if (driver==null) {
//				driver = new FirefoxDriver();
//				return driver;
//			}
//			else {
//				return driver;
//			}
//		}
	