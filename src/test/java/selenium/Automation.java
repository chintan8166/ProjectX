package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Automation {
	public static void main(String[] args) {
	WebDriver driver;
	
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://signup.ebay.ca/pa/crte");
		
		
	// by xpath ---2  absolute path should not be used
	
	  driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("chintan");
	  driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("patel");
	  driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("patelchintan2604@gmail.com");
	 
	
	// by id ---1
		
	  driver.findElement(By.id("firstname")).sendKeys("chintan");
	  driver.findElement(By.id("lastname")).sendKeys("patel");
	  driver.findElement(By.id("Email")).sendKeys("patelchintan2604@gmail.com");
		 
		
	//by name  ---3
	
	  driver.findElement(By.name("firstname")).sendKeys("chintan");
	  driver.findElement(By.name("lastname")).sendKeys("patel");
	  driver.findElement(By.name("Email")).sendKeys("patelchintan2604@gmail.com");
	 
	// by link text <<< this is only for links  --1
	  
	  driver.findElement(By.linkText("Sign in")).click();
		
	//by partial link text << not useful   --4
	  
		driver.findElement(By.partialLinkText("Agreement")).click();
		
	//by css selector --2   << also ID can be use after #
		
		driver.findElement(By.cssSelector("#firstname")).sendKeys("chintan");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("patel");
		driver.findElement(By.cssSelector("#Email")).sendKeys("patelchintan2604@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("123");
	//by class <<not useful  --4
		
		driver.findElement(By.className("icon-btn infotip__host")).click();
		
		
}
}