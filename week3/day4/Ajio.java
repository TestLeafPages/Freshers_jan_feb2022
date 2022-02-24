package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Actions builder=new Actions(driver);
	
	WebElement men = driver.findElement(By.linkText("MEN"));
	builder.moveToElement(men).perform();
	
	driver.findElement(By.xpath("(//a[text()='Shirts'])[1]")).click();
	
}
}
