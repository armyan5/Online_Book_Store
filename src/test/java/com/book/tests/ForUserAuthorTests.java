package com.book.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ForUserAuthorTests extends TestBase{

    @Test
    public void allBooksWithAuthor() {
        given()
                .contentType("application/json")
                .when()
                .get("foruserauthor/Herman Melville")
                .then()
                .assertThat().statusCode(200);
    }

}
