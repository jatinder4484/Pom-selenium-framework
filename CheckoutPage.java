package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	WebDriver driver;
	
	CheckoutPage(WebDriver driver){
		this.driver=driver;
	}
	
	By cart=By.xpath("(//div[@role='button'])[8]");
	By checkout=By.xpath("//div[@class='Button__base']");
	By firstname=By.xpath("//input[@placeholder='First Name(Required)*']");
	By lastname=By.xpath("//input[@placeholder='Last Name(Required)*']");
	By pin=By.xpath("//input[@placeholder='Enter your PIN code(Required)*']");
	By city=By.xpath("//input[@placeholder='City/district(Required)*']");
	By state=By.xpath("//input[@placeholder='State(Required)*']");
	By address=By.xpath("//textarea[@class='TextArea__textAreaBox']");
	By phonenumber=By.id("phoneNumber");
	By saveaddress=By.xpath("(//div[@class='Button__base'])[3]");
	
	public void clickcart() {
		driver.findElement(cart).click();
	}
	public void clickcheckout() {
		driver.findElement(checkout).click();
	}
	public void setfirstname(String fname) {
		driver.findElement(firstname).sendKeys(fname);
	}
	public void setlastname(String lname) {
		driver.findElement(lastname).sendKeys(lname);
	}
	public void setpin(String p) {
		driver.findElement(pin).sendKeys(p);
	}
	public void setcity(String c) {
		driver.findElement(city).sendKeys(c);
	}
	public void setstate(String s) {
		driver.findElement(state).sendKeys(s);
	}
	public void setaddress(String a) {
		driver.findElement(address).sendKeys(a);
	}
	public void setphonenumber(String phone) {
		driver.findElement(phonenumber).sendKeys(phone);
	}
	public void clicksaveaddress() {
		driver.findElement(saveaddress).click();
	}

}
