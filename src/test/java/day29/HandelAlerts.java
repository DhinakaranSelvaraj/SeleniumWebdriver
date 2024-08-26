package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1) Normal Alert with OK button
		driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		if(myalert.getText().equals("I am an alert box!")) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
		myalert.accept();
		
		
		//2) Confirmation Alert
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept(); //close alert using OK button
		driver.switchTo().alert().dismiss(); //close alert using Cancel button
		
		//3) Prompt alert - Input Box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Hello Alert");
		driver.switchTo().alert().accept();
		
		
	}

}
