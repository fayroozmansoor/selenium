package Selenium.maven.MyFirstProject;

import org.apache.commons.math3.analysis.function.Log;
import org.testng.annotations.Test;

import pages.HomeBASE;
import pages.login;
@Test
public class Login extends BASE {
	
HomeBASE base ;
login login ;

public void login()
{
login = new pages.login(driver);
login.login2("fayrooz2895.1@gmail.com","Fayrooz@1234");

}
}
