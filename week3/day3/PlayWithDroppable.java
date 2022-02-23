package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithDroppable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/drop.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions builder=new Actions(driver);
	
	builder.dragAndDrop(source, target).build().perform();
	
	
	
	
	
//	WebElement from = driver.findElement(By.id("txtStationFrom"));
//	from.clear()
//	from.sendKeys("MS",Keys.TAB)
	
	
	
}
}
