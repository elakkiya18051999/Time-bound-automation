package com.stepdefinition;

import static io.restassured.RestAssured.given;

import com.base.BaseClassAPI;
import com.globaldatas.GlobalData;
import com.payload.CurrentUserPayload;
import com.payload.LogSearchPayload;
import com.payload.LoginPayload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class TC1_LoginModuleAPI extends BaseClassAPI{
	public static String xauthtoken ;
	static GlobalData globalData=new GlobalData();
	
	public static String getXAuthToken() {
        return xauthtoken;
	}
	
	@Given("User adds header and send {string} request")
	public void user_adds_header_and_send_request(String string) {
		RestAssured.baseURI="http://192.169.198.7:8080/timebound";
		String response=given().log().all().header("Content-Type","application/json")
		.body(LoginPayload.login()).when().post("/api/user/authenticate").then().assertThat
		().statusCode(200).extract().response().asString();			
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		xauthtoken = js.getString("token");
        System.out.println("Token: " + xauthtoken);
	   }
	@Given("User has obtained the token and send {string} Config request")
	public void user_has_obtained_the_token_and_send_config_request(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).when().get("/api/v1/user/config").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   }

	@Given("User has obtained the token and send {string} CurrentUser request")
	public void user_has_obtained_the_token_and_send_current_user_request(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.body(CurrentUserPayload.user()).when().post("/api/v1/current/user").then()
		.assertThat().statusCode(200).extract().response().asString();
	   }

	@Given("User has add token as header and send {string} Menulist request")
	public void user_has_add_token_as_header_and_send_menulist_request(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/menus").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	}

	@Given("User has added as xauth and send {string} Countlist  request")
	public void user_has_added_as_xauth_and_send_countlist_request(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/inbox/approval/count").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();   
	}

	@Given("User has obtained the token and send {string} Directorylist Response")
	public void user_has_obtained_the_token_and_send_directorylist_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/directory/0/directory").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	 
	}

	@Given("User has added as header and send {string} AuthorizationID Response")
	public void user_has_added_as_header_and_send_authorization_id_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/directory/1/directory").then().log().all()
		.assertThat().statusCode(200).extract().response().asString(); 
	   }

	@Given("User has added header and {string} logsearch payload")
	public void user_has_added_header_and_logsearch_payload(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(LogSearchPayload.logsearch()).when().post("/api/v1/job-logs/search?limit=250&page=1").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
		
	}

	        
	    

	
	
}