package com.wingsmedia.entity.mytv;

import com.wingsmedia.entity.BaseEntity;

import org.springframework.core.annotation.Order;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * Created by HoaPham on 8/16/17.
 */

@Entity
@Table(name = "TV_category")
public class TVCategory extends BaseEntity {
  String name;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
  @OrderBy("name")
  List<Channel> channels;

  @Column(name = "is_active")
  Boolean isActive;
  @Column(name = "order_id")
  Integer orderId;

  public String getName() {
    return name;
  }

  public TVCategory setName(String name) {
    this.name = name;
    return this;
  }

  public Boolean getActive() {
    return isActive;
  }

  public TVCategory setActive(Boolean active) {
    isActive = active;
    return this;
  }

  public List<Channel> getChannels() {
    return channels;
  }

  public TVCategory setChannels(List<Channel> channels) {
    this.channels = channels;
    return this;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public TVCategory setOrderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }
}
