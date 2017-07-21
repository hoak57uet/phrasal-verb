package com.wingsmedia.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by HoaPham on 7/19/17.
 */

@MappedSuperclass
public class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  public Integer getId() {
    return id;
  }

  public BaseEntity setId(Integer id) {
    this.id = id;
    return this;
  }
}
