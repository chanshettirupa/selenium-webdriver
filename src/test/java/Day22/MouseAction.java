package Day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		// Mouse Hover
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement MacOption = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(desktop).moveToElement(MacOption).build().perform();
		
		//Right Click
		WebElement btn = driver.findElement(By.xpath("//div[@id='logo']//img"));
		act.contextClick(btn).perform();
		Thread.sleep(1000);
		
		//Double click
		WebElement SearchBox = driver.findElement(By.xpath("//input[@name='search']"));
		act.doubleClick(SearchBox).perform();
		Thread.sleep(1000);
		
		
		driver.close();
		
	}

}
