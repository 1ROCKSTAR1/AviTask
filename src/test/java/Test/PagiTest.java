package Test;

import Base.BaseTest;
import Page.GoodsPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PagiTest extends BaseTest {


    @Epic(value = "UI")
    @Feature(value = "Pagination")
    @Description("Тест проверяющий пагинацию 5")
    @Test(priority = 1, description = "Pagination 5's Check")
     public void pagi5Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 5);
    }


    @Epic(value = "UI")
    @Feature(value = "Pagination")
    @Description("Тест проверяющий пагинацию 10")
    @Test(priority = 2, description = "Pagination 10's Check")
    public void pagi10Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .clickOnMainPagiButton()
                .clickOn10PagiButton()
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 10);
    }


    @Epic(value = "UI")
    @Feature(value = "Pagination")
    @Description("Тест проверяющий пагинацию 15")
    @Test(priority = 3, description = "Pagination 15's Check")
    public void pagi15Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .clickOnMainPagiButton()
                .clickOn15PagiButton()
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 15);
    }


    @Epic(value = "UI")
    @Feature(value = "Pagination")
    @Description("Тест проверяющий пагинацию 20")
    @Test(priority = 4, description = "Pagination 20's Check")
    public void pagi20Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .clickOnMainPagiButton()
                .clickOn20PagiButton()
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 20);
    }


    @Epic(value = "UI")
    @Feature(value = "Pagination")
    @Description("Тест проверяющий пагинацию 25")
    @Test(priority = 5, description = "Pagination 25's Check")
    public void pagi25Test() {

        List<WebElement> actualListOfGoods = new GoodsPage(getDriver())
                .clickOnMainPagiButton()
                .clickOn25PagiButton()
                .getItemsOfGoods();

        Assert.assertEquals(actualListOfGoods.size(), 25);
    }
}
