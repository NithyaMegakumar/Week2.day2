package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		// TODO Auto-generated method stub
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
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'emailAddress')]")).sendKeys("nithimegha@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		
		//Capturing name of First Resulting lead
		WebElement findEle = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']"));
		String t1 = findEle.getText();
		System.out.println("The name of the First resulting lead:"+t1);
		findEle.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println("The title is:" +title); 
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		WebElement dupName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String dup1 = dupName.getText();
		System.out.println(dup1);
		if(t1.equals(dup1))
		{
			System.out.println("I confirm that the duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("the duplicated lead name is not same as captured name");
			
			
		}
		driver.close();
		}

		

	}

