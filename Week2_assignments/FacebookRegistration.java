package week2.Week2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("FN");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("LN");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("ab@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Test");
		
		//DOB day
		WebElement day = driver.findElement(By.xpath("//select[@id = 'day']"));
		Select dd1 = new Select(day);
		dd1.selectByVisibleText("26");
		
		//DOB month
		WebElement month = driver.findElement(By.xpath("//select[@id = 'month']"));
		Select dd2 = new Select(month);
		dd2.selectByIndex(5);
		
		//DOB year
		WebElement year = driver.findElement(By.xpath("//select[@id = 'year']"));
		Select dd3 = new Select(year);
		dd3.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text() = 'Female']/following-sibling::input")).click();
				
	}

}
