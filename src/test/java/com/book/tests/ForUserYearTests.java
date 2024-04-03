package com.book.tests;

import com.book.dto.ForUserYearDto;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;



public class ForUserYearTests extends TestBase {

    ForUserYearDto year = ForUserYearDto.builder()
            .year("2000")
            .build();

    @Test
    public void getAllBooksWithYear() {
        given()
                .contentType("application/json")
                .when()
                .get("foruseryear/2000")
                .then()
                .assertThat().statusCode(200);

    }

}
