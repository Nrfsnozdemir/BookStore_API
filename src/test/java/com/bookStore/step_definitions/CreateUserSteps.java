package com.bookStore.step_definitions;

import com.bookStore.pages.ResponseApiPage;
import com.bookStore.utilities.BookStoreApiUtils;
import com.bookStore.utilities.ConfigurationReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CreateUserSteps {
    Response response;
    String requestUserName;
    String requestPassword;
    String responseUserID;
    String responseUserName;
    int responseStatusCode;
    List<Map<String,Object>> books;


    ResponseApiPage responsePage = new ResponseApiPage();

    @Before
    public void setUpRequest(){
        baseURI = ConfigurationReader.getProperty("baseUrl");
        basePath = ConfigurationReader.getProperty("apiUser");
    }


    @When("User sends a POST request to create user end point")
    public void user_sends_a_POST_request_to_create_user_end_point() {
        requestUserName = ConfigurationReader.getProperty("userName");

        // Below is our creating request to API
        response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(responsePage.getRequestBody())
                .when().post();
    }

    @When("User captures status code, userID, username and books information")
    public void user_captures_status_code_userID_username_information() {
        // We are de-serializing response object to get UserID
        Map<Object,Object> responseMap = response.as(Map.class);
        responseUserID = (String) responseMap.get("userID");
        BookStoreApiUtils.storeInfoToFile(responseUserID);
        responseStatusCode = response.statusCode();
        responseUserName = (String) responseMap.get("username");
        books = (List<Map<String,Object>>) responseMap.get("books");
    }

    @Then("Verifies status code username and userID is NOT null")
    public void verifies_status_code_username_and_userID_is_NOT_null() {
        assertEquals(201,responseStatusCode);
        assertEquals(requestUserName,responseUserName);
        assertNotNull(responseUserID);
        //  assertFalse(responseUserID == null); // same with below
        // assertTrue(responseUserID != null);

    }
}
