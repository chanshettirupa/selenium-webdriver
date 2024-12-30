package Day23;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshotsPgm {

	public static void main(String[] args) throws InterruptedException {
		
				
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
				
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//1) Full page SS
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		//File targetFile = new File ("C:\\Users\\TiaaUser\\eclipse-workspace\\selenium-webdriver\\Screenshots\\page.png");
		File targetFile = new File (System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		sourcefile.renameTo(targetFile);

		//2) Specific area of the page
		driver.get("https://demo.opencart.com");
		WebElement element = driver.findElement(By.xpath("//a[text()='iPhone']"));
		File sourcefile1 = element.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\Screenshots\\Iphone.png");
		sourcefile1.renameTo(targetfile1);
		Thread.sleep(100);
		
		//3) capture SS of Web element
		WebElement logo = driver.findElement(By.xpath("//img[@title='Your Store']"));
		File sourcefile2 = logo.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sourcefile2.renameTo(targetfile2);
		Thread.sleep(100);
		
		driver.close();


	}

}
