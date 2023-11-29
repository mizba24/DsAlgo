package pageObjects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import driverFactory.DriverFactory;
import runner.TestRunner;

public class HomePage extends DriverFactory {
	//Webgetdriver() getdriver()=new Chromegetdriver()();
	public void open_dsalgo_portal() {
		getdriver().get("https://dsportalapp.herokuapp.com/");
	}
	public void get_start_click() {
		WebElement getstart=getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
		getstart.click();
	}
	public void sign_in_click_link() throws Exception {
		getdriver().get("https://dsportalapp.herokuapp.com/");
		getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
			WebElement signin=getdriver().findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]"));
			signin.click();
		TakesScreenshot screenshot=(TakesScreenshot) getdriver();
		File source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\mizba\\New_dsalgo\\Screenshots\\signin_page.png");
			FileHandler.copy(source,destination);
}
			public void drop_down_click(String menu) throws Exception {
				getdriver().get("https://dsportalapp.herokuapp.com/");
				getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
			WebElement dpdw1=getdriver().findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a"));
		    	dpdw1.click();
			TakesScreenshot screenshot=(TakesScreenshot) getdriver();
			File source=screenshot.getScreenshotAs(OutputType.FILE);
				File destination=new File("C:\\mizba\\New_dsalgo\\Screenshots\\drop_down_options.png");
				FileHandler.copy(source,destination);
				switch (menu) {
		 		case "Arrays":
		 			WebElement array=getdriver().findElement(By.xpath("//div[@class='dropdown-menu show']"));
		 			array.click();
		 			break;
		 		case "Linkedlist":
		 			WebElement linklist=getdriver().findElement(By.xpath("//*[@id='navbarCollapse']//a[2]"));
		 			linklist.click();
		 		
		 			break;
		 		case "Stack":
		 			WebElement stack=getdriver().findElement(By.xpath("//*[@id='navbarCollapse']//a[3]"));
		 			stack.click();
		 			
		 			break;
		 		case "Queue":
		 			WebElement queue=getdriver().findElement(By.xpath("//*[@id='navbarCollapse']//a[4]"));
		 			queue.click();
		 			
				break;
		 		case "Tree":
		 			WebElement tree=getdriver().findElement(By.xpath("//*[@id='navbarCollapse']//a[5]"));
		 			tree.click();
		 			
		 			break;
		 		case "Graph":
		 			WebElement graph=getdriver().findElement(By.xpath("//*[@id='navbarCollapse']//a[6]"));
		 			graph.click();
		 		
		 			break;
				}
		 		return;
			}
			public void any_get_start() {
				getdriver().get("https://dsportalapp.herokuapp.com/");
				getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
				WebElement anygetstart=getdriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/a"));
				anygetstart.click();
			}
				public void screen_shot_not_logged_in() throws Exception {
					TakesScreenshot screenshot=(TakesScreenshot) getdriver();
					File source=screenshot.getScreenshotAs(OutputType.FILE);
						File destination=new File("C:\\mizba\\New_dsalgo\\Screenshots\\not_loggedin.png");
						FileHandler.copy(source,destination);
				}
				public void register_click_to_register_form() {
					getdriver().get("https://dsportalapp.herokuapp.com/");
					WebElement getstart=getdriver().findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
					getstart.click();
					WebElement register=getdriver().findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[2]"));
					  register.click();
				}
				public void screen_shot_of_register_form() throws Exception {
					TakesScreenshot screenshot=(TakesScreenshot) getdriver();
					File source=screenshot.getScreenshotAs(OutputType.FILE);
						File destination=new File("C:\\mizba\\New_dsalgo\\Screenshots\\registerform.png");
						FileHandler.copy(source,destination);
				}
}
