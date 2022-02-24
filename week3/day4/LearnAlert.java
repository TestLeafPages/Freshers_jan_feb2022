package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	Thread.sleep(5000);
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 
	 driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(5000);
		 Alert conformBox = driver.switchTo().alert();
		 conformBox.dismiss();
	
	
}
}
