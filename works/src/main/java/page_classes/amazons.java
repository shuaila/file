package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_classes.base_cl;

public class amazons extends base_cl{
	
	public amazons() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//a[contains(text(),'Mobiles')]")
WebElement mob;

@FindBy(xpath = "//div[@class = 'nav-search-field ']/input")
WebElement search;


public static void mobile() {
	
}
	
	
	
	
}
