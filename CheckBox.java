package week2.day2;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//		Select the language you know
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input"));
		findElement.click();
		System.out.println("The language is checked");

		//		Confirm Selenium is checked
		boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
		if(selected) {
			System.out.println("I confirm that Selenium is selected");
		}
		else {
			System.out.println("I confirm that Selenium is not selected");		
		}
		//		DeSelect only checked
		WebElement findElement2 = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]"));
		findElement2.click();
		System.out.println("The checked box is deselected ");

		//		Select all below checkboxes
		List<WebElement> findElements = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		for (int i = 0; i < findElements.size(); i++) {
			findElements.get(i).click();
			System.out.println("All the checkboxes are selected");

		}


	}


}

