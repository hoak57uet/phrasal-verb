package com.wingsmedia.exception;

import com.wingsmedia.dto.ErrorDTO;
import com.wingsmedia.dto.ResponseDTO;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by HoaPham on 7/19/17.
 */

@RestControllerAdvice
public class ExceptionController {
  @ExceptionHandler(Exception.class)
  public ResponseDTO exceptionHandler(Exception ex) {
    return new ResponseDTO().setCode("ERROR")
        .setErrorDTO(new ErrorDTO(Response.SC_INTERNAL_SERVER_ERROR, ex.getMessage()));
  }
}
