package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Megakumar");
		//		Entering FirstName(Local) Field Using id Locator	
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nith");
		//		Entering Department Field Using ID Locator.
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accounts");
		driver.findElement(By.name("description")).sendKeys("Creating lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithimegha@gmail.com");
		//		Select State/Province as NewYork Using Visible Text
		WebElement ele1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(ele1);
		dd1.selectByVisibleText("New York");
		WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(ele);
		dd.selectByVisibleText("Conference");
		driver.findElement(By.name("submitButton")).click();	
		String title = driver.getTitle();
		System.out.println("The title of the page:  " +title);
		driver.close();	


	}

}
