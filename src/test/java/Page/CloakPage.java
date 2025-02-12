package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CloakPage extends BasePage {

    @FindBy(xpath = "//h2[@class='chakra-heading css-1mr9o9q']")
    private WebElement cloakTitle;

    @FindBy(xpath = "//p[@class='chakra-text css-i3jkqk']")
    private WebElement cloakDescription;

    public CloakPage(WebDriver driver) {
        super(driver);
    }

    public String getCloakTitle() {
        return getWait2().until(ExpectedConditions.visibilityOf(cloakTitle)).getText();
    }

    public String getCloakDescription() {
        return getWait2().until(ExpectedConditions.visibilityOf(cloakDescription)).getText();
    }

}
