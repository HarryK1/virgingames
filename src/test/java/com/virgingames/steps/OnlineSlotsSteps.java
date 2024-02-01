package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OnlineSlotsSteps {
    @When("I Click On {string} Tab")
    public void iClickOnOnlineSlotsTab(String menu) {
         new HomePage().selectTopMenu(menu);
        }



    @Then("I Verify Text {string}")
    public void iVerifyTextYourFavouriteOnlineSlotsAllInOnePlace(String text) {
        Assert.assertEquals(new OnlineSlotsPage().getTextOfYourFavouriteOnlineSlotsAllInOnePlace(), text);
    }
}
