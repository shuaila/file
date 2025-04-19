package page_classes;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_classes.base_cl;



public class makemytrips extends base_cl {
public WebDriver driver;

public makemytrips(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);

}
@FindBy(xpath ="//span[@class='commonModal__close']")
public WebElement popup;

public WebElement getPopup() {
return popup;
}

public WebDriver getDriver() {
return driver;
}
public WebElement getBuses() {
return buses;
}

public WebElement getTocity() {
return Tocity;
}
public WebElement getDate() {
return date;
}
public WebElement getSearchbtn() {
return searchbtn;
}
@FindBy(xpath="(//span[text()='Buses'])[1]")
private WebElement buses;

@FindBy(xpath = "//span[text()='From']")
private WebElement from;

@FindBy(xpath="//input[@placeholder='From']")
private WebElement fromcitybox;

public WebElement getfrom() {
	return from;
}
public WebElement getFromcitybox() {
return fromcitybox;
}
public WebElement getTocitybox() {
return tocitybox;
}
@FindBy(id="toCity")
private WebElement Tocity;
@FindBy(xpath="//span[text()='Chennai, Tamil Nadu']")
private WebElement chennai;

@FindBy(xpath="//span[text()='Bangalore, Karnataka']")
private WebElement bangalore;
    public WebElement getChennai() {
return chennai;
}
     public WebElement getBangalore() {
return bangalore;
}
     @FindBy(xpath="(//div[@aria-label='Sat Apr 26 2025'])")
     private WebElement nextDay;
     
     @FindBy(xpath="//span[text()='AC']")
     private WebElement ac;
     
     @FindBy(xpath="//div//span[text()='Sleeper']")
     private WebElement sleeper;
     
     @FindBy(xpath="(//span[@class='checkMarkInner'])[1]")
     private WebElement single;
     
     @FindBy(xpath="//span[text()='Sholinganallur']")
     private WebElement sholinganallur;
     
     @FindBy(xpath="(//span[text()='6 PM to 11 PM'])[1]")
     private WebElement  pickuptime;
     
     @FindBy(xpath="//span[text()='IntrCity SmartBus']")
     private WebElement  intercity;
     
     @FindBy(xpath="//span[text()='Lal Bagh']")
     private WebElement lalbag;
     
     public WebElement getSingle() {
return single;
}

public WebElement getSholinganallur() {
return sholinganallur;
}

public WebElement getPickuptime() {
return pickuptime;
}

public WebElement getIntercity() {
return intercity;
}

public WebElement getLalbag() {
return lalbag;
}


public WebElement getSerach2() {
return serach2;
}
@FindBy(xpath="//span[text()='Show All(45)']")
private WebElement showall2;
     public WebElement getShowall2() {
return showall2;
}
     @FindBy(xpath="//div[@class='paymentBtn whiteText latoBold font16 capText']")
     private WebElement contnPaymentbtn;
     
     @FindBy(xpath="(//div[@class = 'makeAbsolute'][10])")
     private WebElement randomSeat1;
     @FindBy(xpath="//span[text()='Continue']")
     private WebElement continuebtn;
     public WebElement getRandomSeat1() {
return randomSeat1;
}

public WebElement getContinuebtn() {
return continuebtn;
}

public WebElement getShowall1() {
return showall1;
}

public WebElement getBusPrices() {
return busPrices;
}
@FindBy(xpath="//li[text()='Cheapest']")
     private WebElement cheapestPrice;
public WebElement getCheapestPrice() {
return cheapestPrice;
}
@FindBy(xpath="(//div[@data-test-id='select-seats'])[1]")
private WebElement cheapestSeat;
public WebElement getCheapestSeat() {
return cheapestSeat;
}

@FindBy(xpath="//input[@id='fname']")
private WebElement name;

@FindBy(xpath="//input[@id='age']")
private WebElement age;
@FindBy(xpath="//div[text()='Male']")
private WebElement male;
@FindBy(xpath="//input[@name='email id']")
private WebElement email;
@FindBy(xpath="//input[@name='Mobile Number']")
private WebElement mobilenum;
@FindBy(xpath="//li[text()='Tamil Nadu']")
private WebElement tamilnadu;
@FindBy(xpath="//input[@value='Tamil Nadu']")
private WebElement dropdownState;
@FindBy(xpath="//li[text()='Tamil Nadu']")
private WebElement downState;


@FindBy(xpath="//span[text()='Continue']")
private WebElement conBtn;
@FindBy(xpath="//p[@class='font18 lato-black box-padding']//span")
private WebElement paymentoptn;
@FindBy(xpath="//span[contains(text(),'No I')]/preceding-sibling::span")
private WebElement noneed;
public WebElement NoNeed() {
	return noneed;
}
public WebElement getContnPaymentbtn() {
return contnPaymentbtn;
}
@FindBy(xpath="//span[@class='checkboxWpr']")
private WebElement confirmCheck;

public WebElement getConfirmCheck() {
return confirmCheck;
}

public WebElement getPaymentoptn() {
return paymentoptn;
}

public WebElement getName() {
return name;
}

public WebElement getAge() {
return age;
}

public WebElement getMale() {
return male;
}

public WebElement getEmail() {
return email;
}

public WebElement getMobilenum() {
return mobilenum;
}

public WebElement getTamilnadu() {
return tamilnadu;
}

public WebElement getDropdownState() {
return dropdownState;
}

public WebElement getdownState() {
return downState;
}

public WebElement getConBtn() {
return conBtn;
}
@FindBy(xpath="//button[text()='Search']")
     private WebElement serach2;
     @FindBy(xpath="(//span[text()='Show All(45)'])[1]")
     private WebElement showall1;
     @FindBy(xpath="//span[@id='price']")
     private WebElement busPrices;
     
     public WebElement getSerachmore1() {
return showall1;
}

public WebElement getSleeper() {
return sleeper;
    }
     
     
     public WebElement getAc() {
  return ac;
     }
public WebElement getNextDay() {
return nextDay;

}
@FindBy(xpath="//input[@placeholder='To']")
private WebElement tocitybox;

@FindBy(xpath="div[@aria-label='Thu Apr 03 2025']")
private WebElement date;

@FindBy(xpath="//button[text()='Search']")
private WebElement searchbtn;

public void UrlLaunch() {
browser_launch();
GetUrl("https://www.makemytrip.com");

implicitWait(10);
}
public void popupHandle() throws InterruptedException {
//Thread.sleep(2000);
WebDriverWait wa = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement pop = wa.until(ExpectedConditions.elementToBeClickable(popup));
pop.click();
//clickByJs(popup);
        }

public void selectDepartCity() {
	implicitWait(10);
buses.click();

}
public void selectDesCity() {
	implicitWait(5);
Tocity.click();

}
public void getAllBusPrices() {
List<WebElement> prices = driver.findElements(By.xpath("//span[@id='price']"));
for(WebElement x:prices) {
System.out.println("Bus Prices: "+x.getText());
}
}
public void paymentOptionsText() {
List<WebElement> options = driver.findElements(By.xpath("paymentOptionsText"));
for(WebElement x:options) {
System.out.println("payment options: "+x.getText());
}
}
public void paymentText() {
boolean retry = true;{
while (retry) {
   try {
       WebElement element = driver.findElement(By.xpath("//p[@class='font18 lato-black box-padding']//span"));
       String text = element.getText();
       System.out.println(text);
       retry = false; // Exit loop after successful interaction
   } catch (StaleElementReferenceException e) {
       System.out.println("Element is stale, retrying...");
   }
}


}


}
}