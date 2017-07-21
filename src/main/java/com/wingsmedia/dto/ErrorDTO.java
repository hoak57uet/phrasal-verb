package com.wingsmedia.dto;

/**
 * Created by HoaPham on 7/19/17.
 */

public class ErrorDTO {
  private int code;
  private String message;
  private Object data;

  public ErrorDTO(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public ErrorDTO setCode(int code) {
    this.code = code;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ErrorDTO setMessage(String message) {
    this.message = message;
    return this;
  }

  public Object getData() {
    return data;
  }

  public ErrorDTO setData(Object data) {
    this.data = data;
    return this;
  }
}
