package week2.Week2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class DeleteLead {
	
		public static void main(String[] args) throws InterruptedException {
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate the username field and type the username
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		//to verify the title 
		System.out.println(driver.getTitle());
		//click on crmsfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//click on leads link
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String LeadID = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')])[1]//a")).getText();
		System.out.println(LeadID);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')])[1]//a")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(LeadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		if(driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed()) {
			System.out.println("Record is deleted");
		}
		else {
			System.out.println("Record is not deleted");
		}
		
		driver.close();
		
	}

}

