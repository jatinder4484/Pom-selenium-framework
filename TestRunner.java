package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestRunner {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tatacliq.com");
		driver.manage().window().maximize();
		
		ExtentSparkReporter spark=new ExtentSparkReporter("extentreport.html");
		extent=new ExtentReports();
		extent.attachReporter(spark);
	}
	@Test
	public void test1() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.setsearchbar("shoes for men");
		Thread.sleep(2000);
		
		String currenturl = driver.getCurrentUrl();
		Assert.assertTrue(currenturl.contains("search/?searchCategory=all&text=shoes%20for%20men"));
	}
	@Test
	public void test2() throws InterruptedException {
		test=extent.createTest("Valid Login Test");
		LoginPage lp=new LoginPage(driver);
		lp.clicksignin();
		test.info("Enter Mobile number");
		lp.setmobilenumber("6006445575");
		Thread.sleep(5000);
		test.info("Click on continue");
		lp.clickcontinueone();
		Thread.sleep(60000);
	}
	@Test
	public void test3() throws InterruptedException {
		AddtocartPage acp=new AddtocartPage(driver);
		acp.setsearch("shoes for men");
		Thread.sleep(2000);
		acp.clickselect();
		acp.clicksize();
		acp.clickcart();
	}
	@Test
	public void test4() {
		CheckoutPage cop=new CheckoutPage(driver);
		cop.clickcart();
		cop.clickcheckout();
		cop.setfirstname("Jatinder");
		cop.setlastname("Kumar");
		cop.setpin("181133");
		cop.setcity("Jammu");
		cop.setstate("JammuandKashmir");
		cop.setaddress("Doolian");
		cop.setphonenumber("6006445575");
		cop.clicksaveaddress();
	}
	@Test
	public void test5() {
		FooterPage fp=new FooterPage(driver);
		fp.clicklink();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.quit();
	}

}
