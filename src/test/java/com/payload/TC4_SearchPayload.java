package com.payload;

public class TC4_SearchPayload {
	public static String search() {
		return "{\r\n"
				+ "  \"sort\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"reportType\",\r\n"
				+ "      \"dir\": \"ASC\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"authorizationName\",\r\n"
				+ "      \"dir\": \"ASC\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"filters\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"authorizationName\",\r\n"
				+ "      \"operator\": \"like\",\r\n"
				+ "      \"value\": \"sandeep\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"reportType\",\r\n"
				+ "      \"operator\": \"like\",\r\n"
				+ "      \"value\": \"sandeep\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"filterType\": \"or\"\r\n"
				+ "}\r\n"
				+ "";
	}

}
