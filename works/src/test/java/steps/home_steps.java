package steps;

import base_classes.base_cl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class home_steps extends base_cl{

	@Given("I open the chrome browser")
	public void i_open_the_chrome_browser() {
	
		
	}
	

	@Given("I navigate toamazon page {string}")
	public void i_navigate_to_amazon_page(String string) {
	    
		
	}

	@When("Search for {string} in search box and press enter")
	public void search_for_in_search_box_and_press_enter(String string) {
	    
		
	}

	@When("Select Brand:")
	public void select_brand(DataTable dataTable) {
	    
		
	}

	@When("Select a variant {string}")
	public void select_a_variant(String string) {
	    
		
	}

	@When("Click Add to cart")
	public void click_add_to_cart() {
	    
		
	}

	@Then("Check the product has been added in cart")
	public void check_the_product_has_been_added_in_cart() {
	    
		
	}	
}