package com.payload;

public class LogSearchPayload {
	public static String logsearch() {
		return "{\r\n"
				+ "  \"sort\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"startTime\",\r\n"
				+ "      \"dir\": \"DESC\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"filters\": [\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"startTime\",\r\n"
				+ "      \"operator\": \"dton\",\r\n"
				+ "      \"value\": 1691692200000\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"filterType\": \"and\"\r\n"
				+ "}";

}
}
