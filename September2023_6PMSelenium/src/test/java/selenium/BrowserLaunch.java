package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C:/Users/ravi/Downloads/geckodriver-v0.33.0-win64/geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		//webdriver.edge.driver
		EdgeDriver driver2 = new EdgeDriver();
		
	}
}
