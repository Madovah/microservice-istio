package com.mrizzi.microservice.order.logic;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;

public class CustomErrorResponse implements ErrorResponse {
    private HttpStatus status;
    private ProblemDetail problemDetail;
    public CustomErrorResponse(String message) {
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        this.problemDetail = ProblemDetail.forStatus(this.status);
        this.problemDetail.setDetail(message);
    }
    @Override
    public HttpStatusCode getStatusCode() {
        return null;
    }

    @Override
    public ProblemDetail getBody() {
        return null;
    }
}
