package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 * TestCase: 1
 * ------------
 * 1) Launch the browser(Chrome)
 * 2) Open URL https://demo.opencart.com
 * 3) Validate title should be "Your Store"
 * 4) Close Browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		// 1) Launch the browser(Chrome)
		// ChromeDriver driver1 = new ChromeDriver(); //ChromeDriver()--> Internally the chrome driver constructor will automatically invoke and that constructor will launch chrome browser
		WebDriver driver = new ChromeDriver(); // Upcasting
		driver.manage().window().maximize();
		
		// 2) Open URL https://demo.opencart.com
		driver.get("https://demo.opencart.com");

		// 3) Validate title should be "Your Store"
		String act_title = driver.getTitle();
		
		if (act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		// 4) Close Browser
		driver.close();
		// driver.quit();
	}

}
