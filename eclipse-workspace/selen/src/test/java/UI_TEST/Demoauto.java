package UI_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Demoauto{
	public static String browser="chrome";
	public static WebDriver driver;
	public static void main(String[]args) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		
		driver.get("https://libraryvisu.ccbp.tech/");
		
		driver.findElement(By.id("searchInput")).sendKeys("vishnu");
		
	}
}