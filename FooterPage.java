package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage {
	
	WebDriver driver;
	
	FooterPage(WebDriver driver){
		this.driver=driver;
	}
	
	By link=By.xpath("//a[text()='Terms of Use']");
	
	public void clicklink() {
		driver.findElement(link).click();
	}

}
