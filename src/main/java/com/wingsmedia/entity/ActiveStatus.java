package com.wingsmedia.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by HoaPham on 8/20/17.
 */

@Entity
@Table
public class ActiveStatus extends BaseEntity {
  String app;
  Boolean active;

  public String getApp() {
    return app;
  }

  public ActiveStatus setApp(String app) {
    this.app = app;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public ActiveStatus setActive(Boolean active) {
    this.active = active;
    return this;
  }
}
