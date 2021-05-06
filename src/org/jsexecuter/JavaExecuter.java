package org.jsexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecuter {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\JsExecuter\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//predefined interface
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.facebook.com/");
		
		//methods
		
		WebElement username = driver.findElement(By.name("email"));
		
		js.executeScript("arguments[0].setAttribute('value', 'mohan');", username);
		
		WebElement findElement = driver.findElement(By.name("login"));
		
		Object object = js.executeScript("return document.URL");
		
		System.out.println(object.toString());
		
		WebElement scroll = driver.findElement(By.xpath("//*[text()='Sign Up']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		
		
		
		
		
		
		
		
	}

}
