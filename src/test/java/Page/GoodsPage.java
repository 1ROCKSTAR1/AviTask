package Page;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GoodsPage extends BasePage {

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

    public List<String> getFirstActualListOfLocatorsAndSortFromHighToLow() {
        List<String> firstActualList = new ArrayList<>();

        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(firstItemPrice)).getText());
        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(secondItemPrice)).getText());
        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(thirdItemPrice)).getText());
        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(fourthItemPrice)).getText());
        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(fifthItemPrice)).getText());

        return firstActualList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public List<String> getFirstActualListOfLocatorsAndSortFromLowToHigh() {
        List<String> firstActualList = new ArrayList<>();

        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(firstItemPrice)).getText());
        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(secondItemPrice)).getText());
        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(thirdItemPrice)).getText());
        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(fourthItemPrice)).getText());
        firstActualList.add(getWait5().until(ExpectedConditions.visibilityOf(fifthItemPrice)).getText());

        return firstActualList
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> getActualListOfLocatorsAfterSorting() {
        List<String> actualListAfterSortingOnSite = new ArrayList<>();

        actualListAfterSortingOnSite.add(getWait5().until(ExpectedConditions.visibilityOf(firstItemPrice)).getText());
        actualListAfterSortingOnSite.add(getWait5().until(ExpectedConditions.visibilityOf(secondItemPrice)).getText());
        actualListAfterSortingOnSite.add(getWait5().until(ExpectedConditions.visibilityOf(thirdItemPrice)).getText());
        actualListAfterSortingOnSite.add(getWait5().until(ExpectedConditions.visibilityOf(fourthItemPrice)).getText());
        actualListAfterSortingOnSite.add(getWait5().until(ExpectedConditions.visibilityOf(fifthItemPrice)).getText());

        return actualListAfterSortingOnSite;
    }

    public GoodsPage clickOnSortAndChooseFromHighToLow() {
        getWait5().until(ExpectedConditions.visibilityOf(sortPriceButton)).click();
        getWait5().until(ExpectedConditions.visibilityOf(sortFromHighToLowButton)).click();
        return this;
    }

    public GoodsPage clickOnSortAndChooseFromLowToHigh() {
        getWait5().until(ExpectedConditions.visibilityOf(sortPriceButton)).click();
        getWait5().until(ExpectedConditions.visibilityOf(sortFromLowToHighButton)).click();
        return this;
    }
}

