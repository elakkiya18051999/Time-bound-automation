package com.payload;

public class TC4_SeveralTimesPayload {
	public static String several () {
		return "{\r\n"
				+ "  \"sort\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"createdDate\",\r\n"
				+ "      \"dir\": \"DESC\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"filters\": []\r\n"
				+ "}\r\n"
				+ "";
	}

}
