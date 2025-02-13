package Page;

import Base.BasePage;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdvPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Название']")
    private WebElement advNameField;

    @FindBy(xpath = "//input[@placeholder='Цена']")
    private WebElement advPriceField;

    @FindBy(xpath = "//input[@placeholder='Описание']")
    private WebElement advDescriptionField;

    @FindBy(xpath = "//input[@placeholder='URL изображения']")
    private WebElement advLinkImageField;

    @FindBy(xpath = "//header[contains(text(),'Создать объявление')]")
    private WebElement createAdvModalWindow;

    @FindBy(xpath = "//button[contains(text(),'Сохранить')]")
    private WebElement saveAdvButton;


    public AdvPage(WebDriver driver) {
        super(driver);
    }

    public AdvPage fillAdvNameFieldDP(String s) {
        Allure.step("Заполнение поля Название с DataProvider");
        getWait2().until(ExpectedConditions.visibilityOf(advNameField)).sendKeys(s);
        return this;
    }
    public AdvPage fillAdvPriceFieldDP(String s) {
        Allure.step("Заполнение поля Цена с DataProvider");
        getWait2().until(ExpectedConditions.visibilityOf(advPriceField)).sendKeys(s);
        return this;
    }
    public AdvPage fillAdvDescFieldDP(String s) {
        Allure.step("Заполнение поля Описание с DataProvider");
        getWait2().until(ExpectedConditions.visibilityOf(advDescriptionField)).sendKeys(s);
        return this;
    }

    public AdvPage fillAdvPicURLFieldDP(String s) {
        Allure.step("Заполнение поля Ссылка на изображение с DataProvider");
        getWait2().until(ExpectedConditions.visibilityOf(advLinkImageField)).sendKeys(s);
        return this;
    }

    public boolean isModalCreateShowed() {
        return getWait2().until(ExpectedConditions.invisibilityOf(createAdvModalWindow)).booleanValue();

    }

    public AdvPage fillAdvNameField() {
        Allure.step("Заполнение поля Название");
        getWait2().until(ExpectedConditions.visibilityOf(advNameField)).sendKeys("Advertisement");
        return this;
    }

    public AdvPage fillAdvPriceField() {
        Allure.step("Заполнение поля Цена");
        getWait2().until(ExpectedConditions.visibilityOf(advPriceField)).sendKeys("999");
        return this;
    }

    public AdvPage fillAdvDescField() {
        Allure.step("Заполнение поля Описание");
        getWait2().until(ExpectedConditions.visibilityOf(advDescriptionField)).sendKeys("Some description");
        return this;
    }

    public AdvPage fillAdvPicURLField() {
        Allure.step("Заполнение поля Ссылка на изображение");
        getWait2().until(ExpectedConditions.visibilityOf(advLinkImageField)).sendKeys("https://example.com/image.jpg");
        return this;
    }

    public AdvPage clickOnSaveAdvButton() {
        getWait2().until(ExpectedConditions.visibilityOf(saveAdvButton)).click();
        return this;
    }
}
