package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Comparator;
import java.util.List;

public class GoodsPage extends BasePage {

    @FindBy(xpath = "//h4//following::div[2]")
    private List<WebElement> items;

    @FindBy(xpath = "//div[@class='css-1cickmn'][1]/a/div/div/div[2]")
    private WebElement firstItemPrice;

    @FindBy(xpath = "//div[@class='css-1cickmn'][2]/a/div/div/div[2]")
    private WebElement secondItemPrice;

    @FindBy(xpath = "//div[@class='css-1cickmn'][3]/a/div/div/div[2]")
    private WebElement thirdItemPrice;

    @FindBy(xpath = "//div[@class='css-1cickmn'][4]/a/div/div/div[2]")
    private WebElement fourthItemPrice;

    @FindBy(xpath = "//div[@class='css-1cickmn'][5]/a/div/div/div[2]")
    private WebElement fifthItemPrice;

    @FindBy(xpath = "//button[@id='menu-button-:rh:']")
    private WebElement sortPriceButton;

    @FindBy(xpath = "//button[contains(text(),'По убыванию')]")
    private WebElement sortFromHighToLowButton;

    @FindBy(xpath = "//button[contains(text(),'По возрастанию')]")
    private WebElement sortFromLowToHighButton;

    public GoodsPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getAndSortPricesLowHigh() {
        getWait5().until(ExpectedConditions.visibilityOfAllElements(items));
        return items.stream()
                .map(x -> x.getText().replaceAll("\\D", ""))
                .sorted()
                .toList();
    }

    public List<String> getAndSortPricesHighLow() {
        getWait5().until(ExpectedConditions.visibilityOfAllElements(items));
        return items.stream()
                .map(x -> x.getText().replaceAll("\\D", ""))
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public List<String> getPricesAfterSorting() {
        getWait5().until(ExpectedConditions.visibilityOfAllElements(items));
        return items.stream()
                .map(x -> x.getText().replaceAll("\\D", ""))
                .sorted()
                .toList();
    }

    public void clickOnSortAndChooseFromHighToLow() {
        getWait5().until(ExpectedConditions.visibilityOf(sortPriceButton)).click();
        getWait5().until(ExpectedConditions.visibilityOf(sortFromHighToLowButton)).click();
    }

    public void clickOnSortAndChooseFromLowToHigh() {
        getWait5().until(ExpectedConditions.visibilityOf(sortPriceButton)).click();
        getWait5().until(ExpectedConditions.visibilityOf(sortFromLowToHighButton)).click();
    }
}

