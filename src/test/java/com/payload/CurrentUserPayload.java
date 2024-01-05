package com.payload;

public class CurrentUserPayload {
	
	public static String user() {
		return "{\r\n"
				+ "  \"userId\": 1,\r\n"
				+ "  \"userName\": \"admin\",\r\n"
				+ "  \"firstName\": \"Administrator\",\r\n"
				+ "  \"lastName\": \"Mindpro\",\r\n"
				+ "  \"emailId\": \"anand@acinfotech.com\",\r\n"
				+ "  \"handPhoneNo\": \"\",\r\n"
				+ "  \"isActive\": \"Y\",\r\n"
				+ "  \"clientCode\": null,\r\n"
				+ "  \"canShareFiles\": \"N\",\r\n"
				+ "  \"canUploadFiles\": \"Y\",\r\n"
				+ "  \"canDownloadFiles\": \"N\",\r\n"
				+ "  \"canPrintFiles\": \"N\"\r\n"
				+ "}";
		
	}

}
