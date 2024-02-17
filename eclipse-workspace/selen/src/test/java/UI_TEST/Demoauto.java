package UI_TEST;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

class Demoauto{
	public static String browser="chrome";
	public static WebDriver driver;
	public static void main(String[]args) throws InterruptedException {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://gandlatodo.ccbp.tech/");
		
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//input[@id=\"todoUserInput\"]")).sendKeys("work1");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("addTodoButton")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[starts-with(@id,todoUserInput)]")).sendKeys("work2");
		
		Thread.sleep(5000);
		
		driver.findElement(By.tagName("i")).click();
		
		Thread.sleep(5000);

	    driver.findElement(By.xpath("//button[contains(@id,addtodobutton)]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//i[contains(@class,far)]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}