package com.wingsmedia.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by HoaPham on 8/1/17.
 */

@Entity
@Table(name = "facebook_token")
public class FacebookToken extends BaseEntity {
  private String token;

  public String getToken() {
    return token;
  }

  public FacebookToken setToken(String token) {
    this.token = token;
    return this;
  }
}
