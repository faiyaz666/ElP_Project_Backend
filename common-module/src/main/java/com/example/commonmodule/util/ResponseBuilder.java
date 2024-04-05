package com.example.commonmodule.util;


import com.example.commonmodule.model.CustomHttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class ResponseBuilder {

    public static ResponseEntity<CustomHttpResponse> buildSuccessResponse(HttpStatus httpStatus,
                                                                          Map<String, Object> responseBody) {
        CustomHttpResponse successResponse = CustomHttpResponse
                .builder()
                .httpStatus(httpStatus)
                .responseBody(responseBody)
                .build();
        return new ResponseEntity<>(successResponse, httpStatus);
    }

    public static ResponseEntity<CustomHttpResponse> buildFailureResponse(HttpStatus httpStatus,
                                                                          String customErrorCode,
                                                                          String errorMessage) {
        CustomHttpResponse errorResponse = CustomHttpResponse
                .builder()
                .httpStatus(httpStatus)
                .customErrorCode(customErrorCode)
                .errorMessage(errorMessage)
                .build();
        return new ResponseEntity<>(errorResponse, httpStatus);
    }
}
