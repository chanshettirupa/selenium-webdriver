package Day22;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	

	public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.opencart.com");
	driver.manage().window().maximize();
	
	// Ctrl + V
	Actions act = new Actions(driver);
	/*act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	
	//Tab
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	
	// Ctrl + shift + A
	act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	
	//Open link in new tab (Ctrl + click on link)
	//act.keyDown(Keys.CONTROL).click("//a[text()='MacBook']").keyUp(Keys.CONTROL).perform(); */
	
	//Open URL in new tab after lunching 1st URL
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://testautomationpractice.blogspot.com/");
	Thread.sleep(100);
	
	//Open a new window
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.google.com/");
	Thread.sleep(100);
	
	driver.quit();
	}
}
