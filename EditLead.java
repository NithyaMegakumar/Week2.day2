package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.linkText("Edit")).click();
//			Editting the page
			driver.findElement(By.id("updateLeadForm_description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I cleared the description and updated the import note");
			driver.findElement(By.name("submitButton")).click();
//			To get title of page
			String EditTitle = driver.getTitle();
			System.out.println("The Edit Page is:"+EditTitle);
			driver.close();


	}

}
