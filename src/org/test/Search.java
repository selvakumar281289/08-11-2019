package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvakumar\\eclipse-workspace\\DomainProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobile.airfrance.fr/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement agr = driver.findElement(By.xpath("//*[@id=\"gdpr_popin\"]/section/div/div[3]/button"));
		agr.click();

		System.out.println("system end");
	}

}
