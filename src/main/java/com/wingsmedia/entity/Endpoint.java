package com.wingsmedia.entity;

import com.wingsmedia.constant.EndPointType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * Created by HoaPham on 7/26/17.
 */

@Entity
@Table(name = "end_point")
public class Endpoint extends BaseEntity{
  private String appId;
  @Enumerated(EnumType.STRING)
  private EndPointType endPointType;
  private String link;
  private String pagingPattern;



}
