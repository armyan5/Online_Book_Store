package com.book.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ForUserIsbnTests extends TestBase {

    @Test
    public void getBooksWithIsbn() {
        given()
                .contentType("application/json")
                .when()
                .get("foruserisbn/978-1-84743-083-3")
                .then()
                .assertThat().statusCode(200);

    }
}
