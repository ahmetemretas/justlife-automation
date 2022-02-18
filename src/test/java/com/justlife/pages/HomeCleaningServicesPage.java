package com.justlife.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeCleaningServicesPage extends BasePage{

    @FindBy(xpath = "//*[@for='frequencyItem1']")
    public WebElement oneTime;

    @FindBy(xpath = "//*[@for='frequencyItem3']")
    public WebElement biWeekly;

    @FindBy(xpath = "//*[@for='frequencyItem2']")
    public WebElement weekly;

    @FindBy(xpath = "(//p[@class='body-text-item has-text-black87 has-text-right'])[1]")
    public WebElement frequency;

    @FindBy(xpath = "(//p[@class='body-text-item has-text-black87 has-text-right'])[2]")
    public WebElement duration;

    @FindBy(xpath = "(//p[@class='body-text-item has-text-black87 has-text-right'])[3]")
    public WebElement numberOfProfessionals;

    @FindBy(xpath = "(//p[@class='body-text-item has-text-black87 has-text-right'])[4]")
    public WebElement material;

    @FindBy(xpath = "(//p[@class='body-text-item has-text-black87 has-text-right'])[4]")
    public WebElement date;

    @FindBy(xpath = "(//p[@class='body-text-item has-text-black87 has-text-right'])[4]")
    public WebElement startTime;

    @FindBy(xpath = "//footer/div/button")
    public WebElement nextButton;

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='button is-rounded is-uppercase has-text-white has-text-weight-bold confirmButton is-fullwidth is-uppercase has-text-centered has-text-white is-secondary']")
    public WebElement confirmLocation;

    @FindBy(id = "attributeduration2")
    public WebElement twoHours;

    @FindBy(id = "attributeduration3")
    public WebElement threeHours;

    @FindBy(id = "attributeduration4")
    public WebElement fourHours;

    @FindBy(id = "attributeduration5")
    public WebElement fiveHours;

    @FindBy(id = "attributeduration6")
    public WebElement sixHours;

    @FindBy(id = "attributeduration7")
    public WebElement sevenHours;

    @FindBy(id = "attributeduration8")
    public WebElement eightHours;

    @FindBy(id = "attributenumber_of_cleaners1")
    public WebElement oneProf;

    @FindBy(id = "attributenumber_of_cleaners2")
    public WebElement twoProf;

    @FindBy(id = "attributenumber_of_cleaners3")
    public WebElement threeProf;

    @FindBy(id = "attributenumber_of_cleaners4")
    public WebElement fourProf;

    @FindBy(xpath = "//div[@id='attributematerial0']/*[@class='button oval-selectable-item is-primary en']")
    public WebElement noMaterial;

    @FindBy(xpath = "//div[@id='attributematerial1']/*[@class='button oval-selectable-item has-text-alternate en']")
    public WebElement yesMaterial;

    @FindBy(xpath = "//*[@class='textarea']")
    public WebElement specificInstructions;

    @FindBy(xpath = "//div[@class='card']/div/div/p[@class='body-text-item has-text-black87']")
    public WebElement address;

    @FindBy(xpath = "(//div[@class='is-flex day-item en'])[2]")
    public WebElement today;

    @FindBy(xpath = "(//div[@id='date-items']//*[@class='button oval-selectable-item has-text-alternate en'])[1]")
    public WebElement tomorrow;

    @FindBy(xpath = "(//*[@class='time-wrapper with-chip'])[3]")
    public WebElement nineAM;

    @FindBy(xpath = "(//*[@class='fas fa-chevron-down'])[2]")
    public WebElement dialingCodes;

    @FindBy(xpath = "//input[@class='text-field-type-1 flag-x4 has-shadow has-flag']")
    public WebElement numberBox;

    @FindBy(xpath = "//input[@class='text-field-type-1 has-text-black87 has-shadow']")
    public WebElement otpCodeBox;

    @FindBy(xpath = "(//button[contains(text(),'NEXT')])[1]")
    public WebElement covidNextButton;

    @FindBy(xpath = "//*[@for='paymentItem1']")
    public WebElement cash;

    @FindBy(xpath = "(//p[@class='title-text-item has-text-black87 en'])[1]")
    public WebElement confirmedMessage;

    @FindBy(xpath = "//*[@class='container']/div[@class='clickable-area']")
    public WebElement suggestedCleaner;

    @FindBy(xpath = "//*[@class='container is-active']/div[@class='clickable-area']")
    public WebElement autoAssignCleaner;

    @FindBy(xpath = "(//*[@class='item is-flex'])[3]")
    public WebElement Dubai;

    @FindBy(xpath = "//*[@class='helper-text-item is-uppercase  has-text-black60']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='caption-text-item insuranceBadge has-text-danger']")
    public WebElement insuranceInfo;


}
