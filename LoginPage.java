package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	By signin=By.xpath("//div[text()='Sign in / Sign Up']");
	By mobilenumber=By.id("mobileNumber");
	By continuebtn1=By.id("continueBtn");
	
	public void clicksignin() {
		driver.findElement(signin).click();
	}
	public void setmobilenumber(String number) {
		driver.findElement(mobilenumber).sendKeys(number);
	}
	public void clickcontinueone() {
		driver.findElement(continuebtn1).click();
	}

}
