package UI_TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Demoauto{
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver a = new ChromeDriver();
		
		a.manage().window().maximize();
		
		a.get("https://libraryvisu.ccbp.tech/");
		
		a.findElement(By.id("searchInput")).sendKeys("vishnu");
		
	}
}