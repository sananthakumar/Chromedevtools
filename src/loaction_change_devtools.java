import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;
import org.testng.annotations.Test;

public class loaction_change_devtools {
	
	@Test
	public void chrom_dev() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91999\\Downloads\\Selenium_learning\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools devtools=driver.getDevTools();
		devtools.createSession();
		Map loc=new HashMap();
		loc.put("latitude", 40);
		loc.put("longitude",3);
		loc.put("accuracy",1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", loc);
		//devtools.send(Emulation.setGeolocationOverride(46, 2, Optional.empty()));

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElement(By.xpath("(//*[@class='GHDvEf'])[1]")).click();
		driver.findElement(By.linkText("En caché")).click();
		System.out.println(driver.findElement(By.className("our-story-card-title")).getText());
		
		//driver.findElements(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).get(0).click();
		
		
}
}
