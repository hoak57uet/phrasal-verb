package com.wingsmedia.dto;

import java.util.List;

/**
 * Created by HoaPham on 8/17/17.
 */

public class CategoryDTO {
  String name;
  List<ChannelDTO> channelDTOS;

  public String getName() {
    return name;
  }

  public CategoryDTO setName(String name) {
    this.name = name;
    return this;
  }

  public List<ChannelDTO> getChannelDTOS() {
    return channelDTOS;
  }

  public CategoryDTO setChannelDTOS(List<ChannelDTO> channelDTOS) {
    this.channelDTOS = channelDTOS;
    return this;
  }
}
