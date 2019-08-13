package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("garima is cute");
		driver.findElement(By.id("pass")).sendKeys("hehehe");
		//driver.findElement(By.id("email")).sendKeys("garima is cute");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.xpath("//input[@value='Log In']"));
		String t = driver.getTitle();
		System.out.println(t);
		String u = driver.getCurrentUrl();
		System.out.println(u);
		System.out.println("heyyyyyy");
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
}
