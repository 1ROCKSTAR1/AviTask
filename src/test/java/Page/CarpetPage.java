package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarpetPage extends BasePage {

    @FindBy(xpath = "//h2[@class='chakra-heading css-1mr9o9q']")
    private WebElement carpetTitle;

    @FindBy(xpath = "//p[@class='chakra-text css-i3jkqk']")
    private WebElement carpetDescription;

    public CarpetPage(WebDriver driver) {
        super(driver);
    }

    public String getCarpetTitle() {
        return getWait2().until(ExpectedConditions.visibilityOf(carpetTitle)).getText();
    }

    public String getCarpetDescription() {
        return getWait2().until(ExpectedConditions.visibilityOf(carpetDescription)).getText();
    }
}
