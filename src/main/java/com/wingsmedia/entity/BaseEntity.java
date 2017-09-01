package com.wingsmedia.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

/**
 * Created by HoaPham on 7/19/17.
 */

@MappedSuperclass
public class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Version
  private Integer version;

  @Column(name = "date_created")
  private Date createdDate;
  @Column(name = "date_updated")
  private Date updatedDate;

  public Integer getId() {
    return id;
  }

  public BaseEntity setId(Integer id) {
    this.id = id;
    return this;
  }

  @PrePersist
  public void beforeCreated() {
    if (createdDate == null) {
      createdDate = new Date(System.currentTimeMillis());
    }
    updatedDate = new Date(System.currentTimeMillis());
  }

  @PreUpdate
  public void beforeUpdate() {
    updatedDate = new Date(System.currentTimeMillis());
  }
}
