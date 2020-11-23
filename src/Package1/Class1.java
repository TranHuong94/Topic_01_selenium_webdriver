package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Class1 {
	WebDriver driver;

	@BeforeClass

	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://zingnews.vn/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void f() {
		// Verify title
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "Zing - Thông tin uy tín, hình ảnh ấn tượng - ZINGNEWS.VN");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
