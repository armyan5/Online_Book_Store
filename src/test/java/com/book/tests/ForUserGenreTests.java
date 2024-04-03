package com.book.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ForUserGenreTests extends TestBase{

    @Test
    public void getBooksWithGenre() {
        given()
                .contentType("application/json")
                .when()
                .get("forusergenre/Novel")
                .then()
                .assertThat().statusCode(200);
    }

}
