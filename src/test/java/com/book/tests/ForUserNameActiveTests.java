package com.book.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ForUserNameActiveTests extends TestBase{

    @Test
    public void getActiveBooks() {
        given()
                .contentType("application/json")
                .when()
                .get("forusername/active")
                .then()
                .assertThat().statusCode(200);
    }

}
