package com.wingsmedia.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by HoaPham on 7/31/17.
 */

public class MetaDTO extends BaseDTO {
  @JsonProperty("fb_token")
  private String fbToken;
  @JsonProperty("menu")
  List<MenuDTO> menuDTOs;
  @JsonProperty("menu_default")
  int defaultMenu;

  public String getFbToken() {
    return fbToken;
  }

  public MetaDTO setFbToken(String fbToken) {
    this.fbToken = fbToken;
    return this;
  }

  public List<MenuDTO> getMenuDTOs() {
    return menuDTOs;
  }

  public MetaDTO setMenuDTOs(List<MenuDTO> menuDTOs) {
    this.menuDTOs = menuDTOs;
    return this;
  }

  public int getDefaultMenu() {
    return defaultMenu;
  }

  public MetaDTO setDefaultMenu(int defaultMenu) {
    this.defaultMenu = defaultMenu;
    return this;
  }
}
