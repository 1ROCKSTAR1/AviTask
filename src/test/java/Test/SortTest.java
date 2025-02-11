package Test;

import Base.BaseTest;
import Page.GoodsPage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SortTest extends BaseTest {

    @Test
    @Description("Тест для проверки сортировки по убыванию цены")
    public void sortedFromHighToLow() {

        GoodsPage goodsPage = new GoodsPage(getDriver());
        List<String> goodsAfterSortingByStream = goodsPage.getAndSortPricesHighLow();

        goodsPage.clickOnSortAndChooseFromHighToLow();

        List<String> goodsAfterSortingOnSite = goodsPage.getPricesAfterSorting();

        Assert.assertEquals(goodsAfterSortingOnSite, goodsAfterSortingByStream);
    }

    @Test
    @Description("Тест для проверки сортировки по возрастанию цены")
    public void sortedFromLowToHigh() {

        GoodsPage goodsPage = new GoodsPage(getDriver());
        List<String> goodsAfterSortingByStream = goodsPage.getAndSortPricesLowHigh();

        goodsPage.clickOnSortAndChooseFromLowToHigh();

        List<String> goodsAfterSortingOnSite = goodsPage.getPricesAfterSorting();

        Assert.assertEquals(goodsAfterSortingOnSite, goodsAfterSortingByStream);
    }

}