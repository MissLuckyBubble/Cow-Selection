package uni.fmi.search;

import static org.junit.Assert.assertEquals;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.search.model.SearchScreenModel;

public class SearchSteps {
	
	private SearchScreenModel searchModel;

	@Given("^Потребителя отваря екрана за търсене$")
	public void openSearchScreen() throws Throwable {
	    searchModel = new SearchScreenModel();
	}

	@When("^въведе ID \"([^\"]*)\"$")
	public void enterID(String ID) throws Throwable {
	   searchModel.enterID(ID);
	}
	
	@When("^Въведе име : \"([^\"]*)\" в полето за име$")
	public void addName(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchModel.addName(name);
	}

	@When("^натисне бутона търесене$")
	public void clickSearchButton() throws Throwable {
	  searchModel.clickSearchButton();
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {

		assertEquals(expectedMessage, searchModel.getMessage());
	}
	
}
