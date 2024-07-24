package sessionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		
		if(!checkBox1.isSelected())
		{
			checkBox1.click();
		}
		else
		{
			System.out.println("checkBox1 is selected");
		}
		
		if(!checkBox2.isSelected())
		{
//			Thread.sleep(4000);
			checkBox2.click();
		}
		else
		{
			System.out.println("checkBox2 is selected");
		}
		

	}

}
