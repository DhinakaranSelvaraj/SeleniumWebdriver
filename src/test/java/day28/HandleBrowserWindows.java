package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	
		Set<String> windoesIds = driver.getWindowHandles();
		
		//Approach 1 - Convert set into list [Only for 2 to 5 windows]
		List<String> windowList = new ArrayList<String>(windoesIds);
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		
		//Approach 2 - looping concept
		for(String winId:windoesIds)
		{
			String title = driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM"));
			{
				System.out.println(driver.getCurrentUrl());
			}
	
		}


	}

}
