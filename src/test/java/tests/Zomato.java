package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zomato
{

	public static void main(String[] args) throws Exception
	{
		// open  chrome browser 
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new  ChromeDriver();
		//Launch site
		driver.get("https://www.zomato.com/");
		Thread.sleep(5000);
		// 
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("venu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("veungopalreddy91770@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//span[text()='Skip for now']")).click();
         Thread.sleep(15000);
         driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("mehfil", Keys.ENTER);
        
         
        // driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']/parent::div")).sendKeys("biryani");
   
       //  Thread.sleep(10000);
       //  driver.findElement(By.xpath("//div[@class='sc-fjhmcy hKilXF']/div[1]")).click();
         
	}
}


