package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nithya");
		driver.findElement(By.xpath(" //input[@name='lastname']")).sendKeys("Megakumar");
		driver.findElement(By.xpath(" //input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abc123");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dayDOB = new Select(day);
		dayDOB.selectByVisibleText("7");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthDOB = new Select(month);
		monthDOB.selectByVisibleText("Jun");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearDOB = new Select(year);
		yearDOB.selectByVisibleText("1990");
		driver.findElement(By.xpath("//span/input[@name='sex'][@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
