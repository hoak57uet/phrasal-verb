package com.wingsmedia.entity.mytv;

import com.wingsmedia.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by HoaPham on 8/16/17.
 */
@Table(name = "tv_channel")
@Entity
public class Channel extends BaseEntity {
  String name;
  String link;
  String image;
  String description;
  @Column(name = "is_die")
  boolean isDie;
  @Column(name = "order_id")
  Integer orderId;

  @ManyToOne
  @JoinColumn(name = "group_id")
  TVCategory category;

  public String getName() {
    return name;
  }

  public Channel setName(String name) {
    this.name = name;
    return this;
  }

  public String getLink() {
    return link;
  }

  public Channel setLink(String link) {
    this.link = link;
    return this;
  }

  public String getImage() {
    return image;
  }

  public Channel setImage(String image) {
    this.image = image;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Channel setDescription(String description) {
    this.description = description;
    return this;
  }

  public boolean isDie() {
    return isDie;
  }

  public Channel setDie(boolean die) {
    isDie = die;
    return this;
  }

  public TVCategory getCategory() {
    return category;
  }

  public Channel setCategory(TVCategory category) {
    this.category = category;
    return this;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public Channel setOrderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }
}
