package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	By searchbar=By.id("search-text-input");
	
	public void setsearchbar(String product) {
		driver.findElement(searchbar).sendKeys(product + Keys.ENTER);
	}

}
