package Test;

import Base.BaseTest;
import Page.GoodsPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewAdvTest extends BaseTest {

    @Epic(value = "UI")
    @Feature(value = "Creating a new adv")
    @Description("Проверка поля Название")
    @Test(priority = 1, description = "Adv Name DP Field's Check", dataProvider = "forNameField", dataProviderClass = DataProviders.class)
    public void advNameFieldTest(String option) {

        boolean invisible = true;

        boolean isShowed = new GoodsPage(getDriver())
                .clickOnCreateNewAdvButton()
                .fillAdvNameFieldDP(option)
                .fillAdvPriceField()
                .fillAdvDescField()
                .fillAdvPicURLField()
                .clickOnSaveAdvButton()
                .isModalCreateShowed();

        Assert.assertEquals(isShowed,invisible);
    }

    @Epic(value = "UI")
    @Feature(value = "Creating a new adv")
    @Description("Проверка поля Цена")
    @Test(priority = 2, description = "Adv Price DP Field's Check", dataProvider = "forPriceField", dataProviderClass = DataProviders.class)
    public void advPriceTest(String option) {

        boolean invisible = true;

        boolean isShowed = new GoodsPage(getDriver())
                .clickOnCreateNewAdvButton()
                .fillAdvNameField()
                .fillAdvPriceFieldDP(option)
                .fillAdvDescField()
                .fillAdvPicURLField()
                .clickOnSaveAdvButton()
                .isModalCreateShowed();

        Assert.assertEquals(isShowed,invisible);
    }

    @Epic(value = "UI")
    @Feature(value = "Creating a new adv")
    @Description("Проверка поля Описание")
    @Test(priority = 3, description = "Adv Desc DP Field's Check", dataProvider = "forDescField", dataProviderClass = DataProviders.class)
    public void advDescFieldTest(String option) {

        boolean invisible = true;

        boolean isShowed = new GoodsPage(getDriver())
                .clickOnCreateNewAdvButton()
                .fillAdvNameField()
                .fillAdvPriceField()
                .fillAdvDescFieldDP(option)
                .fillAdvPicURLField()
                .clickOnSaveAdvButton()
                .isModalCreateShowed();

        Assert.assertEquals(isShowed,invisible);
    }

    @Epic(value = "UI")
    @Feature(value = "Creating a new adv")
    @Description("Проверка поля Описание")
    @Test(priority = 4, description = "Adv URL Pic DP Field's Check", dataProvider = "imageUrlProvider", dataProviderClass = DataProviders.class)
    public void advURLPicFieldTest(String option) {

        boolean invisible = true;

        boolean isShowed = new GoodsPage(getDriver())
                .clickOnCreateNewAdvButton()
                .fillAdvNameField()
                .fillAdvPriceField()
                .fillAdvDescField()
                .fillAdvPicURLFieldDP(option)
                .clickOnSaveAdvButton()
                .isModalCreateShowed();

        Assert.assertEquals(isShowed,invisible);
    }
}
