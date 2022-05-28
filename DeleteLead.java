package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("9600196001");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		//Capturing lead ID of First Resulting lead
		WebElement findEle = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"));
		String t1 = findEle.getText();
		System.out.println("The LeadId to be deleted:"+t1);
		findEle.click();
		//Deleting the lead
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Entering the captured Lead
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(t1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Verifying message "No records to display" in the Lead List
		WebElement findEle2 = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String Value = findEle2.getText();
//		System.out.println(Value);
		if(Value.contains("No records to display")) {
        //Confirms the deletion
			System.out.println("The Lead ID " +t1+ "is Deleted successfully");			
		}
		driver.close();
			




	}

}
