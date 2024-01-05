package com.stepdefinition;

import static io.restassured.RestAssured.given;

import com.payload.TC2_LogsPayload;
import com.payload.TC3_DomainClickingPayload;
import com.payload.TC3_WidgetControlNew;
import com.payload.TC3_WidgetControlPayload;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class TC3_DataDiscoveryModule {
	public static String xauthtoken ;
	
	
	@Given("User has added Token header and send {string} request for domain dropdown response")
	public void user_has_added_token_header_and_send_request_for_domain_dropdown_response(String string) {
		xauthtoken = TC1_LoginModuleAPI.getXAuthToken();
		RestAssured.baseURI="http://192.169.198.7:8080/timebound";
		
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/custom-reports/domains/dataDiscovery").then().log().all()
		.assertThat().statusCode(200).extract().response().asString(); 
	    }

	@Given("User has added Token header and send {string} request for domain clicking search response")
	public void user_has_added_token_header_and_send_request_for_domain_clicking_search_response(String string) {
	    
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC3_DomainClickingPayload.domain()).when().post(" /api/v1/datadiscovery/view/238/matrics?searchString=Reports&limit=250&page=1").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	}
	@Given("User has added Token header and send {string} request for Display records response")
	public void user_has_added_token_header_and_send_request_for_display_records_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("api/v1/user-dashboard/widget/search/Reports").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    }

	@Given("User has added Token header and send {string} request for Display the calls")
	public void user_has_added_token_header_and_send_request_for_display_the_calls(String string) {
		
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/user-dashboard/widget/search/call").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User has added Token header and send {string} request for Run widget old timebound response")
	public void user_has_added_token_header_and_send_request_for_run_widget_old_timebound_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/widget/details/1459").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User has added Token header and send {string} request for Run widget New timebound response")
	public void user_has_added_token_header_and_send_request_for_run_widget_new_timebound_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/widget/details/93").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User has added Token header and send {string} request for old widget details response")
	public void user_has_added_token_header_and_send_request_for_old_widget_details_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/dashboard/widget-details/1").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User has added Token header and send {string} request for New widget details response")
	public void user_has_added_token_header_and_send_request_for_new_widget_details_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/dashboard/widget-details/7814").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User has added Token header and send {string} request for old widget Controls response")
	public void user_has_added_token_header_and_send_request_for_old_widget_controls_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC3_WidgetControlPayload.oldWidget()).when().post("api/v1/dashboard/controls/1459/run?page=1&limit=10").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User has added Token header and send {string} request for New widget Controls response")
	public void user_has_added_token_header_and_send_request_for_new_widget_controls_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC3_WidgetControlNew.newWidget()).when().post("/api/v1/dashboard/controls/93/run").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

}
