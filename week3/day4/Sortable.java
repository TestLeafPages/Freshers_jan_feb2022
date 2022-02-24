package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/sortable.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	
	WebElement ele7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
	
	Actions builder=new Actions(driver);
	builder.clickAndHold(ele1).moveToElement(ele7).click().perform();
	
	
	
	
	
}
}
