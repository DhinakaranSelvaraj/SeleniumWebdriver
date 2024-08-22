package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// get(url) - Opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		// getTitle() - returns title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Title of the Webpage " +pageTitle);
		
		// getCurrentUrl() - returns URL of the page
		System.out.println("The Page URL is " +driver.getCurrentUrl());
		
		// getPageSource() - returns source code of the page
		System.out.println(driver.getPageSource());
		
		 //getWindowHandle() - returns ID of the single browser window
		String windowId = driver.getWindowHandle();
		System.out.println("WindowId is " +windowId);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser window
		
		// getWindowHandles()	 - return ID's of the multiple browser windows
		Set<String> windowsids = driver.getWindowHandles();
		System.out.println("WindowId is " +windowsids);
		
	}

}
