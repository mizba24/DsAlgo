package pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import runner.TestRunner;

public class RegistrationPage extends DriverFactory {
	//WebDriver driver=new ChromeDriver();
	String expectedTooltip="Please fill out this field";
	public void open_ds_algo() {
		
	    getdriver().get("https://dsportalapp.herokuapp.com/");
	}
	public void click_getstart() {
		WebElement getstart=getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
		getstart.click();
	}
	public String gettitle()
	{
		String title=getdriver().getTitle();
		return title;
	}
	public void register() {
	WebElement register=getdriver().findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[2]"));
  register.click();
	}
	public void click_empty_regiterform() throws IOException {
		//Actions actions=new Actions(getdriver());
		WebElement register1=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
		 
	    register1.click();
//	    WebElement activeElement = getdriver().switchTo().activeElement();
//	    String messageStr = activeElement.getAttribute("validationMessage");
//	    System.out.println("Actual message appeared on screen: " + messageStr);
	    TakesScreenshot screenshot=(TakesScreenshot) getdriver();
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\mizba\\New_dsalgo\\Screenshots\\empty_register_form.png");
		FileHandler.copy(source,destination);
	}
	public void user_in_registerpage() {
		getdriver().get("https://dsportalapp.herokuapp.com/");
		WebElement getstart=getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
		getstart.click();
		WebElement register=getdriver().findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[2]"));
		  register.click();
	}
	public void click_registerlink_with_username_otherfield_empty(String name) throws Exception {
		WebElement usname=getdriver().findElement(By.xpath("//*[@id=\"id_username\"]"));
		usname.sendKeys(name);
		WebElement register2=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
		register2.click();
		WebElement activeElement = getdriver().switchTo().activeElement();
	    String messageStr = activeElement.getAttribute("validationMessage");
	    System.out.println("Actual message appeared on screen: " + messageStr);
		TakesScreenshot screenshot=(TakesScreenshot) getdriver();
		
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\mizba\\New_dsalgo\\Screenshots\\please_fill_out.png");
		FileHandler.copy(source,destination);
	}
	public void click_with_username_password(DataTable dataTable ) {
		List<List<String>> credentials=dataTable.cells();
			   WebElement username1=getdriver().findElement(By.xpath("//*[@id=\"id_username\"]"));
			username1.sendKeys(credentials.get(0).get(0));
		   WebElement passwrd1=getdriver().findElement(By.xpath("//*[@id=\"id_password1\"]"));
		    passwrd1.sendKeys(credentials.get(0).get(1));
		    WebElement regis=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
		    regis.click();
		    WebElement activeElement = getdriver().switchTo().activeElement();
		    String messageStr = activeElement.getAttribute("validationMessage");
		    System.out.println("Actual message appeared on screen: " + messageStr);
		    username1.clear();
		    passwrd1.clear();
			}
	public void click_register_with_different_password_in_confirmationfield(DataTable dataTable) throws Exception {
		List<List<String>> credentials=dataTable.cells();
		WebElement username2=getdriver().findElement(By.xpath("//*[@id=\"id_username\"]"));
			username2.sendKeys(credentials.get(0).get(0));
		   WebElement passwrd2=getdriver().findElement(By.xpath("//*[@id=\"id_password1\"]"));
		    passwrd2.sendKeys(credentials.get(0).get(1));
		    WebElement pasconfrm=getdriver().findElement(By.xpath("//*[@id=\"id_password2\"]"));
		    pasconfrm.sendKeys(credentials.get(0).get(2));
		    WebElement register3=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
		    register3.click();
		    WebElement activeElement = getdriver().switchTo().activeElement();
		    String messageStr = activeElement.getAttribute("validationMessage");
		    System.out.println("Actual message appeared on screen: " + messageStr);
		    TakesScreenshot screenshot=(TakesScreenshot) getdriver();
			
			File source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\mizba\\New_dsalgo\\Screenshots\\password_mismatch.png");
			FileHandler.copy(source,destination);
	}
	public void error_message() {
		WebElement errormsg=getdriver().findElement(By.xpath("/html/body/div[3]"));
		errormsg.getText();
		System.out.println("+errormsg" );
	}
	public void user_enter_password_less_than_eight_character()
	{
		  WebElement uname1=getdriver().findElement(By.xpath("//*[@id=\"id_username\"]"));
		    uname1.sendKeys("bitbuddies");
			WebElement pwrd=getdriver().findElement(By.xpath("//*[@id=\"id_password1\"]"));
			pwrd.sendKeys("budd");
			  WebElement pconfrm=getdriver().findElement(By.xpath("//*[@id=\"id_password2\"]"));
			    pconfrm.sendKeys("budd");
			    WebElement regis=getdriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
			    regis.click();
	}
	
}
