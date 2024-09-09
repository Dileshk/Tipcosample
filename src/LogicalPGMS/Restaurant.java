package LogicalPGMS;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Restaurant {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(op);
		driver.get("http://restaurant-frontend.s3-website.ap-south-1.amazonaws.com/");
		
		Thread.sleep(2000);
		
	  driver.findElement(By.xpath("//input[@name='email_or_phone']")).sendKeys("6767676767");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Demo@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
		
		
		
		
	}

}
