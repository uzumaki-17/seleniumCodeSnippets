package sessionSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String xpath = "//input[@name='proceed']";
		driver.manage().window().maximize();
		driver.findElement(By.xpath(xpath)).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText().toString();
		
		if(alertText.equals("Please enter a valid user name"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
		
		  

	}

}
