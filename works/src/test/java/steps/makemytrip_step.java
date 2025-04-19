package steps;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_classes.makemytrips;
import base_classes.base_cl;
import io.cucumber.java.en.*;

 
public class makemytrip_step extends base_cl {
public static WebDriverWait wait;
public static makemytrips ma;

@Given("The user should be on Makemytrip")
public void the_user_should_be_on_makemytrip() {
	String url = "https://www.makemytrip.com";
 browser_launch();
 GetUrl(url);
 maximize();
 implicitWait(5);
}

@When("The user closes the pop_up window")
public void the_user_closes_the_pop_up_window() {

ma= new makemytrips(driver);
click(ma.getPopup());
 
}

@When("click the Buses tab")
public void click_the_buses_tab() {
	click(ma.getBuses());

}

@When("the user select friom location as Chennai,Tamil Nadu and To location as Bangalore,Karnataka")
public void the_user_select_friom_location_as_chennai_tamil_nadu_and_to_location_as_bangalore_karnataka() {
	click(ma.getfrom());
	
  ma.getFromcitybox().sendKeys("chennai");
  Move(ma.getChennai());
  Click(ma.getChennai());
  Move(ma.getBangalore());
  click(ma.getBangalore());  
}

@When("The user choose travel date as next date and click the search button")
public void the_user_choose_travel_date_as_next_date_and_click_the_search_button() {
 click(ma.getNextDay());
 click(ma.getSearchbtn());
}

@When("Choose Filters ac and Sleeper")
public void choose_filters_ac_and_sleeper() {
	click(ma.getAc());
	click(ma.getSleeper());
}

@When("Choose Single checkbox")
public void choose_single_checkbox() {
	click(ma.getSingle());
	}

@When("Choose pickup point -Sholinganallur")
public void choose_pickup_point_sholinganallur() {
 click(ma.getSerachmore1());
 click(ma.getSholinganallur());
}

@When("Choose pickup time as 6pm t0 11pm")
public void choose_pickup_time_as_6pm_t0_11pm() {
	click(ma.getPickuptime());
}

@When("Choose TravelOperators- Intr SmartBus and Parveen Travels")
public void choose_travel_operators_intr_smart_bus_and_parveen_travels() {
	click(ma.getIntercity());
   
}

@When("Choose drop point - Lal Bagh")
public void choose_drop_point_lal_bagh() {

click(ma.getShowall2());
click(ma.getLalbag());
}

@Then("Get all Bus prices and print them in console")
public void get_all_bus_prices_and_print_them_in_console() {
	click(ma.getSearchbtn());
   ma.getAllBusPrices();
   
}

@Then("Choose the Cheapest bus and select any number of seats")
public void choose_the_cheapest_bus_and_select_any_number_of_seats() {
	implicitWait(5);
	click(ma.getCheapestPrice());
	click(ma.getCheapestSeat());
	implicitWait(10);
	click(ma.getRandomSeat1());
	click(ma.getContinuebtn());
}

@When("The user Enter travbellers deatails as {string} ,{string} and Gender")
public void the_user_enter_travbellers_deatails_as_and_gender(String string, String string2) {
  sendKeys(ma.getName(), string);
  sendKeys(ma.getAge(), string2);
  click(ma.getMale());

}

@When("Enter contact details as {string} and {string}")
public void enter_contact_details_as_and(String string, String string2) {
sendKeys(ma.getEmail(), string);
sendKeys(ma.getMobilenum(), string2);

}

@When("Select state as Tamil Nadu")
public void select_state_as_tamil_nadu() {
	click(ma.getDropdownState());
	click(ma.getdownState());
	click(ma.getConfirmCheck());
   
}

@Then("User clicks continue button, which will direct to payment page")
public void user_clicks_continue_button_which_will_direct_to_payment_page() {
click(ma.NoNeed());
	click(ma.getContnPaymentbtn());
implicitWait(20);

}

}