package com.qa.rest.tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;



import static io.restassured.RestAssured.*;

public class GetByGipCode extends TestBase {
private String ZipCode = "75006";
private String Country = "us";
private String APP_ID;

public GetByGipCode() {
		super();
		APP_ID = getAPP_ID();
	}
@Test
public void Happy_Path_For_ZipCode() {
	given()
		.queryParam("zip", ZipCode+","+Country)
		.queryParam("APPID", APP_ID).
	when().
        get(getApplicationUrl()).
    then().
	    assertThat().
	    statusCode(200);
}
}
