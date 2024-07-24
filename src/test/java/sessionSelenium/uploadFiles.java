package sessionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFiles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/upload";
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\jyots\\eclipse-workspace\\sessionSelenium\\src\\test\\resources\\files\\ujjwal_pic.jpg");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		String validate = "//div[@id='uploaded-files']";
		if(driver.findElement(By.xpath(validate)).getText().equals("ujjwal_pic.jpg"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		driver.quit();

	}

}
