package week2.Week2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		String AccName = "Acc3";
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(AccName);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select ddIndustry = new Select(industry);
		ddIndustry.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ddOwnership = new Select(ownership);
		ddOwnership.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select ddSource = new Select(source);
		ddSource.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketCamp = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select ddMarketcamp = new Select(marketCamp);
		ddMarketcamp.selectByIndex(6);
		
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select ddState = new Select(state);
		ddState.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		WebElement accTitle = driver.findElement(By.xpath("(//span[text()='Account Name']/following::span)[1]"));
		String createdAccName = accTitle.getText();
		
		if(createdAccName.contains(AccName)) {
			System.out.println("Account is created");
		}
		
		driver.close();		
		
	}


}
