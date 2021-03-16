package Selenium.maven.MyFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BASE {
	public static WebDriver driver ;

  @BeforeSuite
  void beforall() {
		WebDriverManager.chromedriver().setup();
     	driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");}
  @AfterSuite
  void end() 
  {
	  driver.quit();
  }
  
}
