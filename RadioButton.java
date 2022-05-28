package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		Questionnaire 1:
		boolean value1 = driver.findElement(By.xpath("//label[text()='Are you enjoying the classes?']")).isSelected();
		System.out.println("To check if Are you enjoying the classes is seleected or Not: "  +value1);
//		Questionnaire 2:	
		boolean Value2 = driver.findElement(By.xpath("//input[@name='news'][2]")).isSelected();
		System.out.println("To check if Find default selected radio button is selected or not:  "  +Value2);
//	    Questionnaire 3:	
		boolean Value3 = driver.findElement(By.xpath("//input[@name='age'][2]")).isSelected();
		System.out.println("To check if age group is selected or not: "    +Value3);
			
		
	}

}
