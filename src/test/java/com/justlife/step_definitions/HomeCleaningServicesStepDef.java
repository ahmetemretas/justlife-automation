package com.justlife.step_definitions;

import com.justlife.pages.HomeCleaningServicesPage;
import com.justlife.utilities.BrowserUtils;
import com.justlife.utilities.ConfigurationReader;
import com.justlife.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomeCleaningServicesStepDef {

    HomeCleaningServicesPage homeCleaningServicesPage = new HomeCleaningServicesPage();

    @Given("User navigates the website")
    public void user_navigates_the_website() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
    }

    @When("User selects frequency {string}")
    public void user_selects_frequency(String frequency) {
        switch (frequency) {
            case "One-time":
                homeCleaningServicesPage.oneTime.click();
                break;
            case "Bi-weekly":
                homeCleaningServicesPage.biWeekly.click();
                break;
            case "Weekly":
                homeCleaningServicesPage.weekly.click();
                break;
            default:
                System.out.println("Not valid frequency");
                break;
        }
        Assert.assertEquals("frequency is not correct", frequency, homeCleaningServicesPage.frequency.getText());
        homeCleaningServicesPage.nextButton.click();
    }

    @When("User selects location {string}")
    public void user_selects_location(String location) {
        homeCleaningServicesPage.searchBox.sendKeys(location);
        BrowserUtils.waitFor(2);
        homeCleaningServicesPage.Dubai.click();
        BrowserUtils.waitFor(2);
        homeCleaningServicesPage.confirmLocation.click();
    }

    @When("User selects duration {string}")
    public void user_selects_duration(String duration) {
        switch (duration) {
            case "2 hours":
                homeCleaningServicesPage.twoHours.click();
                break;
            case "3 hours":
                homeCleaningServicesPage.threeHours.click();
                break;
            case "4 hours":
                homeCleaningServicesPage.fourHours.click();
                break;
            case "5 hours":
                homeCleaningServicesPage.fiveHours.click();
                break;
            case "6 hours":
                homeCleaningServicesPage.sixHours.click();
                break;
            case "7 hours":
                homeCleaningServicesPage.sevenHours.click();
                break;
            case "8 hours":
                homeCleaningServicesPage.eightHours.click();
                break;
            default:
                System.out.println("Not valid duration");
                break;
        }
        Assert.assertEquals("duration is not correct", duration, homeCleaningServicesPage.duration.getText());
    }

    @When("User selects number of cleaners {string}")
    public void user_selects_number_of_cleaners(String numofcleaners) {
        switch (numofcleaners) {
            case "1":
                homeCleaningServicesPage.oneProf.click();
                break;
            case "2":
                homeCleaningServicesPage.twoProf.click();
                break;
            case "3":
                homeCleaningServicesPage.threeProf.click();
                break;
            case "4":
                homeCleaningServicesPage.fourProf.click();
                break;
            default:
                System.out.println("Not valid number of cleaners");
                break;
        }
        Assert.assertEquals("number of cleaners is not correct", numofcleaners, homeCleaningServicesPage.numberOfProfessionals.getText());
    }

    @When("User selects materials {string}")
    public void user_selects_materials(String material) {
        switch (material) {
            case "No":
                homeCleaningServicesPage.noMaterial.click();
                BrowserUtils.waitFor(2);
                break;
            case "Yes":
                homeCleaningServicesPage.yesMaterial.click();
                BrowserUtils.waitFor(2);
                break;
            default:
                System.out.println("Not valid material selection");
                break;
        }
        Assert.assertEquals("material selection is not correct", material, homeCleaningServicesPage.material.getText());
    }

    @When("User indicates specific instructions {string}")
    public void user_indicates_specific_instructions(String instructions) {
        homeCleaningServicesPage.specificInstructions.sendKeys(instructions);
        BrowserUtils.waitFor(2);
        homeCleaningServicesPage.nextButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("User selects cleaner {string}")
    public void user_selects_cleaner(String cleaner) {
        switch (cleaner) {
            case "autoCleaner":

                break;
            case "suggestedCleaner":
                homeCleaningServicesPage.suggestedCleaner.click();
                break;
            default:
                System.out.println("not valid cleaner");
                break;
        }
    }


    @Given("User enters number and otp code")
    public void user_enters_number_and_otp_code() {
        homeCleaningServicesPage.numberBox.click();
        homeCleaningServicesPage.numberBox.sendKeys(ConfigurationReader.get("phoneNumber"));
        BrowserUtils.waitFor(2);

        homeCleaningServicesPage.otpCodeBox.sendKeys(ConfigurationReader.get("otpCode"));
        BrowserUtils.waitFor(2);
        homeCleaningServicesPage.covidNextButton.click();
    }


    @Given("User selects payment method {string}")
    public void user_selects_payment_method(String payment) {
        switch (payment) {
            case "cash":
                homeCleaningServicesPage.cash.click();
                BrowserUtils.waitFor(2);
                Assert.assertTrue("cash is not selected",homeCleaningServicesPage.insuranceInfo.isDisplayed());
                break;
            case "creditCard":
                // homeCleaningServicesPage.cash.click();
                break;
            default:
                System.out.println("not valid payment method");
                break;
        }
    }

    @Then("User confirm booking")
    public void user_confirm_booking() {
        BrowserUtils.waitFor(2);
        homeCleaningServicesPage.nextButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue("booking is not confirmed", homeCleaningServicesPage.confirmedMessage.isDisplayed());
    }

    @Given("User logins with valid cridentials")
    public void user_logins_with_valid_cridentials() {
        homeCleaningServicesPage.loginButton.click();
        homeCleaningServicesPage.numberBox.sendKeys("501234567");
        BrowserUtils.waitFor(3);
        homeCleaningServicesPage.otpCodeBox.sendKeys("4040");
        BrowserUtils.waitFor(2);
    }

    @When("User verifies location {string}")
    public void user_verifies_location(String string) {
        Assert.assertEquals("adress is not correct",ConfigurationReader.get("address"),homeCleaningServicesPage.address.getText());
    }

    @When("User selects date {string} and time {string}")
    public void user_selects_date_and_time(String date, String time) {
        switch (date) {
            case "tomorrow":
                homeCleaningServicesPage.tomorrow.click();
                break;
            case "ASAP":

                break;
            default:
                System.out.println("not valid date");
                break;
        }
        switch (time) {
            case "nineAM":
                homeCleaningServicesPage.nineAM.click();
                break;
            case "ASAP":

                break;
            default:
                System.out.println("not valid time");
                break;
        }
        homeCleaningServicesPage.nextButton.click();
        homeCleaningServicesPage.covidNextButton.click();
    }



}
