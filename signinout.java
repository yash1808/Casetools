package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumama2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_8yniay4rwd_b&adgrpid=57434613725&hvpone=&hvptwo=&hvadid=294136260889&hvpos=&hvnetw=g&hvrand=9847700188606287600&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299168&hvtargid=kwd-64913191&hydadcr=15413_1904556&gclid=Cj0KCQjw4PKTBhD8ARIsAHChzRJq9uR1dgn2WRyFmWV_aJfX9k0Xphk73os2LKLG_IcIS_FQvMnv7RcaAjFAEALw_wcB");
          driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
          driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("yashkerkar999@gmail.com");
		     driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
          driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Yash*12");
          driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
          driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();		 
          driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a")).click();
          driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
          driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a")).click();
	}

}
