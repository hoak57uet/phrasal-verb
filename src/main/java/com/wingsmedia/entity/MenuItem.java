package com.wingsmedia.entity;

import com.wingsmedia.constant.EndPointType;
import com.wingsmedia.constant.ScreenType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * Created by HoaPham on 7/31/17.
 */

@Entity
@Table(name = "menu")
public class MenuItem extends BaseEntity{
  private String name;
  @Enumerated(EnumType.STRING)
  private EndPointType type;
  private int level;
  @Enumerated(EnumType.STRING)
  private ScreenType screenType;
  private String link;
  private String icon;

  public String getName() {
    return name;
  }

  public MenuItem setName(String name) {
    this.name = name;
    return this;
  }

  public EndPointType getType() {
    return type;
  }

  public MenuItem setType(EndPointType type) {
    this.type = type;
    return this;
  }

  public int getLevel() {
    return level;
  }

  public MenuItem setLevel(int level) {
    this.level = level;
    return this;
  }

  public ScreenType getScreenType() {
    return screenType;
  }

  public MenuItem setScreenType(ScreenType screenType) {
    this.screenType = screenType;
    return this;
  }

  public String getLink() {
    return link;
  }

  public MenuItem setLink(String link) {
    this.link = link;
    return this;
  }

  public String getIcon() {
    return icon;
  }

  public MenuItem setIcon(String icon) {
    this.icon = icon;
    return this;
  }
}
