import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;
import org.testng.annotations.Test;

public class Devtools_without_selelnium_method {
	@Test
	public void chrom_dev() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91999\\Downloads\\Selenium_learning\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools devtools=driver.getDevTools();
		devtools.createSession();
		Map dev=new HashMap();
		dev.put("width",600);
		dev.put("height",1000);
		dev.put("deviceScaleFactor", 50);
		dev.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", dev);
		
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.findElement(By.xpath("(//*[@class='navbar-header'])[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Courses")).click();
		driver.close();
}
}
