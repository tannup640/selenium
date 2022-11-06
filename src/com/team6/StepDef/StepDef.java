package com.team6.StepDef;


import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.inject.Key;
import com.team6.Utility.PropertiesFileReader;

import org.openqa.selenium.WebElement;

import antlr.collections.List;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {
	public static WebDriver driver;
	PropertiesFileReader obj= new PropertiesFileReader();  
    
	@Given("^opening chrome and store$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
	  
		Properties properties=obj.getProperty();   
		 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();			
		//driver.get(properties.getProperty("browser.baseURL"));
		driver.get("https://demoqa.com/");
	
		Thread.sleep(3000);	 	   
	}

	@When("^open the website$")
	public void get_title() throws Throwable 
	{
		 driver.getTitle();
		 
  	
	}

	@Then("^validate title$")
	public void validate_samsung() throws Throwable 
	{
		String expectedtitle = "ToolsQA";
	  	String actualtitle= driver.getTitle();
	  	
	  	Assert.assertEquals(" UI Test automation  play ground page is not available", expectedtitle, actualtitle);

  	
	}
	
	@Given("^open Book Store application$")
	public void click_open_Book_Store_application() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")).click();
	}

	@When("^Book Store application$")
	public void open_Book_Store_application() throws Throwable 
	{
		 driver.getTitle();
	
	}

	@Then("^validate and check git pocket guide$")
	public void validate_and_check_git_pocket_guide() throws Throwable 
	{
		String expectedtitle = "ToolsQA";
	  	String actualtitle= driver.getTitle();
	  	
	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
//	  	driver.navigate().back();
	}
	
	@Given("^open element option$")
	public void click_open_element_option() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")).click();
	}

	@When("^left click on element option$")
	public void open_left_click_on_element_option() throws Throwable 
	{
		 driver.getTitle();
	
	}

	@Then("^validate to element and dropdown appears$")
	public void validate_to_element_and_dropdown_appears() throws Throwable 
	{
		String expectedtitle = "ToolsQA";
	  	String actualtitle= driver.getTitle();
	  	
	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
//	  	driver.navigate().back();
	}


	
	@Given("^open text box$")
	public void click_filling_details() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
	}

	@When("^left click on text box$")
	public void open_inside_text_box() throws Throwable 
	{
		 driver.getTitle();
	
	}

	@Then("^validate to text box option$")
	public void validate_to_anathor_page_after_clicking_submit() throws Throwable 
	{
		String expectedtitle = "ToolsQA";
	  	String actualtitle= driver.getTitle();
	  	
	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
 	driver.navigate().back();
	}
	
	
    @Given("^open check box$")
	public void click_open_check_box() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
	}

	@When("^left click on check box$")
	public void open_left_click_on_check_box() throws Throwable 
	{
		 driver.getTitle();
	
	}

	@Then("^validate to check box option$")
	public void validate_to_check_box_option() throws Throwable 
	{
		String expectedtitle = "ToolsQA";
	  	String actualtitle= driver.getTitle();	  	
	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
	}
    @Given("^click on logo$")
	public void click_logo() throws Throwable 
	{
	  
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
	}

	@When("^navigate to homepage$")
	public void open_homepage() throws Throwable 
	{
		 driver.getTitle();
	
	}

	@Then("^validate homepage$")
	public void validate_homepage() throws Throwable 
	{
		String expectedtitle = "ToolsQA";
	  	String actualtitle= driver.getTitle();	  	
	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
	  	driver.navigate().back();
	}	

	
//    @Given("^open button$")
//	public void click_open_button() throws Throwable 
//	{
//	 
//		driver.findElement(By.xpath("//*[@id=\"item-4\"]/span")).click();
//
//	}
//
//	@When("^left click on button$")
//	public void open_left_click_on_button() throws Throwable 
//	{
//		 driver.getTitle();
//	
//	}
//
//	@Then("^validate to button page$")
//	public void validate_to_button_page() throws Throwable 
//	{
//		String expectedtitle = "ToolsQA";
//	  	String actualtitle= driver.getTitle();
//	  	
//	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
// 	driver.navigate().back();
//	}
	
//    @Given("^open forms page$")
//	public void click_open_forms_page() throws Throwable 
//	{
//    	 
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div")).click();
//		
//	}
//
//	@When("^left click on form option$")
//	public void open_left_click_on_form_option() throws Throwable 
//	{
//		 driver.getTitle();
//	
//	}
//
//	@Then("^validate to page inside form$")
//	public void validate_to_page_inside_form() throws Throwable 
//	{
//		String expectedtitle = "ToolsQA";
//	  	String actualtitle= driver.getTitle();
//	  	
//	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
// 	driver.navigate().back();
//	}
	
//	  @Given("^ open alter$")
//		public void click_open_alter() throws Throwable 
//		{
//	    	 
//			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")).click();
//			
//		}
//
//		@When("^left click on alter$")
//		public void open_left_click_on_alter() throws Throwable 
//		{
//			 driver.getTitle();
//		
//		}
//
//		@Then("^validate to a dropdown$")
//		public void validate_to_a_dropdown() throws Throwable 
//		{
//			String expectedtitle = "ToolsQA";
//		  	String actualtitle= driver.getTitle();
//		  	
//		  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
//	 	driver.navigate().back();
//		}
	
//    @Given("^open widgets$")
//	public void click_open_widgets() throws Throwable 
//	{
//    	 
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div")).click();
//		
//	}
//
//	@When("^left click on widgets$")
//	public void open_left_click_on_widgets() throws Throwable 
//	{
//		 driver.getTitle();
//	
//	}
//
//	@Then("^validate to widgets page$")
//	public void validate_to_widgets_page() throws Throwable 
//	{
//		String expectedtitle = "ToolsQA";
//	  	String actualtitle= driver.getTitle();
//	  	
//	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
// 	driver.navigate().back();
//	}
//	
//    @Given("^open interactions$")
//	public void click_open_interactions() throws Throwable 
//	{
//    	 
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div/div[1]")).click();
//		
//	}
//
//	@When("^left click on interactions$")
//	public void open_left_click_on_interactions() throws Throwable 
//	{
//		 driver.getTitle();
//	
//	}
//
//	@Then("^validate to interactions$")
//	public void validate_to_interactions() throws Throwable 
//	{
//		String expectedtitle = "ToolsQA";
//	  	String actualtitle= driver.getTitle();
//	  	
//	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
// 	driver.navigate().back();
//	}
}
