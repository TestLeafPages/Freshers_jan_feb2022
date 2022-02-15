package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String text = driver.findElement(By.tagName("//h2")).getText();
	System.out.println(text);
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RK");
	driver.findElement(By.id("smallSubmit")).click();
	String title = driver.getTitle();
	String title2="View Lead | opentaps CRM";
	if(title.equals(title2)) {
		System.out.println("testcase pass");
	}else {
		System.err.println("testcase fail");
	}
	
	String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println("Company name"+text2);
	driver.close();
	
}
}
