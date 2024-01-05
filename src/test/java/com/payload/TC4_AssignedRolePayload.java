package com.payload;

public class TC4_AssignedRolePayload {
	
	public static String assigned() {
		return "{\r\n"
				+ "  \"sort\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"roleName\",\r\n"
				+ "      \"dir\": \"ASC\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"filters\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"roleName\",\r\n"
				+ "      \"operator\": \"startw\",\r\n"
				+ "      \"value\": \"user\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}\r\n"
				+ "";
	}
	

}
