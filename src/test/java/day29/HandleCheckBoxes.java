package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	
	//1) Select specific checkbox
	//driver.findElement(By.id("Sunday")).click();
	
	//2) Select all the checkboxes
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
//	for(int i=0; i<=checkboxes.size()-1;i++)
//	{
//		checkboxes.get(i).click();
//	}
//	
//	for(WebElement checkbox:checkboxes) {
//		checkbox.click();
//
//	}
//	
//	//3) Select last 3 Checkboxes
//	//total number of checkboxes - how many checkboxes want to select = starting index
//	//7-3=4(starting index)
//	for(int i = 4; i<=checkboxes.size()-1;i++) {
//		checkboxes.get(i).click();
//	}
//	
//	//4) Select first 3 checkboxes
//	for(int ii = 0; ii<3;ii++) {
//		checkboxes.get(ii).click();
//	}
	
	//5) Unselect the check boxes if they are selected
	for (int i1 =0; i1<3;i1++) {
		checkboxes.get(i1).click();
	}
	
	
	
	for(int i =0; i<checkboxes.size();i++) {
		if(checkboxes.get(i).isSelected()) {
			checkboxes.get(i).click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
