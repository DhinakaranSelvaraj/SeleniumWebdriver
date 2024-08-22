package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		
		//isDisplayed()
		WebElement logoDisplayed = driver.findElement(By.xpath("//img[@src='/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
		System.out.println(logoDisplayed.isDisplayed());
		
		//isEnabled()
		boolean enabled = driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).isEnabled();
		System.out.println(enabled);
		
		//isSelected()
		//Use it for radio button, checkbox and dropdowns
		
		
		
		
		
		
		
	}

}
