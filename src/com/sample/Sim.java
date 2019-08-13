package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sim {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplesite.com/pages/service-login.aspx");
		
		driver.findElement(By.id("loginBox_username")).sendKeys("garima");
		driver.findElement(By.id("loginBox_password")).sendKeys("hehehe");
		driver.findElement(By.linkText("Have you forgotten your password?")).click();
		driver.findElement(By.xpath("Login"));
		String t = driver.getTitle();
		System.out.println(t);
		String u = driver.getCurrentUrl();
		System.out.println(u);
		Thread.sleep(3000);
		driver.close();
	}
}
