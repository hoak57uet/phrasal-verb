package com.wingsmedia.service;

import com.wingsmedia.dto.CategoryDTO;
import com.wingsmedia.dto.ChannelDTO;

import java.util.List;

/**
 * Created by HoaPham on 8/16/17.
 */

public interface ITvService {
  List<ChannelDTO> getAllChannels();

  void importChannel();

  List<CategoryDTO> allCategory();
}
