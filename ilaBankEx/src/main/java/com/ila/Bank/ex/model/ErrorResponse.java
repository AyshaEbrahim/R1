package com.ila.Bank.ex.model;

import java.util.Date;
import java.util.List;

public class ErrorResponse {

	//General error message about nature of error
    private String message;
    private String statusCode;
    private Date time;
 
    //Specific errors in API request processing
    private List<String> details;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

	public ErrorResponse(String message, String statusCode, List<String> details) {
		this.message = message;
		this.statusCode = statusCode;
		this.details = details;
		this.time = new Date();
	}

	public ErrorResponse() {

	}

}
