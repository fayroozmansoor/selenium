package Selenium.maven.MyFirstProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.login;

public class invalidLogin extends BASE{
login invalidlogin ;

@Test
public void invalidlogin ()
{
invalidlogin =new login(driver);
invalidlogin.login2("Fayrooz29@test.com", "Wrongpassword");}}
