package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DemoSalesManager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.xpath("//div/a[text()='Contacts']")).click();
driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Create Contact']")).click();
driver.findElement(By.xpath("//input[@onchange='ensureToName()']")).sendKeys("Nithi");
driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Megha");
driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Nith");
driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Neeku");
driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Testing");
driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("I am coding using xpath");
driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("nithimegha@gmail.com");
WebElement ele1 = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
Select dd = new Select(ele1);
dd.selectByVisibleText("New York");
driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("important");
driver.findElement(By.xpath("//input[@value='Update']")).click();
String title = driver.getTitle();
System.out.println("The resulting page " +title);



	}

}
