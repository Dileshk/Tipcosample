package NX1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sampleclass {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(op);
		driver.get("https://d2ar2bguhc97cc.cloudfront.net/");

		//ChromeOptions op= new ChromeOptions();
		//op.addArguments("--remote-allow-origins");
		//ChromeDriver driver= new ChromeDriver(op);
		//driver.get("https://d2ar2bguhc97cc.cloudfront.net/admin/order#ready_for_pickup");
		
		driver.manage().window().maximize();
		 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		 
		//enter login credentials
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nehadubet@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Demo@123");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Settings']")).click();
		
		driver.findElement(By.xpath("(//ul[@class='settings-box']//li)[3]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//a[text()='Settings']")).click();
		driver.findElement(By.xpath("(//ul[@class='settings-box']//li)[7]")).click();
		
		
	}

}
