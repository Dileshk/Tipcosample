package NX1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checktipcodate {
//	 WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
//	   date.click();
//	   date.sendKeys("15");
//	   date.sendKeys("12");
//	   date.sendKeys("2023");
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow_origins=*");
		ChromeDriver driver=new ChromeDriver(op);
		driver.get("https://externlabs.shop/tipco/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Demo@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(13000);
//		WebElement date = driver.findElement(By.xpath("//input[@class='dateInput']"));
//		date.sendKeys("05");
//		date.sendKeys("09");
//		date.sendKeys("2024");
		driver.findElement(By.xpath("//span[@class='dropDownIcon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Tipco Engineering']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='dropdown-row   ']")).click();
	}

}
