package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\selvakumar\\eclipse-workspace\\SpiceJet\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement depature = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		depature.sendKeys("Adampur (AIP)");

		WebElement to = driver.findElement(By.xpath("(//a[@text='Delhi (DEL)'])[2]"));
		to.sendKeys("DEL");

		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[5]/a")).click();

		WebElement date = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		date.click();

		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[5]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		
		  WebElement sear = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]"));
		  sear.click();
		  
		  driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		  
		 driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
		 
		 System.out.println("New Update");
		 System.out.println("Project is End");

	}
}
