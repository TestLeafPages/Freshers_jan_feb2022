package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {
public static void main(String[] args) {
	WebDriverManager.iedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	InternetExplorerDriver driver=new InternetExplorerDriver();
	
	
	
}
}
