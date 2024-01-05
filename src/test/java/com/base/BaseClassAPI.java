package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassAPI {
	public static RequestSpecification reqSpec;
	public static Response response;
	

	public void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);
}

	public void addPathParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);
	}

	public void addqueryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);
	}

	public void addBody(String Body) {
		reqSpec = reqSpec.body(Body);
	}
	public Response addReqType(String type, String endPoint) {
		switch (type) {
		case "GET":
			response = reqSpec.log().all().get(endPoint);
			break;
			
		case "POST":
			response = reqSpec.log().all().post(endPoint);
			break;

		case "PUT":
			response = reqSpec.log().all().put(endPoint);
			break;
		case "PATCH":
			response = reqSpec.log().all().patch(endPoint);
			break;
			
		case "DELETE":
			response = reqSpec.log().all().delete(endPoint);
			break;
		}
		return response;
	}
	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;

	}
	public void addBasicAuth(String userName, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(userName, password);

	}
	public String getAsPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;

	}
	public void addHeaders(Headers headers) {
		reqSpec = RestAssured.given().headers(headers);
	}
	public void addBody(Object body) {
		reqSpec = reqSpec.body(body);
	}
	public static String getprojectpath() {
		String path = System.getProperty("user.dir");
		return path;
	}
	public static String getProjectPath() {
		return System.getProperty("user.dir");
} 
	public static String getPropertyFileValue(String Key) throws FileNotFoundException, IOException {
		Properties properties = new Properties(); 
		properties.load(new FileInputStream(getProjectPath()+"\\Config\\config.properties"));
		Object object = properties.get(Key);
		String value = (String) object;
		System.out.println(value);
		return value;

	}

}

	
	


