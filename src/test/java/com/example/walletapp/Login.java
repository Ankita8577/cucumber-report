package com.example.walletapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	WebDriver driver = null;
	@Given("open with browser")
	public void open_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Creating an object to access the browser elements
		driver = new ChromeDriver();
		
        driver.get("localhost:3000/");
        driver.manage().window().maximize();
	}
	@And ("go to the signup page")
	public void Login_account()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.className("btn btn-lg btn-primary mr-2")).click(); 
		driver.findElement(By.id("frstname")).sendKeys("Ankita");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("Srivastava"); 
	     Thread.sleep(1000);
	     driver.findElement(By.id("email")).sendKeys("anki11@gmail.com"); 
			driver.findElement(By.id("password")).sendKeys("hellooA1&");
			  Thread.sleep(1000);
		driver.findElement(By.className("btn btn-info btn-block mt-4")).click();
	}
	@And ("go to the login page")
	public void search_for_the_items()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch"); 
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("_bGlmZ_item_awNhH")).click();
	     
	      Thread.sleep(1000);
	}
	
	@Then (" click on dashboard")
	public void add_last_item()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.id("searchDropdownBox")).click(); 
		driver.findElement(By.xpath("//option[@value='search-alias=stripbooks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sunglasses for women");  
	   
	     driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.className("_bGlmZ_itemImage_2uzWz")).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
	}
	@And ("add last item")
	public void add_another_item()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.id("searchDropdownBox")).click(); 
		driver.findElement(By.xpath("//option[@value='search-alias=stripbooks']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");  
	   
	     driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().to("https://www.amazon.in/Lenovo-IdeaPad-39-62cm-Warranty-82H802FJIN/dp/B09Q5QLHSQ/ref=sr_1_1_sspa?keywords=laptop&qid=1669312831&qu=eyJxc2MiOiI5LjIyIiwicXNhIjoiOS40OSIsInFzcCI6IjYuODUifQ%3D%3D&sprefix=lapt%2Caps%2C457&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
	}
	
	@Then("View Cart")
	public void view_the_cart() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
	driver.navigate().to("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
	Thread.sleep(8000);
	driver.close();
	}
	
	


}


