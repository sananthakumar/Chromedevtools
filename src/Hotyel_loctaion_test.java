import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;
import org.testng.annotations.Test;

public class Hotyel_loctaion_test {

	
	@Test
    public void goShoppingInAustin(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91999\\Downloads\\Selenium_learning\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools devtools=driver.getDevTools();
		devtools.createSession();
        Map coordinates = Map.of(
                "latitude", 36.2048,
                "longitude", 138.2529,
                "accuracy", 1
        );
        
        driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("retuaranats near me",Keys.ENTER);
        
    }
	
	
	@Test
	public void chrom_dev() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91999\\Downloads\\Selenium_learning\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools devtools=driver.getDevTools();
		devtools.createSession();
		Map coordinates=new HashMap();
		
		coordinates.put("latitude", 36.2048);
		coordinates.put("longitude",138.2529);
		coordinates.put("accuracy",1);
		//devtools.send(Emulation.setGeolocationOverride(36, 138, 1));
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("retuaranats near me",Keys.ENTER);
		
}
}
