package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart
{

	public static void main(String[] args) 
	{
		// open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("\"https://www.flipkart.com");
		//fill field
		
		driver.findElement(By.xpath("//a[text()='Login']"));
		driver.findElement(By.name("(//input[@type='text'])[2]")).sendKeys("magnitiait72");
		driver.findElement(By.name(" //input[@type='password']")).sendKeys("Magnitia@it");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8317585562");
		driver.findElement(By.xpath(""))
		
		

	}

}
