package com.api.gateway.Response;

import lombok.Data;

@Data
public class SuccessRestResponse {

	private boolean success;

	private long timestamp;

	private Object data;

}
