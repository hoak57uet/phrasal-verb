package com.wingsmedia.dto;

/**
 * Created by HoaPham on 7/19/17.
 */

public class ResponseDTO<T> {
  String code = "SUCCESS";
  T data;
  private ErrorDTO errorDTO;

  public ResponseDTO() {
  }

  public ResponseDTO(String code, T data, ErrorDTO errorDTO) {
    this.code = code;
    this.data = data;
    this.errorDTO = errorDTO;
  }

  public ResponseDTO(T data) {
    this.data = data;
  }

  public String getCode() {
    return code;
  }

  public ResponseDTO setCode(String code) {
    this.code = code;
    return this;
  }

  public T getData() {
    return data;
  }

  public ResponseDTO setData(T data) {
    this.data = data;
    return this;
  }

  public ErrorDTO getErrorDTO() {
    return errorDTO;
  }

  public ResponseDTO setErrorDTO(ErrorDTO errorDTO) {
    this.errorDTO = errorDTO;
    return this;
  }
}
