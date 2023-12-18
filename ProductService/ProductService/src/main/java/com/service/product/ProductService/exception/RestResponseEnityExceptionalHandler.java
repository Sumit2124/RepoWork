package com.service.product.ProductService.exception;

import com.service.product.ProductService.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class RestResponseEnityExceptionalHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(ProductNotFoundException.class)
public ResponseEntity<ErrorResponse> handleException(ProductNotFoundException e)
    {
        ErrorResponse errorResponse = ErrorResponse.builder().errorMessage(e.getMessage()).errorCode(e.getErrorCode()).build();
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
