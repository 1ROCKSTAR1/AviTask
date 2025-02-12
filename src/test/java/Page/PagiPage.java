package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PagiPage extends BasePage {

    @FindBy(xpath = "//button[@id='menu-list-:r5:-menuitem-:r6:']")
    private WebElement pagi5Button;

    @FindBy(xpath = "//button[@id='menu-list-:r5:-menuitem-:r7:']")
    private WebElement pagi10Button;

    @FindBy(xpath = "//button[@id='menu-list-:r5:-menuitem-:r8:']")
    private WebElement pagi15Button;

    @FindBy(xpath = "//button[@id='menu-list-:r5:-menuitem-:r9:']")
    private WebElement pagi20Button;

    @FindBy(xpath = "//button[@id='menu-list-:r5:-menuitem-:ra:']")
    private WebElement pagi25Button;

    public PagiPage(WebDriver driver) {
        super(driver);
    }

    public GoodsPage clickOn5PagiButton() {
        getWait5().until(ExpectedConditions.visibilityOf(pagi5Button)).click();
        return new GoodsPage(getDriver());
    }

    public GoodsPage clickOn10PagiButton() {
        getWait5().until(ExpectedConditions.visibilityOf(pagi10Button)).click();
        return new GoodsPage(getDriver());
    }

    public GoodsPage clickOn15PagiButton() {
        getWait5().until(ExpectedConditions.visibilityOf(pagi15Button)).click();
        return new GoodsPage(getDriver());
    }

    public GoodsPage clickOn20PagiButton() {
        getWait5().until(ExpectedConditions.visibilityOf(pagi20Button)).click();
        return new GoodsPage(getDriver());
    }

    public GoodsPage clickOn25PagiButton() {
        getWait5().until(ExpectedConditions.visibilityOf(pagi25Button)).click();
        return new GoodsPage(getDriver());
    }
}
