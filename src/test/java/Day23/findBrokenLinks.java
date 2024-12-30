package Day23;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
				
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//find total links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total broken link = "+links.size());
		
		for (WebElement ele: links) {
			String hrefValue = ele.getAttribute("href");
			if(hrefValue == null || hrefValue.isEmpty()) {
				System.out.println("Href is empty");
				continue;
			}
			
			try {
				URL linkURL = new URL(hrefValue);  // convert link to URL
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect();
				
				if(conn.getResponseCode() >= 400) {
					System.out.println("Broken link : "+conn.getResponseCode() );
				}
				else {
					System.out.println("Not a Broken link : "+conn.getResponseCode());
				}
			}
			catch(Exception e){
				
			}
		}
	
		driver.close();
	}

}
