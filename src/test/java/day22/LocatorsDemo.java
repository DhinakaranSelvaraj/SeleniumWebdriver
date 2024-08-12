package day22;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com");

		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		
		//id
		//boolean logostatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println("Logo Display Status is " +logostatus);
		
		
		//LinkText & PartialLinkText - Only for identifing links
		//a is representing link. Link text is only available for links <a href="" text /a> another one is innertext
		//Link text is not an attribute of the element
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tabl")).click();
		//We prefer LinkText over partialLinkText. bcz in partial link text the value may duplicate.
		
		
		//classname
		//List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));//Finding group of elements, we use FindElements
		//System.out.println("Total number of header links: "+headerlinks.size());
		
		
		//tagname
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println("Total number of Links: "+links.size());
		
		
		//finding images in a particular page
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("Total number of Images: "+img.size());
		
		
		driver.close();
	}

}
