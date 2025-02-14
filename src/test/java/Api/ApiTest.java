package Api;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


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
}
