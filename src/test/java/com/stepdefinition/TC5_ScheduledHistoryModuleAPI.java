package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import com.base.BaseClassAPI;
import com.endpoints.Endpoints;
import com.payload.TC5_PostAdminschedulePayload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.Assert;


public class TC5_ScheduledHistoryModuleAPI extends BaseClassAPI{
	public static String xauthtoken ;
	
	
	
	@Given("User has used logToken as a  header")
	public void user_has_used_log_token_as_a_header() {
            xauthtoken = TC1_LoginModuleAPI.getXAuthToken();
			RestAssured.baseURI="http://192.169.198.7:8080/timebound";
			List<Header>ListHeader=new ArrayList<Header>();
			Header h1=new Header ("X-Auth-Token",xauthtoken);
		    Header h2=new Header("Content-Type","application/json");
		    ListHeader.add(h1);
		    ListHeader.add(h2);
		    Headers head =new Headers (ListHeader);
		    addHeaders(head);
		    }
	@When("User add request body to get Admin Schedule history")
	public void user_add_request_body_to_get_admin_schedule_history() {
		 addBody(TC5_PostAdminschedulePayload.adminschedule());
		 }

	@When("User Send {string} for Admin Schedule Endpoint")
	public void user_send_for_admin_schedule_endpoint(String string) {
		response = addReqType("POST" ,Endpoints.AdminScheduleHistory);
	    }

	@Then("User Verify the status code is {int}")
	public void user_verify_the_status_code_is(int expStatusCode) {
		String responseBody = response.getBody().asPrettyString();
		System.out.println(responseBody);
		int actStatusCode =TC1_LoginModuleAPI.globalData.setStatusCode(expStatusCode);
		Assert.assertEquals(200,actStatusCode,"Verify Status Code");
	  }
}