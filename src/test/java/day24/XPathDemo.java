package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-Shirt");
		
		//Xpath with multiple attribute
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-Shirt");
		
		//Xpath with 'and' 'or' operator
		driver.findElement(By.xpath("//input[@name='search' and  @placeholder='Search']")).sendKeys("T-Shirt");
		driver.findElement(By.xpath("//input[@name='search' or  @placeholder='Search']")).sendKeys("T-Shirt");

		//Xpath with inner text - text()
		driver.findElement(By.xpath("//a[text()='Desktop']")).sendKeys("T-Shirt");
		//All link text is inner text but not all inner text is Link text
		boolean status = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(status);
		String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);
		
		//Contains(), starts-with() only use for dynamic web element [Start, Stop]
		
		//Xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-Shirt");
		// //tagname[method(@attribute,'attribute value')]. Partial value is okay to search

		//Xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-Shirt");
		// //tagname[method(@attribute,'attribute value')]. Partial value is okay to search

		//Chained Xpath
		boolean displayed = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(displayed);
		
		
	}

}
