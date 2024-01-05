package com.payload;

public class TC5_PostAdminschedulePayload {
	public static String adminschedule () {
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
				+ "      \"operator\": \"dtgt\",\r\n"
				+ "      \"value\": 1685343600000\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"property\": \"startTime\",\r\n"
				+ "      \"operator\": \"dtlt\",\r\n"
				+ "      \"value\": 1685429940000\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"filterType\": \"and\"\r\n"
				+ "}\r\n"
				+ "";
	}

}



