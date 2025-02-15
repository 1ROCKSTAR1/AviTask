package Api;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;

import static org.hamcrest.Matchers.*;


public class ApiTest {

    private static final String BASE_URL = "https://qa-internship.avito.com";

    @Epic("API")
    @org.testng.annotations.Test(testName = "Get adv")
    @Description(value = "Получить объявление по id")
    public void getItemTest() {

        String id = "0cd4183f-a699-4486-83f8-b513dfde477a";

        RestAssured.given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .get(BASE_URL + "/api/1/item/" + id)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }

    @Epic("API")
    @org.testng.annotations.Test(testName = "Post adv")
    @Description(value = "Создать объявление")
    public void createItemTest() {

        Statistics statistics = new Statistics(3, 123, 12);
        Product product = new Product(1234345231, "dsds", 1, statistics);

        RestAssured.given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .header("Accept",
                "application/json")
                .body(product)
                .post(BASE_URL + "/api/1/item")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }

    @Epic("API")
    @org.testng.annotations.Test(testName = "Get statistics adv")
    @Description(value = "Получить статистику по объявлению")
    public void getStatisticItemTest() {

        String id = "0cd4183f-a699-4486-83f8-b513dfde477a";

        RestAssured.given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .header("Accept",
                        "application/json")
                .get(BASE_URL + "/api/1/statistic/" + id)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }

    @Epic("API")
    @org.testng.annotations.Test(testName = "Get all seller's items")
    @Description(value = "Получить все items продавца")
    public void getItemsSellerTest() {

        String sellerId = "1234345231";

        RestAssured.given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .header("Accept",
                        "application/json")
                .get(BASE_URL + "/api/1/" + sellerId + "/item")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }

    @Epic("API")
    @org.testng.annotations.Test(testName = "Get all seller's items and check sellerId's")
    @Description(value = "Получить все items продавца и проверить sellersId's")
    public void checkSellerIdsInAllItemsTest() {

        final String trueSellerId = "1234345231";

        RestAssured.given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .header("Accept",
                        "application/json")
                .get(BASE_URL + "/api/1/" + trueSellerId + "/item")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("sellerId", Matchers.everyItem(equalTo(trueSellerId)));
    }
}
