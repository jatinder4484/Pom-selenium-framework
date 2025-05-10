package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddtocartPage {
	
	WebDriver driver;
	
	AddtocartPage(WebDriver driver){
		this.driver=driver;
	}
	
	By search=By.id("search-text-input");
	By select=By.xpath("(//a[@class='ProductModule__base'])[2]");
	By size=By.id("pdpSize-UK/IND-7");
	By addtocart=By.xpath("//button[text()='Add To Bag']");
	
	public void setsearch(String product) {
		driver.findElement(search).sendKeys(product + Keys.ENTER);
	}
	public void clickselect() {
		driver.findElement(select).click();
	}
	public void clicksize() {
		driver.findElement(size).click();
	}
	public void clickcart() {
		driver.findElement(addtocart).click();
	}

}
