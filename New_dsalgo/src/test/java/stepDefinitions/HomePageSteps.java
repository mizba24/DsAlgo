package stepDefinitions;


import java.io.File;

import pageObjects.HomePage;
import runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends TestRunner{
	//WebDriver driver=new ChromeDriver();
	HomePage hp=new HomePage();
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		hp.open_dsalgo_portal();
	 //   driver.get("https://dsportalapp.herokuapp.com/");
	}
	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
					hp.get_start_click();
//		WebElement getstart=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
//		getstart.click();
	}
	
	@Then("The user should be redirected to homepage and verify the title")
	public void the_user_should_be_redirected_to_homepage_and_verify_the_title() {
	    System.out.println("Output-----The user should see 6 panes with different data structires");
	}

@Given("user click on the sign in link")
	public void user_click_on_the_sign_in_link() throws Exception {
				hp.sign_in_click_link();
	
	//	driver.get("https://dsportalapp.herokuapp.com/");
//	driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
//		WebElement signin=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]"));
//		signin.click();
//	TakesScreenshot screenshot=(TakesScreenshot) driver;
//	File source=screenshot.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\signin_page.png");
//		FileHandler.copy(source,destination);
	}

	@Then("user redirected to login page")
	public void user_redirected_to_login_page() {

	}

	@When("user clicks on dropdown {string}")
public void user_clicks_on_dropdown(String menu) throws Exception {
				hp.drop_down_click(menu);
		//		driver.get("https://dsportalapp.herokuapp.com/");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
//	WebElement dpdw1=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a"));
//    	dpdw1.click();
//	TakesScreenshot screenshot=(TakesScreenshot) driver;
//	File source=screenshot.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\drop_down_options.png");
//		FileHandler.copy(source,destination);
//		switch (menu) {
// 		case "Arrays":
// 			WebElement array=driver.findElement(By.xpath("//div[@class='dropdown-menu show']"));
// 			array.click();
// 		
// 			break;
// 		case "Linkedlist":
// 			WebElement linklist=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[2]"));
// 			linklist.click();
// 		
// 			break;
// 		case "Stack":
// 			WebElement stack=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[3]"));
// 			stack.click();
// 			
// 			break;
// 		case "Queue":
// 			WebElement queue=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[4]"));
// 			queue.click();
// 			
//		break;
// 		case "Tree":
// 			WebElement tree=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[5]"));
// 			tree.click();
// 			
// 			break;
// 		case "Graph":
// 			WebElement graph=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[6]"));
// 			graph.click();
// 		
// 			break;
//		}
// 		return;
	}
	@Then("alert the user with a message You are not logged in")
	public void alert_the_user_with_a_message_you_are_not_logged_in() {
	System.out.println("OUTPUT---you are not logged in");
	 
}
	@When("The user clicks any of the Get Started buttons below the data structures")
	public void the_user_clicks_any_of_the_get_started_buttons_below_the_data_structures() {
			hp.any_get_start();
		//		driver.get("https://dsportalapp.herokuapp.com/");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
//		WebElement anygetstart=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/a"));
//		anygetstart.click();
	}

	@Then("the user with a message You are not logged in")
	public void the_user_with_a_message_you_are_not_logged_in() throws Exception {
		System.out.println("you are not logged in");
		  hp.screen_shot_not_logged_in();
//		TakesScreenshot screenshot=(TakesScreenshot) driver;
//		File source=screenshot.getScreenshotAs(OutputType.FILE);
//			File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\not_loggedin.png");
//			FileHandler.copy(source,destination);
	}

@When("The user clicks Register")
public void the_user_clicks_register() {
				 hp.register_click_to_register_form();
//	driver.get("https://dsportalapp.herokuapp.com/");
//	WebElement getstart=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
//	getstart.click();
//	WebElement register=driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[2]"));
//	  register.click();
}

@Then("The user should be redirected to Register form")
public void the_user_should_be_redirected_to_register_form() throws Exception {
			hp.screen_shot_of_register_form();
	//	TakesScreenshot screenshot=(TakesScreenshot) driver;
//	File source=screenshot.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\registerform.png");
//		FileHandler.copy(source,destination);
}

	}


