package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/drag.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	WebElement drag = driver.findElement(By.id("draggable"));
	Actions builder=new Actions(driver);
	//builder.dragAndDropBy(drag, 150, 200).build().perform();
	
	//builder.drag
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
