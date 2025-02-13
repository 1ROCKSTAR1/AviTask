package Page;

import Base.BasePage;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Comparator;
import java.util.List;

public class GoodsPage extends BasePage {

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

    @FindBy(xpath = "//div[@class='css-1cickmn']")
    private List<WebElement> itemsOfGoods;

    @FindBy(xpath = "//button[@id='menu-button-:r5:']")
    private WebElement pagiMainButton;

    @FindBy(xpath = "//img[@alt='Picture of Носок']")
    private WebElement socksIcon;

    @FindBy(xpath = "//img[@alt='Picture of Ковер']")
    private WebElement carpetIcon;

    @FindBy(xpath = "//img[@alt='Picture of Плащ невидимка']")
    private WebElement cloakIcon;

    @FindBy(xpath = "//img[@alt='Picture of Ведро снега']")
    private WebElement bucketIcon;

    @FindBy(xpath = "//img[@alt='Picture of Стул старинный']")
    private WebElement chairIcon;

    @FindBy(xpath = "//button[@type='button'][contains(text(),'Создать')]")
    private WebElement createNewAdvButton;

    public GoodsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getItemsOfGoods() {
        Allure.step("Получение списка товаров");
        getWait5().until(ExpectedConditions.visibilityOfAllElements(itemsOfGoods));
        return itemsOfGoods.stream()
                    .toList();
    }

    public List<String> getAndSortPricesLowHigh() {
        Allure.step("Получение списка с ценами на сайте и их эталонная сортировка low-high");
        getWait5().until(ExpectedConditions.visibilityOfAllElements(items));
        return items.stream()
                .map(x -> x.getText().replaceAll("\\D", ""))
                .sorted()
                .toList();
    }

    public List<String> getAndSortPricesHighLow() {
        Allure.step("Получение списка с ценами на сайте и их эталонная сортировка high-low");
        getWait5().until(ExpectedConditions.visibilityOfAllElements(items));
        return items.stream()
                .map(x -> x.getText().replaceAll("\\D", ""))
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public List<String> getPricesAfterSorting() {
        Allure.step("Получение списка с ценами после сортировки на сайте");
        getWait5().until(ExpectedConditions.visibilityOfAllElements(items));
        return items.stream()
                .map(x -> x.getText().replaceAll("\\D", ""))
                .toList();
    }

    public void clickOnSortAndChooseFromHighToLow() {
        Allure.step("Выполнение сортировки по убыванию");
        getWait5().until(ExpectedConditions.visibilityOf(sortPriceButton)).click();
        getWait5().until(ExpectedConditions.visibilityOf(sortFromHighToLowButton)).click();
    }

    public void clickOnSortAndChooseFromLowToHigh() {
        Allure.step("Выполнение сортировки по возрастанию");
        getWait5().until(ExpectedConditions.visibilityOf(sortPriceButton)).click();
        getWait5().until(ExpectedConditions.visibilityOf(sortFromLowToHighButton)).click();
    }

    public PagiPage clickOnMainPagiButton() {
        Allure.step("Клик по кнопке выбора пагинации");
        getWait5().until(ExpectedConditions.visibilityOf(pagiMainButton)).click();
        return new PagiPage(getDriver());
    }

    public SocksPage clickOnSocksIcon() {
        Allure.step("Клик по иконке товара");
        getWait5().until(ExpectedConditions.visibilityOf(socksIcon)).click();
        return new SocksPage(getDriver());
    }

    public CarpetPage clickOnCarpetIcon() {
        Allure.step("Клик по иконке товара");
        getWait5().until(ExpectedConditions.visibilityOf(carpetIcon)).click();
        return new CarpetPage(getDriver());
    }

    public CloakPage clickOnCloakIcon() {
        Allure.step("Клик по иконке товара");
        getWait5().until(ExpectedConditions.visibilityOf(cloakIcon)).click();
        return new CloakPage(getDriver());
    }

    public BucketPage clickOnBucketIcon() {
        Allure.step("Клик по иконке товара");
        getWait5().until(ExpectedConditions.visibilityOf(bucketIcon)).click();
        return new BucketPage(getDriver());
    }

    public ChairPage clickOnChairIcon() {
        Allure.step("Клик по иконке товара");
        getWait5().until(ExpectedConditions.visibilityOf(chairIcon)).click();
        return new ChairPage(getDriver());
    }

    public AdvPage clickOnCreateNewAdvButton() {
        Allure.step("Клик по кнопке Создать");
        getWait5().until(ExpectedConditions.visibilityOf(createNewAdvButton)).click();
        return new AdvPage(getDriver());
    }
}

