package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sel_Step_Definition {
	


	public static WebDriver driver;
	
	
	@Given("^Launch the project \\(http://localhost:(\\d+)/Project_(\\d+)_J/\\) in chrome browser$")
	public void launch_the_project_http_localhost_Project_01_SK_in_chrome_browser(int arg1, int arg2) throws Throwable {
		
			
		System.setProperty("webdriver.chrome.driver",
				"C://Users//satishk2005//Desktop//Projct_01_CucumberSelenium//src//main//resources//drivers//chromedriver.exe");
		
		driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("http://localhost:8082/Project_01_SK/");
      
        //Set the Script Timeout to 20 seconds		
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
       
       System.out.println("Home page of application is opened.");
          
	}
	
	@Given("^click on seller hyperlink$")
	public void click_on_seller_hyperlink() throws Throwable {
		
		driver.findElement(By.linkText("Seller")).click();
		System.out.println("Login page of the application is opened.");
	}

	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("username")).sendKeys("seller");
		driver.findElement(By.name("userpass")).sendKeys("seller");
		driver.findElement(By.id("loginprocess_0")).click();
		
		}

	@Then("^click on login button and login should be successful$")
	public void click_on_login_button_and_login_should_be_successful() throws Throwable {
		System.out.println("The user should be navigated to seller page");
		  //Set the Script Timeout to 20 seconds		
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        System.out.println("The seller logged in successfully");
	}
	
	@Given("^click on the Add Products link$")
	public void click_on_the_Add_Products_link() throws Throwable {
		//driver.findElement(By.linkText("Add Product")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'Add Product')]")).click();	
		System.out.println("The user should be navigate to add product page");
		
	}

	@When("^I enter the value for the given fields\\(item, model, display\\)$")
	public void i_enter_the_value_for_the_given_fields_item_model_display() throws Throwable {
		driver.findElement(By.id("RegisterProduct")).sendKeys("Tv");
		driver.findElement(By.id("RegisterProduct_item_model")).sendKeys("Tv");
		driver.findElement(By.id("RegisterProduct_item_display")).sendKeys("Yes");
	}

	@When("^click on register button and entered details should be added to the database$")
	public void click_on_register_button_and_entered_details_should_be_added_to_the_database() throws Throwable {
		driver.findElement(By.id("RegisterProduct_2")).click();
		driver.findElement(By.className("button-report")).click();;
	}

	@Then("^click on go to the seller home page button$")
	public void click_on_go_to_the_seller_home_page_button() throws Throwable {
		driver.findElement(By.id("RegisterProduct_2")).click();
	    
	}

	@Then("^check the seller should be navigated to seller home page$")
	public void check_the_seller_should_be_navigated_to_seller_home_page() throws Throwable {
	    System.out.println("The user should be navigate to seller hoem page");
	    
	}

	@Given("^from seller home page click on the view auction report link$")
	public void from_seller_home_page_click_on_the_view_auction_report_link() throws Throwable {
	    driver.findElement(By.linkText("View Product List ")).click();
	    
	}

	@Given("^Seller should be able view bidder details$")
	public void seller_should_be_able_view_bidder_details() throws Throwable {
	  System.out.println("The seller should be able to view bidder details");
	}

	@Then("^clik on winner button and able to view winner details$")
	public void clik_on_winner_button_and_able_to_view_winner_details() throws Throwable {
	   driver.findElement(By.className("button-report")).click();
	}

	@Then("^click on seller home page$")
	public void click_on_seller_home_page() throws Throwable {
	   driver.findElement(By.linkText("Seller Home"));
	   
	}

	@Given("^from seller home page click on the view product list link$")
	public void from_seller_home_page_click_on_the_view_product_list_link() throws Throwable {
		 driver.findElement(By.linkText("View Product List ")).click();
	  
	}

	@Given("^Seller should be able view product details$")
	public void seller_should_be_able_view_product_details() throws Throwable {
		 System.out.println("The seller should be able to view product details");
	}

	@Then("^click on seller home link$")
	public void click_on_seller_home_link() throws Throwable {
	driver.findElement(By.linkText("Seller Home"));
	}

	@Then("^click on logout link$")
	public void click_on_logout_link() throws Throwable {
	   driver.findElement(By.linkText("Logout")).click();
	}
	

}
