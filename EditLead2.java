package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead2 {


	private static final String Else = null;

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']//input[@name='firstName']")).sendKeys("Nithya");

		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//Capturing name of First Resulting lead
		Thread.sleep(2000);
		WebElement findEle2 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"));
		String t1 = findEle2.getText();
		System.out.println("The LeadId to be Editted:"+t1);
		findEle2.click();					
		String title = driver.getTitle();
		System.out.println("The title is:" +title);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("AtoZ technology");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String UpdateName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("The updated company Name is :"+UpdateName);
		driver.close();
	}
}






