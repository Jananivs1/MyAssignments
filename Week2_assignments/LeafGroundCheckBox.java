package week2.Week2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click Basic & notifications
		driver.findElement(By.xpath("//span[text()='Basic']//preceding-sibling::div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']//preceding-sibling::div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		if(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed()) {
			System.out.println("Notification is displayed");
		}else {
			System.out.println("Notification is not displayed");
			
		}
		
		//click fav lang
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		//click Tri state
		driver.findElement(By.xpath("(//div[contains(@id,'TriState')]//div)[2]")).click();
		Thread.sleep(5000);
		WebElement stateMsg = driver.findElement(By.xpath("//span[contains(text(),'State has been changed')]"));
		if(stateMsg.isDisplayed()) {
			System.out.println("Tri State is selected");
		}else {
			System.out.println("Tri State is not selected");
		}
		
		//click toggle
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		if(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed()) {
			System.out.println("Toggle Notification is displayed");
		}else {
			System.out.println("Toggle Notification is not displayed");
			
		}
		Thread.sleep(5000);
		WebElement isEnab = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]//input"));
		if(isEnab.isEnabled()) {
		System.out.println("Checkbox is enabled");	
		}else {
			System.out.println("Checkbox is disabled");
		}
		//select cities
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Paris']//div[contains(@class,'ui-state-default')]")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Rome']//div[contains(@class,'ui-state-default')]")).click();
		driver.findElement(By.xpath("//a[@aria-label='Close']//span")).click();
		
		WebElement Paris = driver.findElement(By.xpath("//span[text()='Paris']"));
		WebElement Rome = driver.findElement(By.xpath("//span[text()='Rome']"));
		if(Paris.isDisplayed()&&Rome.isDisplayed()) {
			System.out.println("Multiple cities are selected");
		}else {
			System.out.println("Multiple selection is not done");
		}
		
	}

}
