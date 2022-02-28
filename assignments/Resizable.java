package week3.assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement arrow =driver.findElement(By.xpath("//body[@style='cursor: auto;']//div[3]"));
		Actions act=new Actions(driver);
	//	act.dragAndDropBy(arrow, 243, 224).build().perform();
	act.clickAndHold(arrow).moveByOffset(245,220).release().build().perform();

	}

}
