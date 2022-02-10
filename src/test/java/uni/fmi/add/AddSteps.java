package uni.fmi.add;

import static org.junit.Assert.assertEquals;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.add.model.AddScreenModel;

public class AddSteps {
	
	
	
	private AddScreenModel addModel;
	
	@Given("^Потребителя отваря екрана за добавяне на ново животно$")
	public void openAddScreen() throws Throwable {
		addModel = new AddScreenModel();
	}

	@When("^Въведе име на новото животно \"([^\"]*)\"$")
	public void addAnimalName(final String animalName) throws Throwable {
	    addModel.setAnimalName(animalName);
	}

	@When("^Въведе име на майката на животноно \"([^\"]*)\"$")
	public void addAnimalMomName(final String animalMomName) throws Throwable {
	    addModel.setAnimalMomName(animalMomName);
	}

	@When("^Въведе години на майката на животно \"([^\"]*)\"$")
	public void addMomAge(final String momAge) throws Throwable {
	    addModel.setMomAge(momAge);
	}

	@When("^Въведе последната дада на която майката е имала бебе \"([^\"]*)\"$")
	public void addLastBirth(final String LastBirth) throws Throwable {
	    addModel.setLastBirthAgo(LastBirth);
	}

	@When("^Въведе име на бащата на животноно \"([^\"]*)\"$")
	public void addAnimalDadName(final String animalDadName) throws Throwable {
	    addModel.setAnimalDadName(animalDadName);
	}

	@When("^Въведе години на бащата на животното \"([^\"]*)\"$")
	public void addDadAge(String dadAge) throws Throwable {
	    addModel.setDadAge(dadAge);
	}

	@When("^Натисне бутона за добавяне$")
	public void clickAddButton() throws Throwable {
	    addModel.clickAddButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void chekMessage(final String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, addModel.getMessage());
	}
}
