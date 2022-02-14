package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchUrl {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://www.amazon.in/");
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.id("decorativeSubmit")).click();
//	driver.findElement(By.linkText("CRM/SFA")).click();	
//	String title = driver.getTitle();
//	System.out.println(title);
//	driver.findElement(By.linkText("Leads")).click();
//	driver.findElement(By.linkText("Create Lead")).click();
//	
//	
//	
	
	
	
	
	
	
	
}
}
