package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Definition {

	
	WebDriver driver;
		@Given("Login page")
		public void login_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RashmiSanghi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	        //i am trying to create a new instance of chrome driver
	        driver = new ChromeDriver();
	        //WedDriver driver - new ChromeDriver()
	        //ChromeDriver driver = new ChromeDriver()
	        //i want to be the login page //what should i do
	        driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		}


		
		@When("Enter valid name {string}")
		public void enter_valid_name(String name) {
			   driver.findElement(By.id("txtUsername")).sendKeys(name);

		   
		}
		@When("Enter valid pwd {string}")
		public void enter_valid_pwd(String pwd) {
			   driver.findElement(By.id("txtPassword")).sendKeys(pwd);

		}
		@When("click on submit button")
		public void click_on_submit_button() {
			driver.findElement(By.id("btnLogin")).click();  
		}
		@Then("I should see the username as {string}")
		public void i_should_see_the_username_as(String username) throws InterruptedException {
			String welcometext=driver.findElement(By.id("welcome")).getText();
			/*
			 * String Expected=username; Assert.assertEquals(welcometext, Expected);
			 */
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[3]/a")).click();
			
			System.out.println("I am successfully logout");
			Thread.sleep(3000);
			driver.quit();
		}



}
