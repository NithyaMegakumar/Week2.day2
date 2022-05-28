package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayLink {

	public static void main(String[] args) {
				
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Link.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			WebElement findElement1 = driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
			System.out.println("The output is: " +findElement1.getAttribute("href"));
			
			WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"));
			System.out.println("The output is :" +findElement2.getAttribute("href"));
			System.out.println("The color is : " +findElement2.getCssValue("Color"));
				
			WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
			System.out.println("The error is :" +findElement3.getAttribute("href"));
			System.out.println("The color is : " +findElement3.getCssValue("Color"));
			
			WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
			System.out.println("The error is :" +findElement4.getAttribute("href"));
			System.out.println("The color is : " +findElement4.getCssValue("Color"));
			
			WebElement findElement5 = driver.findElement(By.xpath("//a[text()='How many links are available in this page?']"));
			System.out.println("The error is :" +findElement5.getAttribute("href"));
			System.out.println("The color is : " +findElement5.getCssValue("Color"));
		
			driver.close();
		
	}

}
