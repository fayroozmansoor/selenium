package pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class login extends HomeBASE{

	public login(WebDriver driver) {
		super(driver);}

	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;	
	 //@FindBy(xpath='//*[@id=\"u_0_j_5R\"]')
	@FindBy (xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	WebElement login;
	WebDriverWait wait ;
	
@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]")
WebElement emailvaldaiton ;
 
	public void login2(String email2,String Pass )
	{
		email.sendKeys(email2);
	    password.sendKeys(Pass);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(login));				 
        login.click();
     if(emailvaldaiton.isDisplayed()) {}
    //    {System.out.print("INVALID");
   //     System.out.print("  Validation msg :  "+emailvaldaiton.getText());
    //    }
        String actualUrl="https://www.facebook.com/";
        String expectedUrl= driver.getCurrentUrl(); 


        // Assert.assertEquals(actualUrl, expectedUrl);
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Valid Login"+expectedUrl);
        }
        else
        {
            System.out.println("Invalid Login"+"\n");
            System.out.print(" Validation msg :  "+emailvaldaiton.getText()+"\n");

        }
        }

	}
	


