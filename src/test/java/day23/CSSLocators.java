package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirt");
		//Without Tag Name
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirt");
		
		//tag class
		driver.findElement(By.cssSelector("input.Search-box-text")).sendKeys("T-Shirt");
		//Without Tag Name
		//driver.findElement(By.cssSelector(".Seatch-box-text")).sendKeys("T-Shirt");
		
		
		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder='Search Store']")).sendKeys("T-Shirt");
		//driver.findElement(By.cssSelector("input[placeholder=\"Search Store\"]")).sendKeys("T-Shirt");
		//driver.findElement(By.cssSelector("[placeholder=\"Search Store\"]")).sendKeys("T-Shirt");

		
		//tag class attribute
		driver.findElement(By.cssSelector("input.Search-box-text[name='q']")).sendKeys("T-Shirt");
		driver.findElement(By.cssSelector(".Seatch-box-text[name='q']")).sendKeys("T-Shirt");

		
		
		
		
	}

}
