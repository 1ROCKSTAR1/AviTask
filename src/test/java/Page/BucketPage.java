package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BucketPage extends BasePage {

    @FindBy(xpath = "//h2[@class='chakra-heading css-1mr9o9q']")
    private WebElement bucketTitle;

    @FindBy(xpath = "//p[@class='chakra-text css-i3jkqk']")
    private WebElement bucketDescription;

    public BucketPage(WebDriver driver) {
        super(driver);
    }

    public String getBucketTitle() {
        return getWait2().until(ExpectedConditions.visibilityOf(bucketTitle)).getText();
    }

    public String getBucketDescription() {
        return getWait2().until(ExpectedConditions.visibilityOf(bucketDescription)).getText();
    }
}
