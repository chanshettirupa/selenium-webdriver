package Day22;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarPgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1) scroll down by pixel no
		js.executeScript("window.scrollBy(0,5000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Return back to original place
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(1000);
				
		//2)Scroll page till Element
		WebElement element = driver.findElement(By.xpath("//a[text()='Canon EOS 5D']"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(1000);
		
		//Return back to original place
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(1000);
		
		//3) scroll till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.close();
	}

}
