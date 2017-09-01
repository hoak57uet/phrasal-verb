package com.wingsmedia.dto;

import com.wingsmedia.constant.EndPointType;
import com.wingsmedia.constant.ScreenType;

/**
 * Created by HoaPham on 7/31/17.
 */

public class MenuDTO extends BaseDTO {
  private String name;
  private EndPointType type;
  private int level;
  private ScreenType screenType;
  private String link;
  private String icon;

  public String getName() {
    return name;
  }

  public MenuDTO setName(String name) {
    this.name = name;
    return this;
  }

  public EndPointType getType() {
    return type;
  }

  public MenuDTO setType(EndPointType type) {
    this.type = type;
    return this;
  }

  public int getLevel() {
    return level;
  }

  public MenuDTO setLevel(int level) {
    this.level = level;
    return this;
  }

  public ScreenType getScreenType() {
    return screenType;
  }

  public MenuDTO setScreenType(ScreenType screenType) {
    this.screenType = screenType;
    return this;
  }

  public String getLink() {
    return link;
  }

  public MenuDTO setLink(String link) {
    this.link = link;
    return this;
  }

  public String getIcon() {
    return icon;
  }

  public MenuDTO setIcon(String icon) {
    this.icon = icon;
    return this;
  }
}
