package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Dynamic table with pagination

public class handlingMultiplePages {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int NoOfPages = driver.findElements(By.xpath("//ul[@id='pagination']/li")).size();
		System.out.println("Number of pages is: "+NoOfPages);
		
		for(int p=1; p<=NoOfPages; p++) {
			if(p>=1) {
				driver.findElement(By.xpath("//ul[@id='pagination']/li["+p+"]")).click();
				System.out.println("Page:"+p);
				//find no of rows
				int NoOfRows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
				System.out.println("Rows:"+NoOfRows);
				for(int r=1; r<NoOfRows; r++) {
					System.out.println("Element is:"+ driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]/td[2]")).getText());
				}
			}
		}
		driver.close();

	}

}
