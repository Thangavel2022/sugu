package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	public WebDriver driver;
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
		WebElement txtEmail=driver.findElement(By.id("email"));
		txtEmail.sendKeys("thanagvel");
	   
		WebElement txtPass=driver.findElement(By.id("pass"));
		txtPass.sendKeys("9944499700");
	}

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
		WebElement logInBtn=driver.findElement(By.name("login"));
		logInBtn.click();
		Thread.sleep(5000);
	  
	}

	@Then("User must be in invalid credentials page")
	public void user_must_be_in_invalid_credentials_page() {
		String Url=driver.getCurrentUrl();
		Assert.assertTrue("Check the Url", Url.contains("privacy_mutation_token"));
	    
	}

}
