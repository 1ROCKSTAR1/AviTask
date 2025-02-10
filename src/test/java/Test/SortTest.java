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

        List<String> goodsAfterSortingByStream = new GoodsPage(getDriver())
                .getFirstActualListOfLocatorsAndSortFromHighToLow();

        GoodsPage someActionsOnGoodsPage = new GoodsPage(getDriver())
                .clickOnSortAndChooseFromHighToLow();

        List<String> goodsAfterSortingOnSite = new GoodsPage(getDriver())
                .getActualListOfLocatorsAfterSorting();

        Assert.assertEquals(goodsAfterSortingOnSite,goodsAfterSortingByStream);
    }

    @Test
    @Description("Тест для проверки сортировки по возрастанию цены")
    public void sortedFromLowToHigh() {

        List<String> goodsAfterSortingByStream = new GoodsPage(getDriver())
                .getFirstActualListOfLocatorsAndSortFromLowToHigh();

        GoodsPage someActionsOnGoodsPage = new GoodsPage(getDriver())
                .clickOnSortAndChooseFromLowToHigh();

        List<String> goodsAfterSortingOnSite = new GoodsPage(getDriver())
                .getActualListOfLocatorsAfterSorting();

        Assert.assertEquals(goodsAfterSortingOnSite,goodsAfterSortingByStream);
    }
}
