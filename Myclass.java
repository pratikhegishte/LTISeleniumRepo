package CodilityPractice;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\ItLearning\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.get("https://www.google.com");
	}
	@Test
	public void checkbox() {	
	WebElement searchbox=driver.findElement(By.id("q"));
	WebElement gsearchbtn= driver.findElement(By.name("search-button"));
	Assert.assertTrue(searchbox.isDisplayed());
	driver.close();
	}
	
	@Test
	public void TC4() {
		
	}
	
	}
