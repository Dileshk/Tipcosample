package NX1;

import java.sql.Date;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Chromebrowser {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	ChromeDriver	driver= new ChromeDriver();
		driver.get("https://d2ar2bguhc97cc.cloudfront.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
				
				//click on order tab 
				Thread.sleep(9000);
				
				driver.findElement(By.xpath("//a[text()='Orders']")).click();
				
				Thread.sleep(3000);
				
				//create order page 
				driver.findElement(By.xpath("//div[@role='button']")).click();
				 
				Thread.sleep(3000);
				//enter company name harsh
				driver.findElement(By.xpath("//input[@class='form-control check-box']")).sendKeys("Sravani");
				  driver.findElement(By.xpath("//div[@class='dropdown companyDropDown']")).click();
				// Select s= new Select(ss);
				// s.selectByVisibleText("")
				  
				  driver.findElement(By.xpath("//input[@class='form-control mt-1']")).sendKeys("externlab");
				
				  driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1122334455");
				  
				  
				  //enter pin code 
				  driver.findElement(By.xpath("//input[@placeholder='PickUp Pincode']")).sendKeys("440001");
				  
				  //enter address
				  driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("nagpur");
				
			      //enter consignee details
				  
				  driver.findElement(By.xpath("//input[@name='delivername']")).sendKeys("tiksne");
				  
				  driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("0987654321");
				  
				  driver.findElement(By.xpath("//input[@placeholder='Delivered Pincode']")).sendKeys("180006");
				
				driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("Jammu");
				
				driver.findElement(By.xpath("//select[@class='form-control mt-1   ']")).click();
				
				Thread.sleep(4000);
				
			   	driver.findElement(By.xpath("//option[@value='PREPAID']")).click();
			   	Thread.sleep(2000);
			   	 
			   	driver.findElement(By.xpath("//button[@type='button']")).click();
			   	
			   	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("500");
			   	
			   	driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("1");
			   	
			   	driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("1");
			   	
			   	driver.findElement(By.xpath("(//input[@type='number'])[4]")).sendKeys("1");
			   	 Thread.sleep(2000);
			   driver.findElement(By.xpath("//select[@class='form-control mt-1']")).click();
			    
			   driver.findElement(By.xpath("//option[@value='SAME_DAY_DELIVERY']")).click();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			   
			    
			 // WebElement date = driver.findElement(By.xpath("//span[@class='date-img']"));
			  
			 // date.sendKeys("09192023");
			    
			    		//WebElement date = driver.findElement(By.xpath("//input[@tabindex='6']']"));
			    	//	date.sendKeys("19-09-2023");
			   WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
			   date.click();
			   date.sendKeys("12");
			   date.sendKeys("10");
			   date.sendKeys("2023");
			    		Thread.sleep(6000);
			    		
			    		driver.findElement(By.xpath("(//select[@placeholder='Select'])[2]")).click();
			    		
				driver.findElement(By.xpath("//option[@value='Envelope']")).click();
				
				driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("500");
				driver.findElement(By.xpath("//select[@class='form-control']")).click();
				driver.findElement(By.xpath("//option[@value='Glass']")).click();
				driver.findElement(By.xpath("//input[@class='form-control mt-1']")).sendKeys("1");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
				
				driver.findElement(By.xpath("//button[text()='Proceed To Pay']")).click();
				Thread.sleep(2000);
				
				//driver.findElement(By.xpath("(//li[@class='row mx-0 activeWalletPayment']//div)[2]")).click();
				
				//Thread.sleep(6000);
	
		WebElement click = driver.findElement(By.xpath("//div[@class='popupinner walletpaymement_inner ']//button"));
		
		
		//
		
		
		
		
		
		
	}

}
