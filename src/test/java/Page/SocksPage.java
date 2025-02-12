package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SocksPage extends BasePage {

    @FindBy(xpath = "//h2[@class='chakra-heading css-1mr9o9q']")
    private WebElement sockTitle;

    @FindBy(xpath = "//p[@class='chakra-text css-i3jkqk']")
    private WebElement sockDescription;

    public SocksPage(WebDriver driver) {
        super(driver);
    }

    public String getSockTitle() {
        return getWait2().until(ExpectedConditions.visibilityOf(sockTitle)).getText();
    }

    public String getSockDescription() {
        return getWait2().until(ExpectedConditions.visibilityOf(sockDescription)).getText();
    }
}
