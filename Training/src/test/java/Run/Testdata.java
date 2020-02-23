package Run;

import org.testng.annotations.Test;

import Com.pages.Home;

import org.testng.annotations.DataProvider;

import org.openqa.selenium.WebDriver;

import Common.browsers;

public class Testdata {
	WebDriver driver;
	
  @Test(dataProvider = "signin")
  public void f(String n, String s) throws InterruptedException {
	  Home h = new Home(driver);
		h.Emailidfield(n);
		h.psswordfield(s);
		h.loginbt();
		driver.navigate().back();
		h.empty();
		Thread.sleep(2000);
		
		
		
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "sadaf.dardash@gmail.com", "a" },
      new Object[] { "zoha.kh@gmail.com", "b" },
    };

  }
}
