package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windoesIds = driver.getWindowHandles();

		for (String winid : windoesIds) {
			String title = driver.switchTo().window(winid).getTitle();

			System.out.println(title);
			if (title.equals("OrangeHRM") || title.equals("Some other window") ) {
				driver.close();

			}
		}

	}

}
