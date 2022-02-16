package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Button.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By. id("home")).click();
	String text="TestLeaf - Selenium Playground";
	String title = driver.getTitle();
	if(text.equals(title)) {
		System.out.println("Home page is Displayed");
	}else {
		System.out.println("Home page is not Displayed");
	}
	driver.findElement(By.linkText("Button")).click();
	
	Point location = driver.findElement(By.id("position")).getLocation();
	int x = location.getX();
	System.out.println(x);
	int y = location.getY();
	System.out.println(y);
	
	String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
	System.out.println(cssValue);
	
	Dimension size = driver.findElement(By.id("size")).getSize();
	int height = size.height;
	System.out.println(height);
	int width = size.width;
	System.out.println(width);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
