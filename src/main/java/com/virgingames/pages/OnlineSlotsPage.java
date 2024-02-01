package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OnlineSlotsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Your Favourite Online Slots All in One Place']")
    WebElement onlineSlotsText;
    public String getTextOfYourFavouriteOnlineSlotsAllInOnePlace() {
        return getTextFromElement(onlineSlotsText);
    }

}
