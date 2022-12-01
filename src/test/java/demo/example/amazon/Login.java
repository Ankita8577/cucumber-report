package demo.example.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	WebDriver driver = null;
	@Given("open with browser")
	public void open_chrome_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Creating an object to access the browser elements
		driver = new ChromeDriver();
		
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
	}
	@And ("View About us page")
	public void About()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		
	     
	      driver.navigate().to("http://localhost:3000/About");
	      Thread.sleep(2000);
	}
	@And ("go to the signup page")
	public void Login_account()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.id("sign")).click(); 
		driver.findElement(By.id("frstname")).sendKeys("Ankita12");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("Srivastava"); 
	     Thread.sleep(1000);
	     driver.findElement(By.id("email")).sendKeys("anki11@gmail.com");
	     Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("hellooA1&");
			  Thread.sleep(1000);
		driver.findElement(By.id("reg")).click();
		Thread.sleep(1000);
		driver.navigate().to("http://localhost:3000/login");
		Thread.sleep(1000);
	}
	@And ("go to the login page")
	public void search_for_the_items()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		
		driver.findElement(By.id("mail")).sendKeys("ankita@gmail.com"); 
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("As1@34sr");
		driver.findElement(By.id("clk")).click(); 
	      Thread.sleep(1000);
	      
	}
	@And ("click on dashboard")
	public void add_last_item()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.id("dsh")).click(); 
		Thread.sleep(1000);
	}
	@And ("create new Wallet")
	public void add_another_item()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.id("crt")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.id("wallet")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nm")).sendKeys("ubl");
		Thread.sleep(1000);
		driver.findElement(By.id("no")).sendKeys("343434"); 
		Thread.sleep(1000);
		driver.findElement(By.id("desc")).sendKeys("abcdj"); 
		Thread.sleep(1000);
		driver.findElement(By.id("amount")).sendKeys("27000");
		Thread.sleep(1000);
	   	driver.findElement(By.id("create")).click();
		Thread.sleep(2000);
	}
	@And("update")
	public void view_the_cart() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("dsh")).click();
	
	Thread.sleep(1000);
	
	}
	
	@And ("click on Home page")
	public void home()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		driver.findElement(By.id("home")).click(); 
		Thread.sleep(1000);
		driver.close();
	}
	
	
	
}

