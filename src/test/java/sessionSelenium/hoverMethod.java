package sessionSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hoverMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); // delete all cokies
		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		driver.get("https://freecrm.com/");
		String log_in_xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']";
		driver.findElement(By.xpath(log_in_xpath)).click();
		
		
		driver.findElement(By.name("email")).sendKeys("ujjwalgupta462@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ujjwal@123");
		String login_button = "//div[@class='ui fluid large blue submit button']";
		driver.findElement(By.xpath(login_button)).click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("close")));
		driver.findElement(By.className("close")).click();
//		driver.findElement(By.name("Ujjwal Gupta"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("foreground")));
//		Thread.sleep(300);
		
		//hover process
		WebElement hover = driver.findElement(By.className("item-text"));
		Actions action = new Actions(driver);
		action.moveToElement(hover).perform();
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("Contacts")));
		driver.findElement(By.xpath("//i[@class='plus inverted icon']")).click();		
//		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
//		driver.quit();
		
		
		

	}

}
