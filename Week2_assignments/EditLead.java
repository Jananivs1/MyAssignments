package week2.Week2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class EditLead {
	
		public static void main(String[] args) {
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
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
		//click on createlead link
		driver.findElement(By.linkText("Create Lead")).click();
		//enter companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FN1");
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LN1");
		//click submitbutton
		driver.findElement(By.name("submitButton")).click();
		//print the title
		System.out.println(driver.getTitle());	
		
	}

}

