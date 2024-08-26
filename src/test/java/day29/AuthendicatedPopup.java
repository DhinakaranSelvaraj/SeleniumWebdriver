package day29;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthendicatedPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Syntax: https://username:password@the-internet.herokuapp.com/basic_auth" - Injecting user information along with URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
