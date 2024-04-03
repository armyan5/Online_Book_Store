package com.book.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ForUserNameTests extends TestBase{

    @Test
    public void getAllBooksWithYear() {
        given()
                .contentType("application/json")
                .when()
                .get("forusername/Три товарища")
                .then()
                .assertThat().statusCode(200);

    }
}
