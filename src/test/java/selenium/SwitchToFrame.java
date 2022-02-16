package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrame {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		//use switch to two times because parent & child frame on webpage so need to switch from frame to frame
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']")));
		
		Thread.sleep(2000);
		//it will go in frame and click on log in button & it will show firefox can't open this error but it is actually going into frame
		//driver.findElement(By.id("w3loginbtn")).click();
		driver.findElement(By.linkText("Log in")).click();
	}

}
