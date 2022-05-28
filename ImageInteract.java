package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageInteract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String MainUrl = "http://leafground.com/pages/Image.html";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//		First Image
		driver.get(MainUrl);
		WebElement findElement = driver.findElement(By.xpath("//img[contains(@onclick,'window.location')]"));
		findElement.click();
		String title = driver.getTitle();
		System.out.println("The directed page on click the location image" +title);


		//      Second Image
		driver.get(MainUrl);
		String currentUrl = driver.getCurrentUrl();
		WebElement findElement2 = driver.findElement(By.xpath("//div//img[contains(@src,'../images/abcd.jpg')]"));
		//		String text2 = findElement2.getAttribute("src");
		if(MainUrl.equals(currentUrl))
			System.out.println("The Second image is broken and cannot be redirected");

		//		Third Image
		driver.get(MainUrl);
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
		String title3 = driver.getTitle();
		System.out.println("The directed page pn clicking Keyboard or Mouse :" +title3);
		driver.close();

	

	}

}
