package Test;

import Base.BaseTest;
import Page.GoodsPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PagiTest extends BaseTest {

    @Test
    @Description("Тест проверяющий пагинацию 5")
     public void pagi5Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 5);
    }

    @Test
    @Description("Тест проверяющий пагинацию 10")
    public void pagi10Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .clickOnMainPagiButton()
                .clickOn10PagiButton()
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 10);
    }

    @Test
    @Description("Тест проверяющий пагинацию 15")
    public void pagi15Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .clickOnMainPagiButton()
                .clickOn15PagiButton()
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 15);
    }

    @Test
    @Description("Тест проверяющий пагинацию 20")
    public void pagi20Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .clickOnMainPagiButton()
                .clickOn20PagiButton()
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 20);
    }

    @Test
    @Description("Тест проверяющий пагинацию 25")
    public void pagi25Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .clickOnMainPagiButton()
                .clickOn25PagiButton()
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 25);
    }
}
