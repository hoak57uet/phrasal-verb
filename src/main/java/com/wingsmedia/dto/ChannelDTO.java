package com.wingsmedia.dto;

/**
 * Created by HoaPham on 8/16/17.
 */

public class ChannelDTO extends BaseDTO{
  String name;
  String link;
  String image;
  String description;

  public String getName() {
    return name;
  }

  public ChannelDTO setName(String name) {
    this.name = name;
    return this;
  }

  public String getLink() {
    return link;
  }

  public ChannelDTO setLink(String link) {
    this.link = link;
    return this;
  }

  public String getImage() {
    return image;
  }

  public ChannelDTO setImage(String image) {
    this.image = image;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ChannelDTO setDescription(String description) {
    this.description = description;
    return this;
  }
}
