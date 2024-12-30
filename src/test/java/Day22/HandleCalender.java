package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String CurrentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String CurrentYear = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();
		
		String date = "13";
		String month = "October";
		String Year = "2023";
		
		while(true) {
			if(CurrentMonth.equals(month) && CurrentYear.equals(Year))
				break;
			else
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			//System.out.println(month+"___"+CurrentMonth+"===="+CurrentMonth.equals(month) + "----" + CurrentYear.equals(Year),);
			
		}
			List<WebElement> AllDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
			for(WebElement Onedate: AllDates ) {
				if(Onedate.getText().equals(date)) {
					Onedate.click();
					break;
				}
			
		}

		driver.close();
	}

}
