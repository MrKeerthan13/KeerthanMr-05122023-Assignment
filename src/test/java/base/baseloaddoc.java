package base;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseloaddoc {
	
	public WebDriver driver;
	public  Properties propdoc = new Properties();
	public FileReader fr;
	
	@BeforeMethod
	public void setup() throws IOException{
		FileReader fr = new FileReader(System.getProperty("user.dir")+("\\src\\test\\resources\\configfiles\\config.properties"));
		propdoc.load(fr);
		if(propdoc.getProperty("browser").equalsIgnoreCase("chrome")) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(propdoc.getProperty("testurl"));
		}
		else if (propdoc.getProperty("browser").equalsIgnoreCase("Firefox")) {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.get(propdoc.getProperty("testurl"));
			}
			
		//driver.get("https://tutorialsninja.com/demo/");
// driver.get(Browser);
	}
@AfterMethod
	public void teardown() {
		//if (driver != null) {       
			driver.quit();
		}
		}
		

