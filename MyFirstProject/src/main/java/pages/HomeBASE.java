package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeBASE {

	
	public WebDriver driver ; 
	
	public HomeBASE(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver, this);
	}



}

