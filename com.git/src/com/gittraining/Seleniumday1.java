package com.gittraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday1 {
	public static void main(String[] args) {
		//
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\eclipse-workspace\\Wipro\\Driver\\chromedriver91.exe");
		//driver instantiating
		WebDriver driver = new ChromeDriver();
		//navigating to the url
		driver.get("https://www.calculator.net/gas-mileage-calculator.html");
		//current reading
		driver.findElement(By.id("uscodreading")).clear();
		driver.findElement(By.id("uscodreading")).sendKeys("1000");
		//previous reading
		driver.findElement(By.id("uspodreading")).clear();
		driver.findElement(By.id("uspodreading")).sendKeys("900");
		//gas added
		driver.findElement(By.id("usgasputin")).clear();
		driver.findElement(By.id("usgasputin")).sendKeys("5");
		//gas price 
		driver.findElement(By.id("usgasprice")).clear();
		driver.findElement(By.id("usgasprice")).sendKeys("3");
		
		//submit
		driver.findElement(By.xpath("(//input[@alt='Calculate'])[1]")).click();
		//retrieving the text
		String text = driver.findElement(By.xpath("//font[@color='green']//b")).getText();
		System.out.println(text);
		
		
		
	
		
	}

}
