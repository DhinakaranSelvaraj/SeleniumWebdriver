package day25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathAxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
	}

}