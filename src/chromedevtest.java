import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;
import org.testng.annotations.Test;

public class chromedevtest {

	
	@Test
	public void chrom_dev() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91999\\Downloads\\Selenium_learning\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools devtools=driver.getDevTools();
		devtools.createSession();
		devtools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.findElement(By.xpath("(//*[@class='navbar-header'])[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Courses")).click();
	}
}
