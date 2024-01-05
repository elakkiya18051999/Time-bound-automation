package com.stepdefinition;

import static io.restassured.RestAssured.given;

import com.payload.TC4_AddNewPayload;
import com.payload.TC4_AddOldPayload;
import com.payload.TC4_AssignedRolePayload;
import com.payload.TC4_CreateReportPayload;
import com.payload.TC4_OutputfilePayload;
import com.payload.TC4_PermissionPayload;
import com.payload.TC4_ReportPayload;
import com.payload.TC4_ReportsTilePayload;
import com.payload.TC4_RolePayload;
import com.payload.TC4_ScheduleButtonPayload;
import com.payload.TC4_SchedulesubmitPayload;
import com.payload.TC4_SearchPayload;
import com.payload.TC4_SearchingUserPayload;
import com.payload.TC4_SecureSchedulePayload;
import com.payload.TC4_SeveralTimesPayload;
import com.payload.TC4_UploadFilePayload;
import com.payload.TC4_UserPayload;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class TC4_ReportModuleAPI {
	public static String xauthtoken ;
	
	
	@Given("User adds header and send {string} request for Report view Response")
	public void user_adds_header_and_send_request_for_report_view_response(String string) {
		xauthtoken = TC1_LoginModuleAPI.getXAuthToken();
		RestAssured.baseURI="http://192.169.198.7:8080/timebound";
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_ReportsTilePayload.tile()).when().post("/api/v1/directory/1/report/search/tile-view?depth=0&limit=100&page=1")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	    }


	@Given("User adds header and send {string} request for folder directory Response")
	public void user_adds_header_and_send_request_for_folder_directory_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/directory/1556/directory").then().log().all()
		.assertThat().statusCode(200).extract().response().asString(); 
	    }

	@Given("User adds header and send {string} request for permissions Response")
	public void user_adds_header_and_send_request_for_permissions_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/object/33243/permission/role").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   }

	@Given("User adds header and send {string} request for old Assigned role response")
	public void user_adds_header_and_send_request_for_old_assigned_role_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_AssignedRolePayload.assigned()).when().post("/api/v1/role/search?page=1&limit=20")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	    }
	@Given("User adds header and send {string} request for Permission response")
	public void user_adds_header_and_send_request_for_permission_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_PermissionPayload.permission()).when().post("/api/v1/object/permission")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	    
	}

	

	@Given("User adds header and send {string} request for Report Type response")
	public void user_adds_header_and_send_request_for_report_type_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/report-type").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	
	@Given("User adds header and send {string} request for Edit Report response")
	public void user_adds_header_and_send_request_for_edit_report_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/report/33243/dynamic-values").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User adds header and send {string} request for New Timebound Edit Report response")
	public void user_adds_header_and_send_request_for_new_timebound_edit_report_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get(" api/v1/report/3274/dynamic-values").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User adds header and send {string} request for Role Reponse")
	public void user_adds_header_and_send_request_for_role_reponse(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/object/33243/permission/role").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User adds header and send {string} request for User Reponse")
	public void user_adds_header_and_send_request_for_user_reponse(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_RolePayload.role()).when().post("/api/v1/directory/33079/report")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	    
	}

	@Given("User adds header and send {string} request for Searching Reponse")
	public void user_adds_header_and_send_request_for_searching_reponse(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_SearchingUserPayload.searchingUser()).when().post("/api/v1/user/search?page=1&limit=20")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	  
	}

	@Given("User adds header and send {string} request for Assigning Permission Reponse")
	public void user_adds_header_and_send_request_for_assigning_permission_reponse(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_SearchingUserPayload.searchingUser()).when().post("/api/v1/user/search?page=1&limit=20")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User adds header and send {string} request for Search Reponse")
	public void user_adds_header_and_send_request_for_search_reponse(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_SearchPayload.search()).when().post("/api/v1/directory/1/report/search/list-view?depth=1&limit=250&page=1")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User adds header and send {string} request for Execute Report Reponse")
	public void user_adds_header_and_send_request_for_execute_report_reponse(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/report/3274/parameters").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    }

	@Given("User adds header and send {string} request for Submit Reponse")
	public void user_adds_header_and_send_request_for_submit_reponse(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_SearchPayload.search()).when().post("api/v1/report/33595/birt/run")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	}

	
	@Given("User adds header and send {string} request for data form response")
	public void user_adds_header_and_send_request_for_data_form_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/schedule/form/defaults/17510").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User adds header and send {string} request for Report response")
	public void user_adds_header_and_send_request_for_report_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_ReportPayload.report()).when().post("/api/v1/report/17510/schedule/search?limit=2&page=1")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	   
	}

	@Given("User adds header and send {string} request for schedule button response")
	public void user_adds_header_and_send_request_for_schedule_button_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_ScheduleButtonPayload.scheduleButton()).when().post("/api/v1/report/6086/schedule")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	    
	}

	@Given("User adds header and send {string} request for secure schedule  response")
	public void user_adds_header_and_send_request_for_secure_schedule_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_SecureSchedulePayload.secure()).when().post("/api/v1/report/6086/schedule/search?limit=2&page=1")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	    
	}

	@Given("User adds header and send {string} request for export type response")
	public void user_adds_header_and_send_request_for_export_type_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/report/6086/parameters").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    }

	@Given("User adds header and send {string} request for Schedule submit response")
	public void user_adds_header_and_send_request_for_schedule_submit_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_SchedulesubmitPayload.schedule()).when().post("/api/v1/report/6086/schedule")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	    
	}

	@Given("User adds header and send {string} request for all output file  response")
	public void user_adds_header_and_send_request_for_all_output_file_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_OutputfilePayload.outputFile()).when().post("/api/v1/report/17510/output/search?depth=0&limit=250&page=1")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User adds header and send {string} request for Report catalog information response")
	public void user_adds_header_and_send_request_for_report_catalog_information_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/report/17510/catalogue/information").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    }

	@Given("User adds header and send {string} request for Report  information response")
	public void user_adds_header_and_send_request_for_report_information_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken)
		.when().get("/api/v1/report/17510/information").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	    }

	@Given("User adds header and send {string} request for User response")
	public void user_adds_header_and_send_request_for_user_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_UserPayload.user()).when().post("/api/v1/report/17510/who-else-uses/search?limit=5&page=1")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	   
	}

	@Given("User adds header and send {string} request for several times  response")
	public void user_adds_header_and_send_request_for_several_times_response(String string) {
		given().log().all().header("X-Auth-Token",xauthtoken).contentType("application/json")
		.body(TC4_SeveralTimesPayload.several()).when().post("/api/v1/report/17510/specification/search?limit=1&page=1")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();   
	}

	



}
