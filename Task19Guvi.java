import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task19Guvi {

	public static void main(String[] args) {
	
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.guvi.in/register"); 
		  driver.findElement(By.id("name")).sendKeys("AnithaSham");
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anithanandan29@gmail.com");
		  driver.findElement(By.cssSelector("input[type='password']")).sendKeys("AnSh@21");
		  driver.findElement(By.className("countrycode-left")).sendKeys("9345363554");
		  driver.findElement(By.tagName("a")).click();
		  

	}

}
