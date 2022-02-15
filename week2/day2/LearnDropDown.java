package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	
	WebElement DropDown1 = driver.findElement(By.id("dropdown1"));
	Select index=new Select(DropDown1);
	index.selectByIndex(2);
	
	WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
	
	Select text=new Select(dropDown2);
	text.selectByVisibleText("UFT/QTP");
	
	WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
	Select value=new Select(dropDown3);
	value.selectByValue("4");
}
}
