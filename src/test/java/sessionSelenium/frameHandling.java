package sessionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.name("mytext1")).sendKeys("hello world");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
//		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("secondframe");
		
		// Switch back to the main content before switching to another frame
		driver.switchTo().defaultContent();
		//Switch to third frame
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("ThirdFrame");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("fourthframe");
		
		

	}

}
