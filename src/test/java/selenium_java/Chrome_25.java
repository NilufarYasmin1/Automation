package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_25 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gap.com/");
		driver.manage().window().maximize();
		// TODO Auto-generated method stub

	}

}
