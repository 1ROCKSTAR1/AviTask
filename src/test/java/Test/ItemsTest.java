package Test;

import Base.BaseTest;
import Page.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemsTest extends BaseTest {

   @Test(priority = 1, description = "Sock Page's Check")
   @Epic("UI")
   @Feature("Items")
   @Description("Проверка названия товара (Носок) и описания на его странице")
   public void sockTest() {

       SocksPage socksPage = new GoodsPage(getDriver())
               .clickOnSocksIcon();

       Assert.assertEquals(socksPage.getSockTitle(),"Носок");
       Assert.assertEquals(socksPage.getSockDescription(),"Старый и любимый");
   }

    @Test(priority = 2, description = "Carpet Page's Check")
    @Epic("UI")
    @Feature("Items")
    @Description("Проверка названия товара (Ковер) и описания на его странице")
    public void carpetTest() {

        CarpetPage carpetPage = new GoodsPage(getDriver())
                .clickOnCarpetIcon();

        Assert.assertEquals(carpetPage.getCarpetTitle(),"Ковер");
        Assert.assertEquals(carpetPage.getCarpetDescription(),"Стильный модный, как у бабушки в деревне :)))");
    }

    @Test(priority = 3, description = "Cloak Page's Check")
    @Epic("UI")
    @Feature("Items")
    @Description("Проверка названия товара (Плащ невидимка) и описания на его странице")
    public void cloakTest() {

        CloakPage cloakPage = new GoodsPage(getDriver())
                .clickOnCloakIcon();

        Assert.assertEquals(cloakPage.getCloakTitle(),"Плащ невидимка");
        Assert.assertEquals(cloakPage.getCloakDescription(),"Почувствуйте себя героем известных произведений и игр");
    }

    @Test(priority = 4, description = "Bucket Page's Check")
    @Epic("UI")
    @Feature("Items")
    @Description("Проверка названия товара (Ведро снега) и описания на его странице")
    public void bucketTest() {

        BucketPage bucketPage = new GoodsPage(getDriver())
                .clickOnBucketIcon();

        Assert.assertEquals(bucketPage.getBucketTitle(),"Ведро снега");
        Assert.assertEquals(bucketPage.getBucketDescription(),"Последняя возможность купить по выгодной цене");
    }

    @Test(priority = 5, description = "Chair Page's Check")
    @Epic("UI")
    @Feature("Items")
    @Description("Проверка названия товара (Стул старинный) и описания на его странице")
    public void chairTest() {

        ChairPage chairPage = new GoodsPage(getDriver())
                .clickOnChairIcon();

        Assert.assertEquals(chairPage.getChairTitle(),"Стул старинный");
        Assert.assertEquals(chairPage.getChairDescription(),"Очень красивый");
    }
}
