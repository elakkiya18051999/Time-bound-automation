package com.stepdefinition;

import static io.restassured.RestAssured.given;

import com.payload.TC2_AuthorizationIDPayload;
import com.payload.TC2_ControlId;
import com.payload.TC2_DragandDropNewPayload;
import com.payload.TC2_DragandDropOldPayload;
import com.payload.TC2_LoadDataToWidget;
import com.payload.TC2_LogsPayload;
import com.payload.TC2_LogsResponsePayload;
import com.payload.TC2_Runs;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class TC2_MyDashboardModuleAPI {
	public static String xauthtoken ;

	
	
	@Given("User has added Token header and send {string} Widgets Response")
	public void user_has_added_token_header_and_send_widgets_response(String string) {
		
		 xauthtoken = TC1_LoginModuleAPI.getXAuthToken();
		RestAssured.baseURI="http://192.169.198.7:8080/timebound";
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/dashboard/widgets").then().log().all()
		.assertThat().statusCode(200).extract().response().asString(); 
	    
	}

	@Given("User has added Token header and send {string} Widget Master id Resposne")
	public void user_has_added_token_header_and_send_widget_master_id_resposne(String string) {
		
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/dashboard/widget-details/839").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User has added Token header and send {string} Logs Response")
	public void user_has_added_token_header_and_send_logs_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC2_LogsPayload.logs()).when().post("/api/v1/job-logs/search?limit=250&page=1").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User has added Token header and send {string} AuthorizationID Logs Response")
	public void user_has_added_token_header_and_send_authorization_id_logs_response(String string) {
		
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC2_AuthorizationIDPayload.idPayload()).when().post("/api/v1/dashboard/2238/logs").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	}

	@Given("User has added Token header and send {string} Load Data widget response")
	public void user_has_added_token_header_and_send_load_data_widget_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC2_LoadDataToWidget.loadData()).when().post("/api/v1/dashboard/controls/111/run").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User has added Token header and send {string} control id response")
	public void user_has_added_token_header_and_send_control_id_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC2_ControlId.control()).when().post("/api/v1/dashboard/controls/111/run").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User has added Token header and send {string} request and get run data response")
	public void user_has_added_token_header_and_send_request_and_get_run_data_response(String string) {
		
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC2_Runs.runsData()).when().post("/api/v1/dashboard/controls/4783/run?page=1&limit=10").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	    
	}

	@Given("User has added Token header and send {string} and get Logs  response")
	public void user_has_added_token_header_and_send_and_get_logs_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC2_LogsResponsePayload.logsresponse()).when().post("/api/v1/dashboard/33117/logs").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	   
	}

	@Given("User has added Token header and send {string} dashboard display data")
	public void user_has_added_token_header_and_send_dashboard_display_data(String string) {
		
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/dashboard/widget-details/33117").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	}

	

	@Given("User has added Token header and sends {string} Request of dashboard details of domain")
	public void user_has_added_token_header_and_sends_request_of_dashboard_details_of_domain(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/custom-reports/domains/dashboard").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User has added Token header and sends {string} Request of drag and drop metrics")
	public void user_has_added_token_header_and_sends_request_of_drag_and_drop_metrics(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC2_DragandDropOldPayload.old()).when().post("/api/v1/dashboard/controls/1307/run?page=1&limit=10").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	   
	}

	@Given("User has added Token header and sends {string} Request of drag and drop metrics new")
	public void user_has_added_token_header_and_sends_request_of_drag_and_drop_metrics_new(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC2_DragandDropNewPayload.newDrag()).when().post("/api/v1/dashboard/controls/213/run").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User has added Token header and sends {string} Request of available options in dropdown")
	public void user_has_added_token_header_and_sends_request_of_available_options_in_dropdown(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/dashboard/widget-details/6341").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	  
	}

	@Given("User has added Token header and sends {string} Request of available options in new dropdown")
	public void user_has_added_token_header_and_sends_request_of_available_options_in_new_dropdown(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/dashboard/widget-details/2238").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User has added Token header and sends {string} Request of metric list resposne")
	public void user_has_added_token_header_and_sends_request_of_metric_list_resposne(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/user-dashboard/widget/search/analysis").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	}


}
