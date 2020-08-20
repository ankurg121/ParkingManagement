package com.park.parkingmanagment.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResponseUtil {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ResponseEntity<ObjectResponse<Object>> returnFailedResponseStatus(final HttpStatus status, String msg) {
		Map errorMap = new HashMap<>();
		final ObjectResponse<Object> errorEndPointResponse = new ObjectResponse<>();
		errorMap.put("status", msg);
		errorEndPointResponse.setResponse(errorMap);
		errorEndPointResponse.setStatus(new StatusType("FAILURE", null));
		return ResponseEntity.status(status).body(errorEndPointResponse);

	}
}
