package Day22;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
	

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[text()='About']")).click();
		
		Set<String> windowsId = driver.getWindowHandles();
		System.out.println("windows - "+ windowsId);
		
		List<String> windowList = new ArrayList(windowsId);			// approach1 or approadch 2 use for loop to iterate
		
		String partentId = windowList.get(0);
		String ChildId = windowList.get(1);
		
		driver.switchTo().window(ChildId);
		System.out.println("window title - "+driver.getTitle());
		
		driver.close();
		
//		 WebDriver driver = new ChromeDriver();
//
//		    //Maximize the window
//		    driver.manage().window().maximize();
//
//		    driver.get("http://www.rediff.com/");
//
//		    //Get all window handles
//		    Set<String> allHandles = driver.getWindowHandles();
//
//		    //count the handles Here count is=2
//		    System.out.println("Count of windows:"+allHandles.size());      
//
//		    //Get current handle or default handle
//		    String currentWindowHandle = allHandles.iterator().next();
//		    System.out.println("currentWindow Handle"+currentWindowHandle);
//
//		    //Remove first/default Handle
//		    allHandles.remove(allHandles.iterator().next());
//
//		    //get the last Window Handle
//		    String lastHandle = allHandles.iterator().next();
//		    System.out.println("last window handle"+lastHandle);
//
//		    //switch to second/last window, because we know there are only two windows 1-parent window 2-other window(ad window)
//		driver.switchTo().window(lastHandle);
//		    System.out.println(driver.getTitle());
//		    driver.findElement(By.tagName("body")).click();
	
	}

}
