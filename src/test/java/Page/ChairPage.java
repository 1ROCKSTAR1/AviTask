package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChairPage extends BasePage {

    @FindBy(xpath = "//h2[@class='chakra-heading css-1mr9o9q']")
    private WebElement chairTitle;

    @FindBy(xpath = "//p[@class='chakra-text css-r1bsln']")
    private WebElement chairDescription;

    public ChairPage(WebDriver driver) {
        super(driver);
    }

    public String getChairTitle() {
        return getWait2().until(ExpectedConditions.visibilityOf(chairTitle)).getText();
    }

    public String getChairDescription() {
        return getWait2().until(ExpectedConditions.visibilityOf(chairDescription)).getText();
    }
}
