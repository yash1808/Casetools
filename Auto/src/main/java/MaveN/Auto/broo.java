package MaveN.Auto;


import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class broo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayed\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.id("signin2")).click();
		driver.findElement(By.id("sign-username")).sendKeys("bca2004");
		driver.findElement(By.id("sign-password")).sendKeys("987654");
		driver.findElement(By.xpath("//*[@id=\'signInModal\']/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		driver.findElement(By.xpath("//*[@id=\'signInModal\']/div/div/div[3]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("bca2004");
		driver.findElement(By.id("loginpassword")).sendKeys("987654");
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.id("logout2")).click();
	}
	
}

