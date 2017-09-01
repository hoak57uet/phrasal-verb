package com.wingsmedia.service;

import com.wingsmedia.dao.TvDao;
import com.wingsmedia.dto.CategoryDTO;
import com.wingsmedia.dto.ChannelDTO;
import com.wingsmedia.entity.mytv.Channel;
import com.wingsmedia.entity.mytv.TVCategory;
import com.wingsmedia.utils.MapUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HoaPham on 8/16/17.
 */

@Service
public class TVService implements ITvService {
  @Autowired
  TvDao tvDao;

  @Override
  public List<ChannelDTO> getAllChannels() {
    List<Channel> channels = tvDao.findAll();
    return MapUtils.mapList(channels, ChannelDTO.class);
  }

  @Override
  public void importChannel() {

  }

  @Override
  public List<CategoryDTO> allCategory() {
    List<TVCategory> tvCategories = tvDao.findAllCategories();
    List<CategoryDTO> categoryDTOS = new ArrayList<>();
    for (TVCategory c : tvCategories) {
      CategoryDTO dto = MapUtils.map(c, CategoryDTO.class);
      dto.setChannelDTOS(MapUtils.mapList(c.getChannels(), ChannelDTO.class));
      categoryDTOS.add(dto);
    }
    return categoryDTOS;
  }
}
