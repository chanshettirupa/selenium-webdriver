package Day22;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// It use only when u got element intercepted exception

public class JavaScriptExecutorPgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// pass input text
		WebElement input = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		js.executeScript("arguments[0].setAttribute('value','John')", input);
		Thread.sleep(1000);
		
		//click on btn
		WebElement btn = driver.findElement(By.xpath("//div[@class='nDcEnd']"));
		js.executeScript("arguments[0].click()", btn);
		Thread.sleep(1000);
		
		driver.close();
	}

}
