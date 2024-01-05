package com.payload;

public class TC4_SearchingUserPayload {
	
	public static String searchingUser() {
		return "{\r\n"
				+ "  \"sort\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"userName\",\r\n"
				+ "      \"dir\": \"ASC\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"filters\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"userName\",\r\n"
				+ "      \"operator\": \"startw\",\r\n"
				+ "      \"value\": \"sandeep\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}\r\n"
				+ "";
	}

}
