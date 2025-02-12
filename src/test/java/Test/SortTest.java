package Test;

import Base.BaseTest;
import Page.GoodsPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SortTest extends BaseTest {

    @Test(priority = 1, description = "Sorting high to low Check")
    @Epic("UI")
    @Feature("Sorting")
    @Description("Тест для проверки сортировки по убыванию цены")
    public void sortedFromHighToLow() {

        GoodsPage goodsPage = new GoodsPage(getDriver());
        List<String> goodsAfterSortingByStream = goodsPage.getAndSortPricesHighLow();

        goodsPage.clickOnSortAndChooseFromHighToLow();

        List<String> goodsAfterSortingOnSite = goodsPage.getPricesAfterSorting();

        Assert.assertEquals(goodsAfterSortingOnSite, goodsAfterSortingByStream);
    }

    @Test(priority = 2, description = "Sorting low to high Check")
    @Epic("UI")
    @Feature("Sorting")
    @Description("Тест для проверки сортировки по возрастанию цены")
    public void sortedFromLowToHigh() {

        GoodsPage goodsPage = new GoodsPage(getDriver());
        List<String> goodsAfterSortingByStream = goodsPage.getAndSortPricesLowHigh();

        goodsPage.clickOnSortAndChooseFromLowToHigh();

        List<String> goodsAfterSortingOnSite = goodsPage.getPricesAfterSorting();

        Assert.assertEquals(goodsAfterSortingOnSite, goodsAfterSortingByStream);
    }

}