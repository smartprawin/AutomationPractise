package com.automationPractise;


import java.awt.Desktop.Action;
import java.awt.Robot;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationPractise 
{
		Action acc;
		public static WebDriver driver;
		@BeforeMethod
		public void setup() 
		{
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver","D:\\Java\\Window7\\First\\AutomationPractise\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	//==================================================================================================//	
		@Test(enabled = true)
		public void setup6() throws Throwable 
		{
			
			Robot r = new Robot();

			//Open URL	
			Thread.sleep(3000);
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
			//click on register
			WebElement loginButton = driver.findElement(By.xpath("//*[@class='login']"));
			loginButton.click();
			Thread.sleep(5000);
			WebElement email = driver.findElement(By.xpath("//*[@id='email_create']"));
			email.click();
			email.sendKeys("praveenkrce@gmail.com");
			WebElement submit = driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
			submit.click();
			
			//Registeration starts here
			driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
			driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Praveen");
			driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Kumar");
			driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("dare2death");
			
			WebElement days = driver.findElement(By.xpath("//*[@id='days']"));
			Select s = new Select(days);
			s.selectByIndex(10);
			WebElement months = driver.findElement(By.xpath("//*[@id='months']"));
			Select s1 = new Select(months);
			s1.selectByIndex(11);
			WebElement years = driver.findElement(By.xpath("//*[@id='years']"));
			Select s2 = new Select(years);
			s2.selectByIndex(2);
			
		}
}
