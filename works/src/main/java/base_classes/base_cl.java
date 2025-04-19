package base_classes;

import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_cl {
	public static WebDriver driver;
	public static Actions ac;
	public static Select sc;
	public static Alert al;
	
	
	
	public static void browser_launch() {
		driver = new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void GetUrl(String s) {
		driver.get(s);
	}
	
	public static void Url() {
		driver.getCurrentUrl();
	}
	
	public static void Title() {
		driver.getTitle();
	}
	
	public static void clear(WebElement cl) {
		cl.clear();
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	
	public static void radioSelect(WebElement radio) {
		if(!radio.isSelected()) {
		radio.click();
	}
		}
	
	public static void Scroll(WebElement scr){
		ac = new Actions(driver);
		ac.scrollToElement(scr).perform();
	}
	
	public static void Move(WebElement mv) {
		ac = new Actions(driver);
		ac.moveToElement(mv).perform();
	}
	

	public static void Click(WebElement dc) {
		ac = new Actions(driver);
		ac.click(dc).perform();
	}
	
	public static void DoubleClick(WebElement dc) {
		ac = new Actions(driver);
		ac.doubleClick(dc).perform();
	}
	
	public static void RightClick(WebElement rc) {
		ac = new Actions(driver);
		ac.contextClick(rc).perform();
	}
	
	public static void SelectIndex(WebElement Dd, String no) {
		sc = new Select(Dd);
		sc.selectByVisibleText(no);
	}
	
	public static void DeSelect(WebElement Ds, String op) {
		sc = new Select(Ds);
		sc.deselectByValue(op);
	}
	
	public static void AlertAccept() {
		al = driver.switchTo().alert();
		al.accept();
	}
	
	public static void AlertCancel() {
		al = driver.switchTo().alert();
		al.dismiss();
	}
	
	public static void AlertSendKeys(String st) {
		al = driver.switchTo().alert();
		al.sendKeys(st);
	}
	
	public static void clickHold(WebElement take, WebElement Release) {
		ac = new Actions(driver);
		ac.clickAndHold(take).moveToElement(Release).release().build().perform();
	}
	
	public static void implicitWait(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void thread() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public static void sendKeys(WebElement elem, String msg) {
		elem.sendKeys(msg);
	}
	
	public static String getUrl() {
		String curUrl = driver.getCurrentUrl();
		return curUrl;
	}	
	
	public static void jsClick(WebElement wb) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("argument[0].click();", wb);
		
	}
	
	public static void ifram(WebElement fram) {
		driver.switchTo().frame(fram);
	}
	
	public static void defaultWindow() {
		driver.switchTo().defaultContent();
	}
	
	public static void windowSwitch(String swit) {
		driver.switchTo().window(swit);
		
	}
	
	public static void quit() {
		driver.close();
	}
	
	
}